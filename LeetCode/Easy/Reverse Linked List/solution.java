class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode temp = curr.next; // 1. aage wala node pehle save karo
            curr.next = prev;          // 2. arrow ulta karo
            prev = curr;               // 3. prev ko aage le jao
            curr = temp;               // 4. curr ko aage le jao
        }
        return prev; // prev = new head
    }
}