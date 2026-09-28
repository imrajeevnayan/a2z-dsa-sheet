/*
3 approach se solve hoga:
1. Reverse the linked list
2. Add 1 to linked list
3. Reverse the linked list
*/

class Solution {

    // Reverse linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public Node addOne(Node head) {
        // Step 1: Reverse the linked list
        head = reverse(head);

        // Step 2: Add 1
        Node curr = head;
        int carry = 1;

        while (curr != null) {

            int sum = curr.data + carry;

            curr.data = sum % 10;
            carry = sum / 10;

            // Last node and carry is still remaining
            if (curr.next == null && carry != 0) {
                curr.next = new Node(carry);
                carry = 0;
            }

            curr = curr.next;
        }

        // Step 3: Reverse again
        head = reverse(head);

        return head;
    }
}
