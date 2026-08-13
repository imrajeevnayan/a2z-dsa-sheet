# For Python3 Platform

- Platform: GeeksforGeeks
- Language: def game_with_number(arr, n): res = [] for i in range(n-1): res.append(arr[i] ^ arr[i+1]) res.append(arr[-1]) return res
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays, Bit Magic
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/game-with-nos3123/1
- Synced: 2026-08-13T18:34:04.023Z

## Problem Description

Given an array arr[] of size n, transform it according to the following rule: For every index i from 0 to n - 2, replace arr[i] with arr[i] XOR arr[i + 1]. The last element has no next element, so it remains unchanged. Return the resulting array after performing the transformation. Examples: Input: arr[] = [10, 11, 1, 2, 3] Output : [1, 10, 3, 1, 3] Explanation: At index 0, arr[0] xor arr[1] = 1. At index 1, arr[1] xor arr[2] = 10. At index 2, arr[2] xor arr[3] = 3. At index 2, arr[3] xor arr[4] = 1. At index 4, No element is left so, it will remain as it is. New Array will be [1, 10, 3, 1, 3]. Input: arr[] = [5, 9, 7, 6] Output: [12, 14, 1, 6] Explanation: At index 0, arr[0] xor arr[1] = 12. At index 1, arr[1] xor arr[2] = 14. At index 2, arr[2] xor arr[3] = 1. At index 3, No element is left So, it will remain as it is. New Array will be [12, 14, 1, 6].

## Explanation

This solution was accepted on GeeksforGeeks using def game_with_number(arr, n): res = [] for i in range(n-1): res.append(arr[i] ^ arr[i+1]) res.append(arr[-1]) return res. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays, Bit Magic. Review the synced source file for the implementation details.
