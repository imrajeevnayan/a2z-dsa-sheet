/*
 * Platform: InterviewBit
 * Problem: Maximum Absolute Difference
 * URL: https://www.interviewbit.com/problems/maximum-absolute-difference/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-25T15:51:11.381Z
 */

int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {

            max1 = Math.max(max1, A[i] + i);
            min1 = Math.min(min1, A[i] + i);

            max2 = Math.max(max2, A[i] - i);
            min2 = Math.min(min2, A[i] - i);
        }

        return Math.max(max1 - min1, max2 - min2);
    }
}
