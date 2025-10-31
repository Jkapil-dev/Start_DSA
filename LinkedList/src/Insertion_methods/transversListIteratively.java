package Insertion_methods;

class transversListIteratively {
    public static void transversListIteratively(Node head) { //this function is used to transvers list in itretative manner
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        //  The process of traversing a singly linked list involves printing the value
        //  of each node and then going on to the next
        //   node and print that node's value also and so on, till we reach the last node in the singly linked list, whose next node points towards the null.
        //time complexity: O(n) ,n= no. of nodes in LL
        //Auxillary space: O(1)
    }


    public static void transverseListRecursevely(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data);
        if (head.next != null) {
            System.out.print("->");
        }
        transverseListRecursevely(head.next);

        // Time Complexity: O(n)
        // Auxiliary Space: O(n) because of recursive stack space.
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Insertion_methods.transversListIteratively(head);
        //transverseListRecursevely(head);
    }


}
