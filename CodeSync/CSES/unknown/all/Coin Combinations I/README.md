# Coin Combinations I

- Platform: CSES
- Language: Java
- Difficulty: Unknown
- Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Dice Combinations
- Runtime: N/A
- Memory: N/A
- Problem URL: https://cses.fi/problemset/result/18028933/
- Synced: 2026-07-21T16:25:29.514Z

## Problem Description

Submission details Task: Coin Combinations I Sender: imrajeevnayan Submission time: 2026-07-21 19:24:36 +0300 Language: Java Status: READY Result: ACCEPTED Test results test verdict time #1 ACCEPTED 0.10 s details #2 ACCEPTED 0.13 s details #3 ACCEPTED 0.10 s details #4 ACCEPTED 0.77 s details #5 ACCEPTED 0.47 s details #6 ACCEPTED 0.11 s details #7 ACCEPTED 0.12 s details #8 ACCEPTED 0.78 s details #9 ACCEPTED 0.11 s details #10 ACCEPTED 0.10 s details #11 ACCEPTED 0.74 s details #12 ACCEPTED 0.21 s details #13 ACCEPTED 0.12 s details Code import java.util.*; class Combinations { static final int MOD = 1000000007; public static void main(String[] args) { Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int x = sc.nextInt(); int[] coins = new int[n]; for (int i = 0; i < n; i++) { coins[i] = sc.nextInt(); } int[] dp = new int[x + 1]; dp[0] = 1; for (int sum = 1; sum <= x; sum++) { for (int coin : coins) { if (sum >= coin) { dp[sum] = (dp[sum] + dp[sum - coin]) % MOD; } } } System.out.println(dp[x]); sc.close(); } } SHARE CODE TO OTHERS Test details Test 1 Verdict: ACCEPTED input 1 1 1 view save correct output 1 view save user output 1 view save Test 2 Verdict: ACCEPTED input 1 1000000 1 view save correct output 1 view save user output 1 view save Test 3 Verdict: ACCEPTED input 3 2000 1 1500 1000 view save correct output 1504 view save user output 1504 view save Test 4 Verdict: ACCEPTED input 100 1000000 27 69 68 13 1 63 28 44 45 67 5... view save correct output 851260131 view save user output 851260131 view save Test 5 Verdict: ACCEPTED input 100 1000000 649304 85832 159093 841262 930... view save correct output 298815405 view save user output 298815405 view save Test 6 Verdict: ACCEPTED input 1 1 1000000 view save correct output 0 view save user output 0 view save Test 7 Verdict: ACCEPTED input 100 1000 389 101 552 795 876 269 887 10... view save correct output 834994040 view save user output 834994040 view save Test 8 Verdict: ACCEPTED input 100 1000000 999 541 97 522 78 380 993 971 ... view save correct output 991043088 view save user output 991043088 view save Test 9 Verdict: ACCEPTED input 3 9 2 3 4 view save correct output 11 view save user output 11 view save Test 10 Verdict: ACCEPTED input 1 3 27 view save correct output 0 view save user output 0 view save Test 11 Verdict: ACCEPTED input 100 1000000 5699 2607 7133 5441 7890 5120 ... view save correct output 874472994 view save user output 874472994 view save Test 12 Verdict: ACCEPTED input 100 1000000 1000000 999999 999998 999997 9... view save correct output 1 view save user output 1 view save Test 13 Verdict: ACCEPTED input 12 74057 1 2 74012 74005 74003 73999 73... view save correct output 0 view save user output 0 view save

## Explanation

This solution was accepted on CSES using Java. The detected topics are TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Dice Combinations. Review the synced source file for the implementation details.
