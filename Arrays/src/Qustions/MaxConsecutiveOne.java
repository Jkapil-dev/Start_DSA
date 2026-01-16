package DSA.Arrays.Qustions;

public class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                tempCount++;
            }else{
                count=Math.max(count,tempCount);
                tempCount=0;
            }
        }
        count = Math.max(count, tempCount);
        return count;

    }
}
