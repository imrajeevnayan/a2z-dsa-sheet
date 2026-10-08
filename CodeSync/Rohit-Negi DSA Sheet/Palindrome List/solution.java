/*
 * Platform: InterviewBit
 * Problem: Palindrome List
 * URL: https://www.interviewbit.com/problems/palindrome-list/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Linked Lists, Description, Discussion, Submissions, Hints, Kth Node From Middle 30 Minutes Easy Asked in:, 42.2%
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-08T19:29:11.416Z
 */

return 1;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode curr = A;

        // Step 1: Saare elements ko stack mein daalo
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        // Step 2: Head se start karo aur stack ke top se compare karo
        if (A == null || A.next == null) {
        // Edge case: Empty list or single node is always palindrome
public class Solution {
    public int lPalin(ListNode A) {


import java.util.Stack;
        curr = A;
        while (curr != null) {
            // Agar value match nahi hui, toh palindrome nahi hai
            if (curr.val != stack.pop()) {
                return 0;
            }
            curr = curr.next;
