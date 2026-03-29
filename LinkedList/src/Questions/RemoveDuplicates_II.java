package Questions;

public class RemoveDuplicates_II {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode behindPointer = head;
        ListNode forwardPointer = head.next;

        ListNode result = new ListNode(0);
        ListNode curr = result;

        while (behindPointer != null) {

            boolean isDuplicate = false;


            while (forwardPointer != null && behindPointer.val == forwardPointer.val) {
                isDuplicate = true;
                forwardPointer = forwardPointer.next;
            }


            if (!isDuplicate) {
                curr.next = behindPointer;
                curr = curr.next;
            }


            behindPointer = forwardPointer;

            if (forwardPointer != null) {
                forwardPointer = forwardPointer.next;
            }
        }

        curr.next = null;
        return result.next;
    }
}
