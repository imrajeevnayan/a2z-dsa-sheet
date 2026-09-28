class Solution {
    public Node kAltReverse(Node head, int k) {

        if (head == null || k <= 1) {
            return head;
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        // Reverse first k nodes
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // 'head' is now the last node of reversed part
        // Connect it to the remaining part
        head.next = curr;

        // Skip next k nodes
        count = 0;
        Node temp = curr;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        // Reverse the next k nodes
        if (temp != null) {
            temp.next = kAltReverse(temp.next, k);
        }

        return prev;
    }
}
