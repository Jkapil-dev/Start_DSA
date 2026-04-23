package DSA.Arrays.Questions;

public class SumOfDistances {
    public long[] distance(int[] nums) {
        int len = nums.length;
        long[] resultArr = new long[len];

        for(int i = 0 ; i < len ; i++){
            int sum=0;
            for(int j = 0 ; j < len ; j++){
                if(i==j)continue;
                if(nums[i]==nums[j]){
                    sum+=Math.abs(i-j);
                }
                resultArr[i]=sum;
            }
        }
        return resultArr;
    }//brute force appraoach
}
