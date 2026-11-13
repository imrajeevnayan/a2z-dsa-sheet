/*
 * Platform: InterviewBit
 * Problem: Reverse integer
 * URL: https://www.interviewbit.com/problems/reverse-integer/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Math, Description, Discussion, Submissions, Hints, Excel Column Number 23 Minutes Easy Asked in:, Next Similar Number 55 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-13T15:15:35.270Z
 */

public class Solution {
    public int reverse(int A) {
        long rev = 0;

        while (A != 0) {
            int digit = A % 10;
            rev = rev * 10 + digit;
            A /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}
