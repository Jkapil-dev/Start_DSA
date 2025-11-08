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
    static Node insertAtEnd(Node head,int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;

        return head;
    }
    static Node insertAtSpecificPosition(Node head , int pos , int data_var){
        Node newNode=new Node(data_var);
        if(pos==0){
            newNode.next=head;
            if(head!=null){
                head.prev=newNode;
            }
            return newNode;
        }

        Node temp=head;
        int count=0;
        while(temp !=null && count<pos-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("Position out of bound...");
            return head;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next==null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;
        return head;
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
        System.out.println();
        head=insertAtHead(head,1);
        System.out.print("Inserted at head :");
        display(head);
        System.out.println();
        head=insertAtEnd(head,100);
        System.out.print("Inserted at end :");
        display(head);
        System.out.println();
        System.out.print("Inserted at specific position :");
        head=insertAtSpecificPosition(head,3,123);
        display(head);
    }
}
