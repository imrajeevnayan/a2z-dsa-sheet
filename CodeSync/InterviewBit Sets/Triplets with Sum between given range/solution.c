/*
 * Platform: InterviewBit
 * Problem: Triplets with Sum between given range
 * URL: https://www.interviewbit.com/problems/374/
 * Language: C
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-09T16:17:16.471Z
 */

public class Solution {
    public int solve(String[] A) {

        double maxA = Double.MIN_VALUE;
        double maxB = Double.MIN_VALUE;
        double maxC = Double.MIN_VALUE;

        double minA = Double.MAX_VALUE;
        double minB = Double.MAX_VALUE;

        double minAB1 = Double.MAX_VALUE;
        double minAB2 = Double.MAX_VALUE;

        double minBC1 = Double.MAX_VALUE;
        double minBC2 = Double.MAX_VALUE;

        for (String s : A) {
            double x = Double.parseDouble(s);

            if (x < 2.0 / 3.0) { // Group A

                if (x > maxA) maxA = x;

                if (x < minA) {
                    minA = x;
                }

                if (x <= minAB1) {
                    minAB2 = minAB1;
                    minAB1 = x;
                } else if (x < minAB2) {
                    minAB2 = x;
                }

            } else if (x <= 1.0) { // Group B

                if (x > maxB) maxB = x;
