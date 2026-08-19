/*
 * Platform: LeetCode
 * Problem: 26
 * URL: https://leetcode.com/submissions/detail/2112598492/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 0 ms
 * Memory: 46.86 MB
 * Synced: 2026-08-19T12:32:42.035Z
 */

1public class Solution {
2    public boolean hasCycle(ListNode head) {
3    if (head == null || head.next == null) return false;
4    ListNode slow = head, fast = head;
5     while (fast != null && fast.next != null) {
6        slow = slow.next;
7        fast = fast.next.next;
8        if (slow == fast) return true;
9      }
10      return false;
11    }
12}
