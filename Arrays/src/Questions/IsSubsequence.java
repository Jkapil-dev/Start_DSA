package DSA.Arrays.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> q = new LinkedList<>();
        for(char ch : s.toCharArray()){
            q.add(ch);
        }
        for (int i = 0; i < t.length() && !q.isEmpty(); i++) {
            if(t.charAt(i)==q.peek()){
                q.remove();
            }
            if(q.isEmpty())return true;
        }
        return false;
    }
}
