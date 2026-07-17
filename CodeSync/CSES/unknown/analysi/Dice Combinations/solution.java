/*
 * Platform: CSES
 * Problem: Dice Combinations
 * URL: https://cses.fi/problemset/result/17968965/
 * Language: Java
 * Difficulty: Unknown
 * Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Dice Combinations
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-17T11:26:10.607Z
 */

import java.util.*;
 
public class DiceCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        
        // Base case: There is 1 way to get sum 0 (by doing nothing)
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            // Try all possible dice faces (1 to 6)
            for (int j = 1; j <= 6; j++) {
                if (i >= j) {
                    dp[i] = (dp[i] + dp[i - j]) % MOD;
                }
            }
        }
        
        System.out.println(dp[n]);
    }
}
