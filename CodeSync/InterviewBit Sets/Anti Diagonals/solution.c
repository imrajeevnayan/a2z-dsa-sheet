/*
 * Platform: InterviewBit
 * Problem: Anti Diagonals
 * URL: https://www.interviewbit.com/problems/anti-diagonals/
 * Language: C
 * Difficulty: Easy
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-04T05:28:31.796Z
 */

public class Solution {
    public int[][] diagonal(int[][] A) {

        int n = A.length;
        int[][] ans = new int[2 * n - 1][];

        for (int d = 0; d < 2 * n - 1; d++) {

            int row, col;

            if (d < n) {
                row = 0;
                col = d;
            } else {
                row = d - n + 1;
                col = n - 1;
            }

            int len = 0;
            int r = row, c = col;

            while (r < n && c >= 0) {
                len++;
                r++;
                c--;
            }

            ans[d] = new int[len];

            int k = 0;
            while (row < n && col >= 0) {
                ans[d][k++] = A[row][col];
                row++;
                col--;
            }
        }

        return ans;
    }
}
