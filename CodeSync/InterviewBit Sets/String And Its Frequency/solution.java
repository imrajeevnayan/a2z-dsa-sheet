/*
 * Platform: InterviewBit
 * Problem: String And Its Frequency
 * URL: https://www.interviewbit.com/problems/string-and-its-frequency/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Salutes 24 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-23T16:05:25.124Z
 */

public String solve(String A) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : A.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[26];

        // Append character and its frequency
        // in order of first occurrence
        for (char ch : A.toCharArray()) {
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
