package cyclicSort;

public class DuplicateNumber {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct_index = nums[i] - 1;
                if (nums[i] != nums[correct_index]) {
                    int temp = nums[i];
                    nums[i] = nums[correct_index];
                    nums[correct_index] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }
        return -1;
    }
}
