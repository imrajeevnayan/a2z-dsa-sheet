/*
 * Platform: CSES
 * Problem: Coin Combinations I
 * URL: https://cses.fi/problemset/result/18028933/
 * Language: Java
 * Difficulty: Unknown
 * Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Dice Combinations
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-21T16:24:41.991Z
 */

import java.util.*;
 class Combinations {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[x + 1];
        dp[0] = 1;
        for (int sum = 1; sum <= x; sum++) {
            for (int coin : coins) {
                if (sum >= coin) {
                    dp[sum] = (dp[sum] + dp[sum - coin]) % MOD;
                }
            }
        }
        System.out.println(dp[x]);
        sc.close();
    }
}
