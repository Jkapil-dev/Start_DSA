package cyclicSort;

public class MissingNumber {

    public static void main(String[] args){
        int[] nums={2,1,4,0};

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int expected_sum= (nums.length*(nums.length+1))/2;
        System.out.println(expected_sum-sum);
    }
}
