package DSA.Arrays.Qustions;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minProd=nums[0];
        int result=nums[0];
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];

            if (n < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(n, maxProd * n);
            minProd = Math.min(n, minProd * n);

            result = Math.max(result, maxProd);
        }

        return result;
    }
}
