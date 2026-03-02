package DSA.Arrays.Questions;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prod=1;
        int nonZeroProd=1;
        int zeroCount=0;
        for(int num : nums){
            if(num==0) {
                prod=0;
                zeroCount++;
                if(zeroCount>1){
                    return answer;
                }
                continue;
            }
            nonZeroProd*=num;

        }
        for(int i = 0 ; i < nums.length;i++){
            if(prod==0 & nums[i]!=0){
                answer[i]=0;
            }else if(nums[i]==0){
                answer[i]=nonZeroProd;
            }else{
                answer[i]=nonZeroProd/nums[i];
            }
        }
        return answer;
    }
}
