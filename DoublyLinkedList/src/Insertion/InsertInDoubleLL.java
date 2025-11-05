package Insertion;

public class InsertInDoubleLL {

    static Node insertAtHead(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        return newNode;
    }

    static void display(Node head){
            Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<->");

            }
            temp=temp.next;

        }
    }
    public static void main(String[] args){
        Node head =new Node(40);

        head.next= new Node(50);
        head.next.prev =head;

        head.next.next=new Node(60);
        head.next.next.prev=head.next;

        head.next.next.next=new Node(70);
        head.next.next.next.prev=head.next;
        System.out.println("Before Insertion:");
        display(head);
        head=insertAtHead(head,1);
        System.out.println("After Insertion:");
        display(head);
    }
}
