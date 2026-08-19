/*
 * Platform: LeetCode
 * Problem: 26
 * URL: https://leetcode.com/submissions/detail/2112585513/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 0 ms
 * Memory: 44.11 MB
 * Synced: 2026-08-19T12:34:06.568Z
 */

1
2class Solution {
3    public ListNode reverseList(ListNode head) {
4        ListNode prev=null;
5        ListNode curr=head;
6        while(curr!=null){
7            ListNode temp=curr.next;
8            curr.next=prev;
9            prev=curr;
10            curr=temp;
11        }
12        return prev;
13    }
14}
