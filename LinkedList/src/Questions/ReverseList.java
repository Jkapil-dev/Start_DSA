package Questions;

public class ReverseList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        k = k % len;
        if (k == 0)
            return head;
        k = len - k;

        ListNode breakPointer = head;
        for (int i = 1; i < k && breakPointer != null; i++) {
            breakPointer = breakPointer.next;
        }

        curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        ListNode newHead = breakPointer.next;
        curr.next = head;
        breakPointer.next = null;

        return newHead;

    }
}
