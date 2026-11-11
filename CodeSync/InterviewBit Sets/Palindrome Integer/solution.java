/*
 * Platform: InterviewBit
 * Problem: Palindrome Integer
 * URL: https://www.interviewbit.com/problems/palindrome-integer/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Math, Description, Discussion, Submissions, Hints, Excel Column Title 41 Minutes Easy Asked in:, Reverse integer 28 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-11T17:34:42.821Z
 */

public class Solution {
    public int isPalindrome(int A) {

        if (A < 0) {
            return 0;
        }

        int original = A;
        long reverse = 0;

        while (A > 0) {
            reverse = reverse * 10 + (A % 10);
            A /= 10;
        }

        return reverse == original ? 1 : 0;
    }
}
