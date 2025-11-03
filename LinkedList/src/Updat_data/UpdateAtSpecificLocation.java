package Updat_data;

import deletion.Node;

class LNode{
    int data;
    LNode next;
    LNode(int data_var){
        this.data=data_var;
        this.next=null;
    }
}
public class UpdateAtSpecificLocation {

    static void print(LNode head){
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null){
                System.out.print("->");
            }
            head=head.next;
        }
        System.out.println();
    }

    static LNode updateValueAtPostion(LNode head ,int pos, int newValue ){
        if(head==null){
            System.out.println("List is empty");
            return null;
        }
        if(pos==1){
            head.data=newValue;
            return head;
        }
        LNode current=head;
        int count=0;
        while(current!=null && count<pos ){
            current=current.next;
            count++;
        }
        if(current==null){
            System.out.println("Invalid position or position out of bounds.");
            return null;
        }
        current.data = newValue;
        return head;
    }



   public static void main(String[] args) {
        LNode head = new LNode(5);
        head.next = new LNode(10);
       head.next.next=new LNode(15);
       head.next.next.next=new LNode(20);
       System.out.println("Before Updating: ");
       print(head);
       head=updateValueAtPostion(head,6,666);
       System.out.println("After Updating :");
       print(head);
    }
}
