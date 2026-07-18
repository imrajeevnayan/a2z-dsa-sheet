/*
 * Platform: CSES
 * Problem: Minimizing Coins
 * URL: https://cses.fi/problemset/result/17973760/
 * Language: Java
 * Difficulty: Unknown
 * Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Dice Combinations
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-17T18:28:08.231Z
 */

import java.util.*;
 
public class coinChange {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int x = sc.nextInt();
 
        int[] coins = new int[n];
 
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
 
        int INF = Integer.MAX_VALUE / 2;
 
        int[] dp = new int[x + 1];
        Arrays.fill(dp, INF);
 
        dp[0] = 0;
 
        for (int amount = 1; amount <= x; amount++) {
 
            for (int coin : coins) {
 
                if (coin <= amount) {
                    dp[amount] = Math.min(dp[amount],
                            dp[amount - coin] + 1);
                }
            }
        }
 
        if (dp[x] == INF)
            System.out.println(-1);
        else
            System.out.println(dp[x]);
    }
}
