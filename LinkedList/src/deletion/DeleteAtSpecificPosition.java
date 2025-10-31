package deletion;

public class DeleteAtSpecificPosition {

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
    static Node deleteAtSpecificLocation(Node head ,int pos ){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return null;
        } else if (pos==1) {
            head=head.next;
            return head;
        }
        Node prev=null;
        for(int i=0;i<pos-1;i++){
            prev=current;
            current=current.next;
        }
        prev.next=current.next; // this line is the deltion line
        return head;

    }
     public static void main(String[] args){
         Node head=new Node(5);
         head.next=new Node(10);
         head.next.next=new Node(20);
         head.next.next.next=new Node(30);
         System.out.println("Before deletion: ");
         print(head);
         head=deleteAtSpecificLocation(head,2);
         System.out.println("After deletion: ");
         print(head);

     }
}
