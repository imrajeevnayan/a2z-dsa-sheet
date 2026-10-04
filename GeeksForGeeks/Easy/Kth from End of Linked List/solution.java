class Solution {
    public int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;

        // Step 1: Fast ko k steps aage bhejo
        for (int i = 0; i < k; i++) {
            // Agar fast null ho gaya → k > list length → invalid
            if (fast == null) return -1;
            fast = fast.next;
        }

        // Step 2: Dono saath chalao jab tak fast null na ho jaye
        // Jab fast end cross karega → slow exactly kth-from-end pe hoga
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Slow ab kth node from end pe hai
        return slow.data;
    }
}