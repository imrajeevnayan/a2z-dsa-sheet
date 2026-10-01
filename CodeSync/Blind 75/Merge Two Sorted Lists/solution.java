/*
 * Platform: InterviewBit
 * Problem: Merge Two Sorted Lists
 * URL: https://www.interviewbit.com/problems/merge-two-sorted-lists/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Linked Lists, Description, Discussion, Submissions, Hints, Kth Node From Middle 30 Minutes Easy Asked in:, Palindrome List 47 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-01T18:02:43.400Z
 */

// Chhoti value ko merged list mein add karo
            if (A.val <= B.val) {
                currentNode.next = A;
                A = A.next;
            } else {
                currentNode.next = B;
                B = B.next;
        while (A != null && B != null) {

        // Jab tak dono lists mein nodes available hain
        ListNode currentNode = dummyNode;

        // merged list ke end ko track karega
        // Dummy node banaya taaki first node handle karna easy ho
        ListNode dummyNode = new ListNode(0);

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
public class Solution {
/**
