package deletion;


public class DeleteAtHead {
     static ListNode deleteNodeAtHead(ListNode head){
        ListNode temp=head;
        head=head.next;
        temp=null;
        return head;
    }
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

    public static void main(String[] args) {
        ListNode head=new ListNode(5);
        head.next=new ListNode(10);
        head.next.next=new ListNode(20);
        System.out.println("Before deletion: ");
        print(head);
        head=deleteNodeAtHead(head);
        System.out.println("After deletion: ");
        print(head);

    }
}
