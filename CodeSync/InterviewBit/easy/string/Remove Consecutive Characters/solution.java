/*
 * Platform: InterviewBit
 * Problem: Remove Consecutive Characters
 * URL: https://www.interviewbit.com/problems/remove-consecutive-characters/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Convert to Palindrome 40 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T10:01:41.550Z
 */

public class Solution {
    public String solve(String A, int B) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < A.length(); i++) {
            if (A.charAt(i) == A.charAt(i - 1))count++;
            else {
                if (count != B) {
                    while (count-- > 0) {
                        sb.append(A.charAt(i - 1));
                    }
                }
                count = 1;
            }
        }
        if (count != B) {
            while (count-- > 0) {
                sb.append(A.charAt(A.length() - 1));
            }
        }
        return sb.toString();
    }
}
