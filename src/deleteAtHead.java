public class deleteAtHead {

    class ListNode {
        int data;
        ListNode next;
        ListNode (int data) {
            this.data = data;
        }

    }

    public ListNode deleteAtHead(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode r = head.next;

        head = head.next;
        r = null;
        return head;
    }

}
