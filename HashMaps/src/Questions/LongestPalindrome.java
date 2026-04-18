package Questions;

import java.util.Arrays;
import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        s = s.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1;

        return length;
    }
    int longetPallendrome(String str){
        HashMap<Character , Integer> map = new HashMap<>();

        for(char element : str.toCharArray()){
            map.put(element , map.getOrDefault(element , 1)+1);
        }
        int length=0;
        boolean isOdd=false;
        for(int count : map.values()){
            if(count%2==0){
                length+=count;
            }else{
                isOdd=true;
            }
        }
        if(isOdd)return length+1;
        return length;
    }
}
