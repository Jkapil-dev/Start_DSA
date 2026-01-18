package cyclicSort;

import java.util.ArrayList;

public class FirstMissingPositive {
   public static int sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] ;
            if (nums[i] != nums[correctIndex] && nums[i] < nums.length) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
       int answer=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]>0 && nums[j] != j){
                answer=j;
            }
        }
        return answer;
    }
}
