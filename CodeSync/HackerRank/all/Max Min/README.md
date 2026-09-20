# Max Min

- Platform: HackerRank
- Language: Java 15
- Difficulty: Hard
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.hackerrank.com/challenges/angry-children/problem
- Synced: 2026-09-20T11:19:38.202Z

## Problem Description

You will be given a list of integers, , and a single integer . You must create an array of length from elements of such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as Where: - max denotes the largest integer in - min denotes the smallest integer in Example Pick any two elements, say . Testing for all pairs, the solution provides the minimum unfairness. Note: Integers in may not be unique. Function Description Complete the maxMin function in the editor below. maxMin has the following parameter(s): int k: the number of elements to select int arr[n]:: an array of integers Returns int: the minimum possible unfairness Input Format The first line contains an integer , the number of elements in array . The second line contains an integer . Each of the next lines contains an integer where . Constraints Sample Input 0 7 3 10 100 300 200 1000 20 30 Sample Output 0 20 Explanation 0 Here ; selecting the integers , unfairness equals max(10,20,30) - min(10,20,30) = 30 - 10 = 20 Sample Input 1 10 4 1 2 3 4 10 20 30 40 100 200 Sample Output 1 3 Explanation 1 Here ; selecting the integers , unfairness equals max(1,2,3,4) - min(1,2,3,4) = 4 - 1 = 3 Sample Input 2 5 2 1 2 1 2 1 Sample Output 2 0 Explanation 2 Here . or give the minimum unfairness of .

## Explanation

This solution was accepted on HackerRank using Java 15. Review the synced source file for the implementation details.
