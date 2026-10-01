/*
 * Platform: InterviewBit
 * Problem: Partition List
 * URL: https://www.interviewbit.com/problems/partition-list/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Linked Lists, Description, Discussion, Submissions, Hints, Even Reverse 46 Minutes Medium Asked in:, Kth Node From Middle 30 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-01T18:01:19.185Z
 */

ListNode smallerTail = smallerHead;
        ListNode greaterOrEqualTail = greaterOrEqualHead;

        while (head != null) {

            if (head.val < B) {
                smallerTail.next = head;
                smallerTail = smallerTail.next;
            } else {
                greaterOrEqualTail.next = head;
                greaterOrEqualTail = greaterOrEqualTail.next;
            }

            head = head.next;
        }

        greaterOrEqualTail.next = null;
        smallerTail.next = greaterOrEqualHead.next;

        ListNode smallerHead = new ListNode(0);
        ListNode greaterOrEqualHead = new ListNode(0);
        return smallerHead.next;
    }
}
