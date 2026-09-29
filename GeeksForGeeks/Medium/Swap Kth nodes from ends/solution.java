class Solution {
    public Node swapKth(Node head, int k) {

        // Empty list
        if (head == null) {
            return head;
        }

        // Find k-th node from the beginning
        Node first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;

            // k is greater than length
            if (first == null) {
                return head;
            }
        }

        // fast starts from k-th node
        Node fast = first;

        // second starts from head
        // It will reach k-th node from the end
        Node second = head;

        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }

        // Swap the data of both nodes
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return head;
    }
}
