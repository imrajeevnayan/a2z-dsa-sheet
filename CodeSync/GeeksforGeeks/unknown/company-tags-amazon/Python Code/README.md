# Python Code

- Platform: GeeksforGeeks
- Language: class Solution: def reverseSubArray(self,arr,l,r): left = l-1 # left index right = r-1 # right index while left < right: arr[left],arr[right] = arr[right],arr[left] left += 1 right -= 1 return arr
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-sub-array5620/1
- Synced: 2026-07-07T16:04:58.429Z

## Problem Description

Given an array arr, you need to reverse a subarray of that array. The range of this subarray is given by indices l and r (1-based indexing). Examples: Input: arr[] = [1, 2, 3, 4, 5, 6, 7], l = 2, r = 4 Output: [1, 4, 3, 2, 5, 6, 7] Explanation: After reversing the elements in range 2 to 4 (2, 3, 4), modified array is 1, 4, 3, 2, 5, 6, 7. Input: arr[] = [1, 6, 7, 4], l = 1, r = 4 Output: [4, 7, 6, 1] Explanation: After reversing the elements in range 1 to 4 (1, 6, 7, 4), modified array is 4, 7, 6, 1. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 106 1 ≤ l ≤ r ≤ arr.size()

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def reverseSubArray(self,arr,l,r): left = l-1 # left index right = r-1 # right index while left < right: arr[left],arr[right] = arr[right],arr[left] left += 1 right -= 1 return arr. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Data Structures, Related Articles. Review the synced source file for the implementation details.
