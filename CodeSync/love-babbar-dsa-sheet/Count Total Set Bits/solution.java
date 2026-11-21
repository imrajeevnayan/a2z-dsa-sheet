/*
 * Platform: InterviewBit
 * Problem: Count Total Set Bits
 * URL: https://www.interviewbit.com/problems/count-total-set-bits/
 * Language: Java
 * Difficulty: Hard
 * Topics: Programming, Bit Manipulation, Description, Discussion, Submissions, Hints, OR equal XOR 19 Minutes Very Easy Asked in:, Maximize matrix XOR 23 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-21T11:38:24.093Z
 */

public class Solution {

    static final int MOD = 1000000007;

    public int solve(int A) {
        return (int)(countSetBits(A) % MOD);
    }

    private long countSetBits(long n) {
        if (n == 0) return 0;

        int x = largestPowerOf2(n);

        long bitsTill2x = (long)x * (1L << (x - 1));
        long msbBits = n - (1L << x) + 1;
        long remaining = n - (1L << x);

        return (bitsTill2x + msbBits + countSetBits(remaining)) % MOD;
    }

    private int largestPowerOf2(long n) {
        int x = 0;
        while ((1L << (x + 1)) <= n) {
            x++;
        }
        return x;
    }
}
