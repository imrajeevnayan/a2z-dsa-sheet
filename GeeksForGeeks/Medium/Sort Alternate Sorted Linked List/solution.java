class Solution {

    public Node sort(Node head) {
        if (head == null || head.next == null)
            return head;

        // Split into two lists
        Node a = head;
        Node b = head.next;

        Node headA = a;
        Node headB = b;

        while (a != null && b != null) {
            if (a.next != null)
                a.next = a.next.next;
            a = a.next;

            if (b.next != null)
                b.next = b.next.next;
            b = b.next;
        }

        // Reverse second list
        headB = reverse(headB);

        // Merge two sorted lists
        return merge(headA, headB);
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null)
            tail.next = a;
        else
            tail.next = b;

        return dummy.next;
    }
}