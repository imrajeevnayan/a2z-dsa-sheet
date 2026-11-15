/*
 * Platform: InterviewBit
 * Problem: Different Bits Sum Pairwise
 * URL: https://www.interviewbit.com/problems/different-bits-sum-pairwise/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Bit Manipulation, Description, Discussion, Submissions, Hints, OR equal XOR 19 Minutes Very Easy Asked in:, Maximize matrix XOR 23 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-15T17:14:35.893Z
 */

public int cntBits(ArrayList<Integer> A) {

        long mod = 1000000007L;
        long ans = 0;
        int n = A.size();

        for (int bit = 0; bit < 32; bit++) {

            long count1 = 0;

            for (int num : A) {
                if ((num & (1 << bit)) != 0) {
                    count1++;
                }
            }

            long count0 = n - count1;

            ans = (ans + (2L * count1 * count0) % mod) % mod;
        }

        return (int) ans;
    }
}
