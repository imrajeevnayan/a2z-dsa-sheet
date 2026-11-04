/*
 * Platform: InterviewBit
 * Problem: Anti Diagonals
 * URL: https://www.interviewbit.com/problems/anti-diagonals/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-04T05:27:27.862Z
 */

import java.util.*;

public class Solution {
    public int[][] diagonal(int[][] A) {

        int n = A.length;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int d = 0; d < 2 * n - 1; d++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.get(i + j).add(A[i][j]);
            }
        }

        int[][] ans = new int[2 * n - 1][];

        for (int i = 0; i < 2 * n - 1; i++) {
            ans[i] = new int[list.get(i).size()];

            for (int j = 0; j < list.get(i).size(); j++) {
                ans[i][j] = list.get(i).get(j);
            }
        }

        return ans;
    }
}
