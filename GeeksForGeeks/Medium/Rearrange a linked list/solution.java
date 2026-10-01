class Solution {
    public void rearrangeEvenOdd(Node head) {
        if (head == null || head.next == null) return;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
    }
}
