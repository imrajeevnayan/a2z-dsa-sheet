# Easy sum

- Platform: HackerRank
- Language: Java 15
- Difficulty: Hard
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.hackerrank.com/challenges/easy-sum/problem
- Synced: 2026-09-16T12:38:45.716Z

## Problem Description

Little Kevin had never heard the word 'Infinitum'. So he asked his mentor to explain the word to him. His mentor knew that 'Infinitum' is a very large number. To show him how big Infinitum can be, his mentor gave him a challenge: to sum the numbers from 1 up to N. The sum started to get really large and was out of long long int range. And so the lesson was clear. Now his mentor introduced him to the concept of mod and asked him to retain only the remainder instead of the big number. And then, he gave him a formula to compute: Input Format The first line contains T, the number of test cases. T lines follow, each containing 2 space separated integers N m Output Format Print the result on new line corresponding to each test case. Constraint 1 ≤ T ≤ 1000 1 ≤ N ≤ 109 1 ≤ m ≤ 109 Sample Input 3 10 5 10 3 5 5 Sample Output 20 10 10 Explanation Case 1: N = 10 m = 5, 1%5 + 2%5 + 3%5 + 4%5 + 5%5 + 6%5 + 7%5 + 8%5 + 9%5 + 10%5 = 20. Similar explanation follows for Case 2 and 3.

## Explanation

This solution was accepted on HackerRank using Java 15. Review the synced source file for the implementation details.
