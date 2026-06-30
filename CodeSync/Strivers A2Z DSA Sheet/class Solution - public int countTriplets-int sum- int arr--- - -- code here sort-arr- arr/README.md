# class Solution { public: int countTriplets(int sum, int arr[]) { // code here sort(arr, arr.size)/// issuue for size of array please fix that int count = 0; int n = sizeof(arr) / sizeof(arr[0]) - 2; for(int index = 0; index < n; index++){ int left = index+1; int right = sizeof(arr) / sizeof(arr[0]) - 1; while(left < right){ int curr_sum = arr[index]+arr[left]+arr[right]; if(curr_sum < sum){ count += (right-left); left++; }else{ right--; } } } return count; }};

- Platform: GeeksforGeeks
- Language: from typing import List class Solution: def countTriplets(self, arr: List[int], target: int) -> int: # Step 1: Sort the array to enable two-pointer technique arr.sort() n = len(arr) ans = 0 # Step 2: Fix the first element one by one for i in range(n - 2): l, r = i + 1, n - 1 # two pointers # Step 3: Use two-pointer approach for the remaining array while l < r: curr_sum = arr[i] + arr[l] + arr[r] if curr_sum < target: # If sum is smaller than target, then all elements between l and r # with arr[i] will also form valid triplets. ans += (r - l) l += 1 # move left pointer forward else: # If sum is too large, move right pointer backward r -= 1 return ans
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonSAP Labs, Company Tags, Amazon, SAP Labs, Topic Tags, two-pointer-algorithm, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
- Synced: 2026-06-30T06:02:21.281Z

## Problem Description

Given an array arr[] of distinct integers and a value sum, find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum. Examples : Input: sum = 2, arr[] = [-2, 0, 1, 3] Output: 2 Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). Input: sum = 12, arr[] = [5, 1, 3, 4, 7] Output: 4 Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4). Constraints: 1 ≤ sum ≤ 105 3 ≤ arr.size() ≤ 103 -103 ≤ arr[i] ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using from typing import List class Solution: def countTriplets(self, arr: List[int], target: int) -> int: # Step 1: Sort the array to enable two-pointer technique arr.sort() n = len(arr) ans = 0 # Step 2: Fix the first element one by one for i in range(n - 2): l, r = i + 1, n - 1 # two pointers # Step 3: Use two-pointer approach for the remaining array while l < r: curr_sum = arr[i] + arr[l] + arr[r] if curr_sum < target: # If sum is smaller than target, then all elements between l and r # with arr[i] will also form valid triplets. ans += (r - l) l += 1 # move left pointer forward else: # If sum is too large, move right pointer backward r -= 1 return ans. The detected topics are Expected Complexities, Company Tags AmazonSAP Labs, Company Tags, Amazon, SAP Labs, Topic Tags, two-pointer-algorithm, Arrays. Review the synced source file for the implementation details.
