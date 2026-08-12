# Check if array contains contiguous integers

- Platform: GeeksforGeeks
- Language: #{ # Driver Code Starts #Initial Template for Python 3 # } Driver Code Ends #User function Template for python3 import heapq class Solution: def areElementsContiguous (self, arr): heapq.heapify(arr) num1 = heapq.heappop(arr) while arr: num2 = heapq.heappop(arr) if num2 - num1 > 1: return False num1 = num2 return True
- Difficulty: Unknown
- Topics: Company Tags Amazon Topic Tags Related Articles, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Hash, Sorting
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/check-if-array-contains-contiguous-integers-with-duplicates-allowed2046/1
- Synced: 2026-08-12T11:31:55.949Z

## Problem Description

Given an array arr. Determine if all the unique elements are contiguous integers. Example: Input: arr[] = [5, 2, 3, 6, 4, 4, 6, 6] Output: Yes Explanation: The elements of array form a contiguous set of integers which is [2, 3, 4, 5, 6] so the output is "Yes". Input: arr[] = [10, 14, 10, 12, 12, 13, 15] Output: No Explanation: The elements of array form a contiguous set of integers which is [10, 12, 13, 14, 15] so the output is "No". Expected Time Complexity: O(nlog(n)). Expected Auxiliary Space: O(n). Constraints: 1 ≤ arr.size() ≤105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using #{ # Driver Code Starts #Initial Template for Python 3 # } Driver Code Ends #User function Template for python3 import heapq class Solution: def areElementsContiguous (self, arr): heapq.heapify(arr) num1 = heapq.heappop(arr) while arr: num2 = heapq.heappop(arr) if num2 - num1 > 1: return False num1 = num2 return True. The detected topics are Company Tags Amazon Topic Tags Related Articles, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Hash, Sorting. Review the synced source file for the implementation details.
