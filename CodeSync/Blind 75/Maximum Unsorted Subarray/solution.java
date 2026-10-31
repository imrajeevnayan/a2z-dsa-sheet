/*
 * Platform: InterviewBit
 * Problem: Maximum Unsorted Subarray
 * URL: https://www.interviewbit.com/problems/maximum-unsorted-subarray/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-31T06:57:13.004Z
 */

}

        // Already sorted
        if (s == n - 1) {
            return new int[]{-1};
        }

        int e = n - 1;
        while (e > 0 && A[e] >= A[e - 1]) {
            e--;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = s; i <= e; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        while (s > 0 && A[s - 1] > min) {
            s--;
        }

        while (e < n - 1 && A[e + 1] < max) {
        while (s < n - 1 && A[s] <= A[s + 1]) {
            s++;

        int s = 0;
    public int[] subUnsort(int[] A) {
        int n = A.length;
public class Solution {
