package DSA.Arrays.Questions;

import java.util.Arrays;

public class RemoveDuplicatesI {
    public int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        int differentCount=0;
        expectedNums[0]=nums[0];
        int j=1 , i=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            nums[++differentCount]=nums[j];
            i=j;
            j++;
        }

        return differentCount+1;
    }
}
