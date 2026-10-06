class Solution {
    public static Node reverseBetween(int a, int b, Node head) {
        // Edge case: no reversal needed
        if (head == null || a == b) return head;

        // Step 1: Dummy node banao
        Node dummy = new Node(0);
        dummy.next = head;

        // Step 2: prev ko a-1 position tak le jao
        Node prev = dummy;
        for (int i = 1; i < a; i++) {
            prev = prev.next;
        }

        // Step 3: curr = reversal start point
        Node curr = prev.next;

        // Step 4: b-a times head-insertion reversal
        for (int i = 0; i < b - a; i++) {
            Node nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
}