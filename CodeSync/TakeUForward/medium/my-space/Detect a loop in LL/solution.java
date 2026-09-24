/*
 * Platform: TakeUForward
 * Problem: Detect a loop in LL
 * URL: https://takeuforward.org/practice/dsa/detect-a-loop-in-ll
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T20:02:15.649Z
 */

// Slow 1 step

        while (fast != null && fast.next != null) {
    fast = head;
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
class Solution {
            slow = slow.next;

            // Fast 2 steps
            fast = fast.next.next;
