/*
 * Platform: InterviewBit
 * Problem: String And Its Frequency
 * URL: https://www.interviewbit.com/problems/string-and-its-frequency/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Salutes 24 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-23T16:07:22.441Z
 */

int[] freq = new int[26];

    public String solve(String A) {
public class Solution {

        for (int i = 0; i < A.length(); i++) {
            freq[A.charAt(i) - 'a']++;
        }

        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            int idx = ch - 'a';

            if (!visited[idx]) {
                sb.append(ch);
                sb.append(freq[idx]);
                visited[idx] = true;
            }
        }

        return sb.toString();
    }
}
