/*
 * Platform: InterviewBit
 * Problem: Pascal Triangle
 * URL: https://www.interviewbit.com/problems/pascal-triangle/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-20T04:32:44.737Z
 */

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < A; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ans.get(i - 1).get(j - 1)
                           + ans.get(i - 1).get(j));
                }
            }

            ans.add(row);
        }

        return ans;
    }
}
