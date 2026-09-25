/*
 * Platform: TakeUForward
 * Problem: Detect a loop in LL
 * URL: https://takeuforward.org/practice/dsa/detect-a-loop-in-ll
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T20:22:11.319Z
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while (fast != null && fast.next != null) {
            // Slow 1 step
            slow = slow.next;
            // Fast 2 steps
            fast = fast.next.next;

            // Agar dono mil gaye to cycle hai
            if (slow == fast)  return true;
