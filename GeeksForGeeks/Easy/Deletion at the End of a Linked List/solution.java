class Solution {
    public Node removeLastNode(Node head) {
        // Edge case: empty list ya single node
        if (head == null || head.next == null) return null;

        // Second last node tak jaao
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        // Last node ko unlink karo
        curr.next = null;

        return head;
    }
}