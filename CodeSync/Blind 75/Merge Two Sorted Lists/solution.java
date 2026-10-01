/*
 * Platform: InterviewBit
 * Problem: Merge Two Sorted Lists
 * URL: https://www.interviewbit.com/problems/merge-two-sorted-lists/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Linked Lists, Description, Discussion, Submissions, Hints, Kth Node From Middle 30 Minutes Easy Asked in:, Palindrome List 47 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-01T18:03:40.836Z
 */

// Agar second list empty hai, first list return karo
        if (B == null) {
            return A;
        }

        // Chhote node ko current node banao
        if (A.val <= B.val) {

            // A ke next ko recursively merge karo
            A.next = mergeTwoLists(A.next, B);

        // Agar first list empty hai, second list return karo
        if (A == null) return B;

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
public class Solution {
            return A;

        } else {

            // B ke next ko recursively merge karo
            B.next = mergeTwoLists(A, B.next);

            return B;
        }
