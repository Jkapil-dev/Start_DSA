package cyclicSort;

import java.util.ArrayList;

class NumberNotPresent {

    static  void sort(int[] nums){
        int i=0;
       while(i<nums.length){
            int correct_index = nums[i] - 1;
            if(nums[i] != nums[correct_index]){
                int temp=nums[i];
                nums[i]=nums[correct_index];
                nums[correct_index]=temp;
            }else{
                i++;
            }
        }
    }
    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> answer=new ArrayList<>();
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                answer.add(i+1);
            }
        }
        return answer;
    }
}