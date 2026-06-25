package DSA.Arrays.Questions;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i=0 , j=nums.length-1;
        int idx=nums.length-1;
        while(i<=j && idx >= 0){
            if(nums[i]*nums[i] >= nums[j]*nums[j]){
                result[idx]=nums[i]*nums[i];
                i++;
                idx--;
                continue;
            }
            result[idx]=nums[j]*nums[j];
            j--;
            idx--;
        }
        return result;
    }
}
