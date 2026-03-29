package Questions;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        if(head.next==null)return head;
        ListNode result = new ListNode(head.val);
        head=head.next;
        ListNode current = result;
        while(head!=null){
            if(head.val>current.val){
                current.next=new ListNode(head.val);
                current=current.next;
            }

            head=head.next;
        }
        return result;
    }
}
