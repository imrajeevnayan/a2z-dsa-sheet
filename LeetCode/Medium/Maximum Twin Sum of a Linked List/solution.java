class Solution {
        // Helper function to reverse linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }
    public int pairSum(ListNode head) {
        // Step 1: Middle node dhundo
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Second half ko reverse karo (slow ab middle par hai)
        ListNode secondHalf = reverseList(slow);
        
        // Step 3: Dono halves ko compare karke max sum nikalo
        ListNode firstHalf = head;
        int maxSum = 0;
        
        while (secondHalf != null) {
            int currentSum = firstHalf.val + secondHalf.val;
            maxSum = Math.max(maxSum, currentSum);
            
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return maxSum;
    }    
}