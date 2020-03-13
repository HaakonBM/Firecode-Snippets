import java.util.List;

public class deleteAtTail {

    class ListNode {
        int data;
        ListNode next;
        ListNode (int data) {
            this.data = data;
        }

    }

    public ListNode deletaAtTail(ListNode head) {
        if(head == null || head.next == null) {
            head = null;
            return head;
        }
        ListNode current = head;

        while (current.next.next != null) {
             current = current.next;
        }
        current.next = null;
        return head;
    }


}
