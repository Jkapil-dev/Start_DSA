package deletion;

public class DeleteAtEnd {
   static  Node deleteAtEnd(Node head){
       Node temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
       temp.next=null;
        return head;
    }
    static void print(Node head){
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
        Node head=new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(20);
        System.out.println("Before deletion: ");
        print(head);
        head=deleteAtEnd(head);
        System.out.println("After deletion: ");
        print(head);
    }
}
