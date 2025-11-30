package creating;
class Node{
    public int data;
    public  Node next;
    public Node(int data_var){
        this.data=data_var;
        this.next=null;
    }
}
public class MyStack {
   private Node top;
   MyStack(){
       this.top=null;
   }
   void push(int data){
       Node temp = new Node(data);
       temp.next=top;
       top=temp;
   }
   int pop(){
       if(top==null){
           System.out.println("Stack underflow....");
           return -1;
       }
       Node temp=top;
       top=top.next;
       int val=temp.data;

       temp=null;
       return val;
   }
   int peek(){
       if(top==null){
           System.out.println("Stack is empty");
           return -1;
       }
       return top.data;
   }
   boolean isEmpty(){
       return top==null;
   }
}
