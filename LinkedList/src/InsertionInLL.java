public class InsertionInLL {

      static Node insertAtHead(Node head,int data_var){ //function to insert node at beginning

        Node newNode=new Node(data_var);
        newNode.next=head;
        return newNode;

        //To insert a node at the head of a linked list, create a new node,
        // set its next to the current head, and update the head to this new node.
        // It’s quick because only a few pointers are changed.
    }
    static void printList(Node head){
          Node current=head;
          while(current != null){
              System.out.print(current.data);
              if(current.next != null){
                  System.out.print("->");
              }
              current=current.next;
          }
        System.out.println();
    }

    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Before Insertion:");
        printList(head);
        head =insertAtHead(head,5);//inserting element at head
        System.out.println("After Insertion:");
        printList(head);

    }
}
