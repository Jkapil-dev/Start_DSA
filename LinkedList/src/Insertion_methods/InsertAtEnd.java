package Insertion_methods;

public class InsertAtEnd {

    static Node insertAtEnd(Node head, int data_var){
        Node newNode =new Node(data_var);//create new node
        if(head ==null){
            return newNode;
        }
        Node last = head;//if you use directly head in loop then after endin of loop head pointer will remain at last
                          //and not at start , it will cause issue for
                            //  further operations ,that's why we are using temporary pointer

        while(last.next != null){ //takes to last node
            last=last.next;
        }

        last.next=newNode; // change pointer of current last node to new
                            // node and new node becomes last node

        return head;

        //Time Complexity: O(n)
        //Auxiliary Space: O(1)
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Befor insertion;");
        printList(head);
        head = insertAtEnd(head,50);
        System.out.println("After insertion;");
        printList(head);

    }
}
