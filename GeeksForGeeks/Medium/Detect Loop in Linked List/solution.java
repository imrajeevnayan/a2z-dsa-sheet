class Solution {
    public boolean detectLoop(Node head) {
       Node slow=head,fast=head;
       
       while (fast != null && fast.next != null) {
            slow = slow.next;      // 1 step
            fast = fast.next.next; // 2 steps

         if (slow == fast) return true; // mil gaye = cycle hai
       }
      return false; // fast null tak pahunch gaya = no cycle
        
    }
}