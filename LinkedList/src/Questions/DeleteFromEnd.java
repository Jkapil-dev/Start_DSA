package Questions;

import deletion.ListNode;

public class DeleteFromEnd {
    ListNode deleteAtSpecificLocation(ListNode head ,int pos ){
        ListNode current=head;
        if(head==null){

            return null;
        } else if (pos==1) {
            head=head.next;
            return head;
        }
        ListNode prev=null;
        for(int i=0;i<pos-1;i++){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=1;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        curr=head;
        n=len-n;

        head=deleteAtSpecificLocation(head,n);

        return head;
    }

}
