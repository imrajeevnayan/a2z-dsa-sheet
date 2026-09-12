# Max Product K Sized Subarray

- Platform: GeeksforGeeks
- Language: def findMaxProduct(self, arr, k): from functools import reduce from operator import mul n = len(arr) if n < k: return 0 curr_prod = max_prod = reduce(mul, arr[:k]) for i in range(k, n): curr_prod = curr_prod // arr[i - k] * arr[i] if curr_prod > max_prod: max_prod = curr_prod return max_prod
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles, Largest Product Subarray Size K
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/largest-product/1
- Synced: 2026-09-12T12:09:17.030Z

## Problem Description

Given an array arr and an integer k. You have to find the maximum product of k contiguous elements in the array. Examples: Input: arr[] = [1, 2, 3, 4] and k = 2 Output: 12 Explanation: The sub-array of size 2 will be 3 4 and the product is 12. Input: arr[] = [1, 6, 7, 8] and k = 3 Output: 336 Explanation: The sub-array of size 3 will be 6 7 8 and the product is 336. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ k ≤ 900 1 ≤ arr[i] ≤ 102

## Explanation

This solution was accepted on GeeksforGeeks using def findMaxProduct(self, arr, k): from functools import reduce from operator import mul n = len(arr) if n < k: return 0 curr_prod = max_prod = reduce(mul, arr[:k]) for i in range(k, n): curr_prod = curr_prod // arr[i - k] * arr[i] if curr_prod > max_prod: max_prod = curr_prod return max_prod. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles, Largest Product Subarray Size K. Review the synced source file for the implementation details.
