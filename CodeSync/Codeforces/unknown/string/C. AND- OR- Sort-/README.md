# C. AND, OR, Sort!

- Platform: Codeforces
- Language: Java 21 64bit
- Difficulty: Unknown
- Topics: greedy, strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://codeforces.com/problemset/problem/2266/C
- Synced: 2026-09-24T04:33:32.900Z

## Problem Description

C. AND, OR, Sort!time limit per test2 secondsmemory limit per test256 megabytesinputstandard inputoutputstandard outputYou are given a binary string∗∗^{\text{∗}} sss of length nnn.You may perform the following operation any number of times (possibly zero): choose an integer iii (1≤i≤n1≤i≤n1 \le i \le n), and replace sisis_i with either the bitwise AND or the bitwise OR of s1,s2,…,sis1,s2,…,sis_1, s_2, \ldots, s_i. Note that the bitwise AND or bitwise OR of a single element is equal to the element itself.Your goal is to make sss sorted in non-decreasing order††^{\text{†}}.Find the minimum number of operations required to sort sss in non-decreasing order.∗∗^{\text{∗}}A binary string only contains characters 00\texttt{0} and 11\texttt{1}.††^{\text{†}}If sss is in non-decreasing order, then s1≤s2≤…≤sns1≤s2≤…≤sns_1 \leq s_2 \leq \ldots \leq s_n.InputThe first line contains a single integer ttt (1≤t≤1041≤t≤1041 \le t \le 10^4) — the number of test cases.The first line of each test case contains a single integer nnn (2≤n≤2⋅1052≤n≤2⋅1052 \le n \le 2 \cdot 10^5) — the length of the binary string sss.The second line of each test case contains the binary string sss of length nnn. Each character of sss is either 0 or 1.It is guaranteed that the sum of nnn over all test cases does not exceed 2⋅1052⋅1052 \cdot 10^5.OutputFor each test case, print a single integer — the minimum number of operations required to sort sss in non-decreasing order.ExampleInputCopy640011410005010008010011017010101070111101OutputCopy031231NoteIn the first test case, the string is already sorted, so no operations are required.In the second test case, we can use bitwise OR to change the last three characters to 1, obtaining 1111 in 333 operations.

## Explanation

This solution was accepted on Codeforces using Java 21 64bit. The detected topics are greedy, strings. Review the synced source file for the implementation details.
