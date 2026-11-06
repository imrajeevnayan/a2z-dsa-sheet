class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);

        // Case 1: Empty list
        if (head == null) {
            return newNode;
        }

        // Case 2: Insert at beginning
        if (x <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node curr = head;

        // Find insertion position
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }

        // Insert after curr
        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;

        return head;
    }
}
