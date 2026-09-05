/*
 * Platform: LeetCode
 * Problem: 0
 * URL: https://leetcode.com/submissions/detail/2131938642/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 0 ms
 * Memory: 44.08 MB
 * Synced: 2026-09-05T17:01:56.502Z
 */

1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if(head==null || head.next==null ||k==0) return head;
4
5        int n=1;
6        ListNode tail=head;
7        while(tail.next!=null){
8            tail=tail.next;
9            n++;
10        }
11        k=k%n;
12        if(k==0)return head;
13        // circular banooo
14        tail.next=head;
15        int steps=n-k;
16        ListNode newTail=head;
17        for(int i=1;i<steps;i++) newTail=newTail.next;
18        ListNode newHead=newTail.next;
19        newTail.next=null;
20        
21        return newHead;
22            
23    }
24}
