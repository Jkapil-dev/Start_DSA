package DSA.Arrays.Questions;

public class AlternateString {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()<=0 && word2.length()<=0){
            return new String();
        }
        int strOneLen=word1.length() , strTwoLen=word2.length();
        if(strOneLen==0)return word2;
        if(strTwoLen==0)return word1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(strOneLen,strTwoLen); i++) {
            if(i<=strOneLen-1) {
                result.append(word1.charAt(i));
            }
            if (i<=strTwoLen-1){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
