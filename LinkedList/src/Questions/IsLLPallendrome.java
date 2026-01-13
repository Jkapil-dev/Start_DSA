package Questions;

import java.util.Stack;
public class IsLLPallendrome {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st= new Stack<>();
        if(head==null)return true;
        ListNode slowPtr=head;
        ListNode fastPtr=head;

        while(fastPtr != null && fastPtr.next != null){
            st.push(slowPtr.val);
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        if(fastPtr!=null && fastPtr.next==null){
            slowPtr=slowPtr.next;

        }
        while(slowPtr != null && !st.isEmpty()){

            if(slowPtr.val==st.peek()){
                st.pop();
            }else{
                return false;
            }
            slowPtr = slowPtr.next;
        }
        return st.isEmpty();


    }



}
