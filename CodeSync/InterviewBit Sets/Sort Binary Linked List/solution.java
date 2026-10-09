/*
 * Platform: InterviewBit
 * Problem: Sort Binary Linked List
 * URL: https://www.interviewbit.com/problems/sort-binary-linked-list/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Linked Lists, Description, Discussion, Submissions, Hints, Even Reverse 46 Minutes Medium Asked in:, Kth Node From Middle 30 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-09T19:12:11.215Z
 */

ListNode curr = A;
        
        // Single pass separation
        while (curr != null) {
            if (curr.val == 0) {
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            } else {
                oneTail.next = curr;
                oneTail = oneTail.next;
            }
            curr = curr.next;
        }
        
        // Connect the two lists
        zeroTail.next = oneDummy.next;
        
        // Important: Terminate the list to prevent cycles
        // If there were no 1s, oneTail is still at dummy, 
        // but zeroTail.next points to oneDummy.next which is null. Safe.
        // If there were 1s, we must ensure the last node points to null.
        oneTail.next = null; 
        
        return zeroDummy.next;
    }
}
