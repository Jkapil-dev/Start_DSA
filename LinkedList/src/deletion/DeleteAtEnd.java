package deletion;

public class DeleteAtEnd {
   static ListNode deleteAtEnd(ListNode head){
       ListNode temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
       temp.next=null;
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
    public static void main(String[] args){
        ListNode head=new ListNode(5);
        head.next=new ListNode(10);
        head.next.next=new ListNode(20);
        System.out.println("Before deletion: ");
        print(head);
        head=deleteAtEnd(head);
        System.out.println("After deletion: ");
        print(head);
    }
}
