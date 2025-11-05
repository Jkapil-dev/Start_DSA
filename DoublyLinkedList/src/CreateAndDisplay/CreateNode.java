package CreatingAndDisplay;
class Node{
    int data;
    Node prev;
    Node next;
    Node (){}
    Node(int data_var){
        this.data=data_var;
        prev=null;
        next=null;
    }
}
public class CreateNode {
    public static void main(String[] args){
        Node head =new Node(40);

        head.next= new Node(50);
        head.next.prev =head;

        head.next.next=new Node(60);
        head.next.next.prev=head.next;

        head.next.next.next=new Node(70);
        head.next.next.next.prev=head.next;

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<->");

            }
            temp=temp.next;

        }
    }
}
