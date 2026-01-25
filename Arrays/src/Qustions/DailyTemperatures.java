package DSA.Arrays.Qustions;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        for (int i = 0; i < len - 1; i++) {
            int j = i + 1;
            int count=1;
            while (j < len && temperatures[j] <= temperatures[i]) {
                count++;
                j++;
            }

            if (j == len)count = 0;
            result[i] = count;

        }
        result[len - 1] = 0;
        return result;
    }
}
