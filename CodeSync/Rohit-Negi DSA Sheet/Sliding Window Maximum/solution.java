/*
 * Platform: InterviewBit
 * Problem: Sliding Window Maximum
 * URL: https://www.interviewbit.com/problems/sliding-window-maximum/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Stacks And Queues, Description, Discussion, Submissions, Hints, Hotel Service 51 Minutes Medium Asked in:, Evaluate Expression 32 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-30T17:10:41.477Z
 */

return new int[] { max };
        }

        int[] result = new int[n - B + 1];
        Deque<Integer> dq = new LinkedList<Integer>();

        int k = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - B) {
                dq.pollFirst();
            }
            }
            for (int i = 1; i < n; i++) {
                max = Math.max(max, A[i]);
            int max = A[0];
        // If B > n, return max of whole array
        if (B >= n) {
        }
            return new int[0];
        if (n == 0) {
        int n = A.length;

            // Remove smaller elements from the back
            while (!dq.isEmpty() && A[dq.peekLast()] <= A[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
