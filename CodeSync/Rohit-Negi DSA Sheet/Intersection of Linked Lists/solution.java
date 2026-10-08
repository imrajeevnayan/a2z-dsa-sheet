/*
 * Platform: InterviewBit
 * Problem: Intersection of Linked Lists
 * URL: https://www.interviewbit.com/problems/intersection-of-linked-lists/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Linked Lists, Description, Discussion, Submissions, Hints, Kth Node From Middle 30 Minutes Easy Asked in:, 49.5%
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-08T18:18:56.657Z
 */

public ListNode getIntersectionNode(ListNode a, ListNode b) {
        // Edge case: Agar koi ek list empty hai
        if (a == null || b == null) return null;
        
        ListNode ptrA = a;
        ListNode ptrB = b;
        
        // Jab tak dono pointers same node par nahi aa jate
        while (ptrA != ptrB) {
            // Agar ptrA end par pahunch gaya, toh use list B ke head par bhej do
            // Nahi toh bas next par badhao
            ptrA = (ptrA == null) ? b : ptrA.next;
            
            // Agar ptrB end par pahunch gaya, toh use list A ke head par bhej do
            // Nahi toh bas next par badhao
            ptrB = (ptrB == null) ? a : ptrB.next;
public class Solution {
        }
        
        // Ya toh wo intersection node hoga, ya agar intersection nahi hai toh null hoga
        return ptrA;
    }
}
