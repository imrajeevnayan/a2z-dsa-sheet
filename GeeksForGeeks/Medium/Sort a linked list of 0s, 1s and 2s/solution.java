class Solution {
    public Node segregate(Node head) {

        // Dummy nodes for three separate lists:
        // 0-list, 1-list and 2-list
        Node zero = new Node(0);
        Node one = new Node(0);
        Node two = new Node(0);

        // Pointers to keep track of the last node
        // in each respective list
        Node z = zero;
        Node o = one;
        Node t = two;

        // Traverse the original linked list
        Node curr = head;

        while (curr != null) {

            // If current node contains 0,
            // add it to the 0-list
            if (curr.data == 0) {
                z.next = curr;
                z = z.next;
            }

            // If current node contains 1,
            // add it to the 1-list
            else if (curr.data == 1) {
                o.next = curr;
                o = o.next;
            }

            // Otherwise, current node contains 2,
            // so add it to the 2-list
            else {
                t.next = curr;
                t = t.next;
            }

            // Move to the next node in original list
            curr = curr.next;
        }

        // Connect 0-list with 1-list if it exists.
        // Otherwise, directly connect 0-list with 2-list.
        z.next = (one.next != null) ? one.next : two.next;

        // Connect the 1-list with the 2-list
        o.next = two.next;

        // End the final list
        // to avoid unwanted/cyclic links
        t.next = null;

        // Return the actual head of the sorted list.
        // zero is a dummy node, so actual head is zero.next
        return zero.next;
    }
}
