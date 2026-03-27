package deletion;

public class DeleteAtSpecificPosition {

    static void print(ListNode head){
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null){
                System.out.print("->");
            }
            head=head.next;
        }
        System.out.println();
    }
    static ListNode deleteAtSpecificLocation(ListNode head , int pos ){
        ListNode current=head;
        if(head==null){
            System.out.println("List is empty");
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
        prev.next=current.next; // this line is the deltion line
        return head;

    }
     public static void main(String[] args){
         ListNode head=new ListNode(5);
         head.next=new ListNode(10);
         head.next.next=new ListNode(20);
         head.next.next.next=new ListNode(30);
         System.out.println("Before deletion: ");
         print(head);
         head=deleteAtSpecificLocation(head,2);
         System.out.println("After deletion: ");
         print(head);

     }
}
