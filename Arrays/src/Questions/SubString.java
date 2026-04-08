//package DSA.Arrays.Questions;
//
//public class SubString {
//    public String gcdOfStrings(String str1, String str2) {
//        int strTwoSum=0;
//        int strTwoLen=str2.length();
//        for (int i = 0; i < strTwoLen; i++) {
//            strTwoSum+=str2.charAt(i);
//        }
//        for (int j = 0; j < str1.length(); j+=strTwoLen-1) {
//            int strOneSum=0;
//            for (int i = j; i < strTwoLen; i++) {
//                strTwoSum+=str2.charAt(i);
//            }
//            if(strTwoSum%strOneSum!=0){
//                return "";
//            }
//
//        }
//        return commonStr;
//
//    }
//
//    public static void main(String[] args) {
//        char strOne='A' , strTwo = 'B';
//
//        System.out.println(strTwo+strOne);
//    }
//}
