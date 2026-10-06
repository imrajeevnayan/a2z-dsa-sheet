class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Edge case: no reversal needed
        if (head == null || left == right) return head;
        
        // Step 1: Dummy node banao
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Step 2: prev ko left-1 position tak le jao
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        
        // Step 3: curr = reversal start point
        ListNode curr = prev.next;
        
        // Step 4: right-left times reversal karo
        for (int i = 0; i < right - left; i++) {
            // curr.next ko nikalo
            ListNode nextNode = curr.next;
            
            // curr.next ko nextNode ke aage connect karo
            curr.next = nextNode.next;
            
            // nextNode ko prev ke aage daalo (front insertion)
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        
        return dummy.next;
    }
}