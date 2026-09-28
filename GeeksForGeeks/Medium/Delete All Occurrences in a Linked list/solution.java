class Solution {

    public Node deleteAllOccurances(Node head, int x) {

        // Remove x from the beginning
        while (head != null && head.data == x) {
            head = head.next;
        }

        // Remove x from the remaining list
        Node curr = head;

        while (curr != null && curr.next != null) {

            if (curr.next.data == x) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
