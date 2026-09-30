class Solution {
    Node deleteNode(Node head, int x) {

        // Agar head hi delete karna hai
        if (x == 1) return head.next;
        
        Node curr = head;

        // x-th node ke previous node tak jao
        for (int i = 1; i < x - 1; i++) {
            curr = curr.next;
        }
        // x-th node ko delete karo
        curr.next = curr.next.next;

        return head;
    }
}
