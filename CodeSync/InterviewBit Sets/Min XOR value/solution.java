/*
 * Platform: InterviewBit
 * Problem: Min XOR value
 * URL: https://www.interviewbit.com/problems/min-xor-value/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Bit Manipulation, Description, Discussion, Submissions, Hints, Count Total Set Bits 66 Minutes Hard Asked in:, OR equal XOR 19 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-26T15:53:35.320Z
 */

import java.util.Arrays;

public class Solution {
    public int findMinXor(int[] A) {

        Arrays.sort(A);

        int minXor = Integer.MAX_VALUE;

        for (int i = 1; i < A.length; i++) {
            minXor = Math.min(minXor, A[i] ^ A[i - 1]);
        }

        return minXor;
    }
}
