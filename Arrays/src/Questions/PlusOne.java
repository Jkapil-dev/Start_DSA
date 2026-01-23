package DSA.Arrays.Questions;

public class PlusOne {
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
