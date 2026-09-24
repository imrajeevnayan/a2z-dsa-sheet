/*
 * Platform: TakeUForward
 * Problem: Detect a loop in LL
 * URL: https://takeuforward.org/practice/dsa/detect-a-loop-in-ll
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T20:02:08.398Z
 */

// Slow 1 step
        ListNode fast = head;

        while (fast != null && fast.next != null) {

        // Fast pointer 2 steps chalega
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
class Solution {
            slow = slow.next;
