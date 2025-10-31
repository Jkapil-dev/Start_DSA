package deletion;


public class DeleteAtHead {
     static Node deleteNodeAtHead(Node head){
        Node temp=head;
        head=head.next;
        temp=null;
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

    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(20);
        System.out.println("Before deletion: ");
        print(head);
        head=deleteNodeAtHead(head);
        System.out.println("After deletion: ");
        print(head);

    }
}
