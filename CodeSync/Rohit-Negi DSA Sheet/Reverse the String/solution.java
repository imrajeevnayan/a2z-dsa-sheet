/*
 * Platform: InterviewBit
 * Problem: Reverse the String
 * URL: https://www.interviewbit.com/problems/reverse-the-string/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Convert to Palindrome 40 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-02T16:07:05.689Z
 */

public class Solution {
    public String solve(String A) {
        String[] words = A.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);

            if (i != 0) {
 ans.append(" ");
            
        }

        return ans.toString();
    }
}
