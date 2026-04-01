package Questions;

public class DeleteMddleElement {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        int len=0;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        curr=head;
        for(int i = 0 ; i < (len/2) ; i++){
            curr=curr.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
        return head;
    }

}
