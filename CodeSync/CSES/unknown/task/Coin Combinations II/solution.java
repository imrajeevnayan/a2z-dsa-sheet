/*
 * Platform: CSES
 * Problem: Coin Combinations II
 * URL: https://cses.fi/problemset/result/18038718/
 * Language: Java
 * Difficulty: Unknown
 * Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Dice Combinations
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-22T08:12:50.465Z
 */

import java.util.Scanner;
 
public class CombinationsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
 
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
 
        int MOD = 1_000_000_007;
        int[] dp = new int[x + 1];
        
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= x; j++) {
                dp[j] = (dp[j] + dp[j - coin]) % MOD;
            }
        }
        System.out.println(dp[x]);
        sc.close();
    }
}
