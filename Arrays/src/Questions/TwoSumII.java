package DSA.Arrays.Questions;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2)
            return new int[] { 1, 2 };
        int[] result = new int[2];
        int backPointer = 0;
        int frontPointer = numbers.length - 1;
        while (backPointer < frontPointer) {
            if (numbers[backPointer] + numbers[frontPointer] == target) {
                result[0] = backPointer + 1;
                result[1] = frontPointer + 1;
                return result;
            }
            if (numbers[backPointer] + numbers[frontPointer] > target) {
                frontPointer--;
            }
            if (numbers[backPointer] + numbers[frontPointer] < target) {
                backPointer++;
            }
        }
        return result;
    }
}
