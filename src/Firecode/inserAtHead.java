package Firecode;

public class inserAtHead {

    class ListNode {
        int data;
        ListNode next;
        ListNode (int data) {
            this.data = data;
        }
    }

    public ListNode insertAtHead (ListNode head, int data) {
        ListNode newHead = new ListNode(data);
        if (head == null) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
}
