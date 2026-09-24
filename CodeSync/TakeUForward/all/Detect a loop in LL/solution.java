/*
 * Platform: TakeUForward
 * Problem: Detect a loop in LL
 * URL: https://takeuforward.org/practice/dsa/detect-a-loop-in-ll
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T20:02:18.780Z
 */

// Slow 1 step

        while (fast != null && fast.next != null) {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head,fast = head;
class Solution {
            slow = slow.next;

            // Fast 2 steps
            fast = fast.next.next;
