package DSA.Arrays.Questions;

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

    public static class PlusOne {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            if(digits[len-1]<9){
                digits[len-1]+=1;
                return digits;
            }
            int carry=0;

            for(int i=len-1;i>=0;i--){
                if(digits[i]<9){
                    digits[i]+=1;
                    return digits;
                }
                digits[i]=0;
            }

            int[] result = new int[len+1];
            result[0]=1;
            return result;
        }
    }
}
