class Solution {
    public Node rotate(Node head, int k) {
        // Edge cases: Empty list, single node, or k=0
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Length calculate karo aur tail node dhundo
        int len = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Step 2: Effective rotation nikalo (agar k > len ho toh)
        k = k % len;

        // Agar k=0 bacha, toh koi rotation nahi chahiye
        if (k == 0) {
            return head;
        }

        // Step 3: New tail dhundo (k-th node par ruk jao)
        // Left rotation mein pehle k nodes alag hote hain
        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        // Step 4: Pointers adjust karo
        Node newHead = newTail.next;  // (k+1)th node naya head banega
        newTail.next = null;          // Purana connection tod do
        tail.next = head;             // Tail ko purane head se jod do

        return newHead;
    }
}