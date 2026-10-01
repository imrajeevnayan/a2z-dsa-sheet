class Solution {
    public Node findIntersection(Node head1, Node head2) {

        // Head2 ke saare values Set mein daal do
        HashSet<Integer> set = new HashSet<>();

        Node curr = head2;

        while (curr != null) {
            set.add(curr.data);
            curr = curr.next;
        }

        // Answer list banane ke liye dummy node
        Node dummy = new Node(-1);
        Node tail = dummy;

        // Head1 ko original order mein traverse karo
        curr = head1;

        while (curr != null) {

            // Agar head1 ka data head2 mein bhi present hai
            if (set.contains(curr.data)) {

                // New node bana ke answer mein add karo
                tail.next = new Node(curr.data);
                tail = tail.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}
