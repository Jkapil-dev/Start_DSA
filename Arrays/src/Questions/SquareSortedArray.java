package DSA.Arrays.Questions;

public class SquareSortedArray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;


            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }


            nums[j + 1] = key;
        }
        return nums;

    }

    public int[] sortedSquaresSolution2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int idx = len - 1;
        int[] result = new int[len];
        while (left <= right) {
            if (nums[left] > nums[right]) {
                result[idx] = nums[left];
                left++;
                idx--;
            } else {
                result[idx] = nums[right];
                right--;
                idx--;
            }
        }
        return result;

    }
}
``