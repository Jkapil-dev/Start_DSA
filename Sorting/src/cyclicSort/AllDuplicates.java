package cyclicSort;
import java.util.ArrayList;

public class AllDuplicates {
    static public ArrayList<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        ArrayList<Integer> answer=new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) {
                answer.add(nums[j]);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] nums={2,1,3,4,2,1,5};
        System.out.println(findDuplicates(nums));
    }
}
