package Deletion;


public class DeletionInDoublyLL {
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("<->");

            }
            temp = temp.next;

        }
    }

    static Node deleteAtHead(Node head){
        if(head==null){
            System.out.println("List is empty...");
            return null;
        }
        if(head.next==null) return null;
        head=head.next;
        head.prev=null;
        return head;
    }
    static Node deleteAtEnd(Node head){
        if(head==null){
            System.out.println("List is empty...");
        }
        if (head.next == null) {
            return null;
        }

        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;

    }
    static Node deleteAtSpecificPosition(Node head,int pos){
        if (head == null){
            return head;
        }

        Node curr = head;

        // traverse to the node at the given position
        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }

        if (curr == null){
            // position exceeds list length, no deletion
            return head;
        }

        // if the node to delete is not the first node
        // update previous node's next
        if (curr.prev != null)
            curr.prev.next = curr.next;

        // if the node to delete is not the last node
        // update next node's prev
        if (curr.next != null)
            curr.next.prev = curr.prev;

        // if deleting the head, move head pointer to next node
        if (head == curr)
            head = curr.next;

        curr = null;
        return head;

    }

    public static void main(String[] args) {
        Node head =new Node(40);

        head.next= new Node(50);
        head.next.prev =head;

        head.next.next=new Node(60);
        head.next.next.prev=head.next;

        head.next.next.next=new Node(70);
        head.next.next.next.prev=head.next;
        head=deleteAtSpecificPosition(head,2);
        display(head);
    }
}
