/*
 * Platform: InterviewBit
 * Problem: Power Of Two Integers
 * URL: https://www.interviewbit.com/problems/power-of-two-integers/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Math, Description, Discussion, Submissions, Hints, Excel Column Number 23 Minutes Easy Asked in:, Next Similar Number 55 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-09T16:54:05.533Z
 */

public class Solution {
    public int isPower(int A) {

        if (A == 1) {
            return 1;
        }

        for (int p = 2; p <= 31; p++) {

            double root = Math.pow(A, 1.0 / p);
            int base = (int)Math.round(root);

            long val = 1;

            for (int i = 0; i < p; i++) {
                val *= base;
                if (val > A) {
                    break;
                }
            }

            if (val == A) {
                return 1;
            }
        }

        return 0;
    }
}
