package Questions;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
       if(head==null || head.next==null)return  head ;
       ListNode sortedList = new ListNode(Integer.MIN_VALUE) ;
       ListNode curr = head ;
       while(curr.next!=null){
           sortedList=insertInList(curr,sortedList);
       }

       return sortedList;

    }
    ListNode insertInList(ListNode node , ListNode sortedList){
        ListNode curr = sortedList;
       while(curr.next != null && curr.val < node.val){
            curr=curr.next;
        }
       curr.next=node;
       return curr;
    }
}
