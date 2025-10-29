public class InsertAtSpecificPosition {

    static Node insertAtSpecificPosition(Node head,int pos,int value){
        if(pos<1){
            return head;
        }
        if(pos ==1){
            Node newNode=new Node(value);
            newNode.next=head;
            return newNode;
        }
        Node curr = head;
        for(int i=0; i<pos -1 && curr != null ;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        Node newNode=new Node(value);

        newNode.next=curr.next;
        curr.next=newNode;

        return head;
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
    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Befor insertion;");
        printList(head);
        int val = 3, pos = 3;
        head = insertAtSpecificPosition(head, pos, val);
        System.out.println("After insertion;");
        printList(head);

    }
}
