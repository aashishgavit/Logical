package DSA;

public class S {

    // Custom ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Floyd's Cycle Detection Algorithm
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {
                return true;          // cycle found
            }
        }

        return false;                 // no cycle
    }

    // Main method for testing
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Creating cycle: 4 -> 2
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head)); // true
    }
}