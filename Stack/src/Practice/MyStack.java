package Practice;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MyStack{
    Node top;
    MyStack(){
        top.next=null;
    }
    void push(int val){
        Node temp = new Node(val);
        temp.next=top;
        top=temp;
    }
    int pop(){
        if(top==null){
            System.out.println("Stack underflow.....");
            return -1;
        }
        Node temp = top;
        int val = temp.data;
        top=top.next;
        temp=null;
        return val;
    }
    int peek(){
        if(top==null){
            System.out.println("Stack underflow.....");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
}