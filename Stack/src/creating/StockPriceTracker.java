package creating;

public class StockPriceTracker {
    static class Node{
        int price;
        Node next;
        Node(int price){
            this.price=price;
            this.next=null;
        }
    }
    Node top=null;
    void record(int price){
        Node newNode=new Node(price);
        newNode.next=top;
        top=newNode;
    }
    int remove(){
        if(top==null){
            System.out.println("Stack is empty...");
            return -1;
        }
        int removedPrice=top.price;
        top=top.next;
        return removedPrice;
    }
    int latest(){
        if(top==null){
            System.out.println("No records!");
            return -1;
        }
        return top.price;
    }
    boolean isempty(){
        return top==null;
    }

    public static void main(String[] args){
        StockPriceTracker tracker=new StockPriceTracker();
        tracker.record(100);
        tracker.record(200);
        tracker.record(400);

        System.out.println("Latest Price: "+tracker.latest());
        System.out.println("Remove Price: "+tracker.remove());
        System.out.println("Latest Price: "+tracker.latest());
        System.out.println("Is Empty: "+tracker.isempty());
    }
}
