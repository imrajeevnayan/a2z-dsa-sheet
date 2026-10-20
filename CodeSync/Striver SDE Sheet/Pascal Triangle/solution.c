/*
 * Platform: InterviewBit
 * Problem: Pascal Triangle
 * URL: https://www.interviewbit.com/problems/pascal-triangle/
 * Language: C
 * Difficulty: Easy
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-20T04:33:10.866Z
 */

public class Solution {
    public int[][] solve(int A) {

        int[][] ans = new int[A][];

        for (int i = 0; i < A; i++) {

            ans[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
                }
            }
        }

        return ans;
    }
}
