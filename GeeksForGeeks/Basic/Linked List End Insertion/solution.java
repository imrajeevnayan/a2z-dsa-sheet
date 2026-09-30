class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);

        // Empty linked list
        if (head == null) return newNode;
        
        // Last node tak jao
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        // New node ko end mein attach karo
        curr.next = newNode;

        return head;
    }
}
