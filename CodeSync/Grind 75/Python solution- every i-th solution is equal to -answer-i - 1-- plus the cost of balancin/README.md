# Python solution, every i-th solution is equal to `answer[i - 1]` plus the cost of balancing element `arr[i]` to the new median `arr[i - 1]` (for even length arrays either middle element works):

- Platform: GeeksforGeeks
- Language: def optimalArray(self, arr): n = len(arr) ans = [0] * n for i in range(1, n): ans[i] = ans[i - 1] + arr[i] - arr[i // 2] return ans
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Sorting, Data Structures, Algorithms, Related Articles, Optimal Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/optimal-array--170647/1
- Synced: 2026-06-19T03:51:05.267Z

## Problem Description

Given a sorted array arr[]. For each i(0 ≤ i ≤ n-1), make all the elements of the array from index 0 to i equal, using the minimum number of operations. In one operation you either increase or decrease the array element by 1. Return an array that contains the minimum number of operations for each i, to accomplish the above task. Note: For each index i, consider the original array without applying modifications made for previous indices. Try to solve the problem using O(1) extra space (excluding the resultant array). Examples : Input: arr[] = [1, 6, 9, 12] Output: [0, 5, 8, 14] Explanation: For i = 0, prefix [1] already has all equal elements, so operations = 0. For i = 1, make [1, 6] equal to 4, operations = |1 - 4| + |6 - 4| = 5. For i = 2, make [1, 6, 9] equal to 6, operations = |1 - 6| + |6 - 6| + |9 - 6| = 8. For i = 3, make [1, 6, 9, 12] equal to 8, operations = 7 + 2 + 1 + 4 = 14 Input: arr[] = [1, 1, 1, 7, 7, 10, 19] Output: [0, 0, 0, 6, 12, 21, 33] Explanation: For i = 0, prefix [1] already has equal elements, so operations = 0. For i = 1, prefix [1, 1] already has equal elements, so operations = 0. For i = 2, prefix [1, 1, 1] already has equal elements, so operations = 0. For i = 3, make [1, 1, 1, 7] equal to 1, operations = 6. For i = 4, make [1, 1, 1, 7, 7] equal to 1, operations = 12. For i = 5, make [1, 1, 1, 7, 7, 10] equal to 5, operations = 21. For i = 6, make [1, 1, 1, 7, 7, 10, 19] equal to 7, operations = 33. Constraints: 1 ≤ arr.size() ≤ 105 -104 ≤ arr[i] ≤ 104 Sum of n over all test case does not exceed 106.

## Explanation

This solution was accepted on GeeksforGeeks using def optimalArray(self, arr): n = len(arr) ans = [0] * n for i in range(1, n): ans[i] = ans[i - 1] + arr[i] - arr[i // 2] return ans. The detected topics are Expected Complexities, Topic Tags, Arrays, Sorting, Data Structures, Algorithms, Related Articles, Optimal Array. Review the synced source file for the implementation details.
