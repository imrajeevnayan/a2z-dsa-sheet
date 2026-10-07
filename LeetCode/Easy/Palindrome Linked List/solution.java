class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        
        // Pass 1: saari values stack mein push karo
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        
        // Pass 2: aage se chalo, stack se pop (peeche se) — compare
        curr = head;
        while (curr != null) {
            if (curr.val != stack.pop()) return false;
            curr = curr.next;
        }
        return true;
    }
}