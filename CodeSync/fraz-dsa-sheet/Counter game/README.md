# Counter game

- Platform: HackerRank
- Language: Java 15
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.hackerrank.com/challenges/counter-game/problem
- Synced: 2026-09-20T11:24:11.450Z

## Problem Description

Louise and Richard have developed a numbers game. They pick a number and check to see if it is a power of . If it is, they divide it by . If not, they reduce it by the next lower number which is a power of . Whoever reduces the number to wins the game. Louise always starts. Given an initial value, determine who wins the game. Example It's Louise's turn first. She determines that is not a power of . The next lower power of is , so she subtracts that from and passes to Richard. is a power of , so Richard divides it by and passes to Louise. Likewise, is a power so she divides it by and reaches . She wins the game. Update If they initially set counter to , Richard wins. Louise cannot make a move so she loses. Function Description Complete the counterGame function in the editor below. counterGame has the following parameter(s): int n: the initial game counter value Returns string: either Richard or Louise Input Format The first line contains an integer , the number of testcases. Each of the next lines contains an integer , the initial value for each game. Constraints Sample Input 0 1 6 Sample Output 0 Richard Explanation 0 is not a power of so Louise reduces it by the largest power of less than :. is a power of so Richard divides by to get and wins the game.

## Explanation

This solution was accepted on HackerRank using Java 15. Review the synced source file for the implementation details.
