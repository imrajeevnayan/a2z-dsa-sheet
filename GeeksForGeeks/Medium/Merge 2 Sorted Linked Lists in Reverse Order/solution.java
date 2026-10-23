class Solution {
    public Node mergeResult(Node head1, Node head2) {

        Node result = null;

        while (head1 != null && head2 != null) {

            Node temp;

            if (head1.data <= head2.data) {
                temp = head1;
                head1 = head1.next;
            } else {
                temp = head2;
                head2 = head2.next;
            }

            temp.next = result;
            result = temp;
        }

        while (head1 != null) {
            Node temp = head1;
            head1 = head1.next;

            temp.next = result;
            result = temp;
        }

        while (head2 != null) {
            Node temp = head2;
            head2 = head2.next;

            temp.next = result;
            result = temp;
        }

        return result;
    }
}