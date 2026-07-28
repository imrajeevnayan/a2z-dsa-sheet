# // code here int start=0, end=0, n=arr.size(), mid; int i=0; while(i<n) { start=max(arr[i],start); end+=arr[i]; i++; } while(start<=end) { mid=start+(end-start)/2; int sum=0, count=1; for(int i=0; i<n; i++) { sum+=arr[i]; if(sum>mid) { count++; sum=arr[i]; } } if(count<=k) end=mid-1; else start=mid+1; } return start;

- Platform: GeeksforGeeks
- Language: class Solution: def splitArray(self, arr, k): # code here n = len(arr) low = max(arr) high = sum(arr) ans = -1 while low <= high: mid = (low+high)//2 sub_array = 1 curr_sum = 0 for num in arr: if curr_sum + num > mid: curr_sum = num sub_array += 1 else: curr_sum += num if sub_array <= k: ans = mid high = mid - 1 else: low = mid + 1 return ans
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Google, Company Tags, Google, Topic Tags, Arrays, Binary Search, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/split-array-largest-sum--141634/1
- Synced: 2026-07-28T09:15:50.717Z

## Problem Description

Given an array arr[] and an integer k, divide the array into k contiguous subarrays such that the maximum sum among these subarrays is minimized. Find this minimum possible maximum sum. Examples: Input: arr[] = [1, 2, 3, 4], k = 3 Output: 4 Explanation: Optimal Split is [1, 2], [3], [4]. Maximum sum of all subarrays is 4, which is minimum possible for 3 splits. Input: arr[] = [1, 1, 2], k = 2 Output: 2 Explanation: Splitting the array as [1, 1] and [2] is optimal. This results in a maximum sum subarray of 2. Constraints: 1 ≤ k ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def splitArray(self, arr, k): # code here n = len(arr) low = max(arr) high = sum(arr) ans = -1 while low <= high: mid = (low+high)//2 sub_array = 1 curr_sum = 0 for num in arr: if curr_sum + num > mid: curr_sum = num sub_array += 1 else: curr_sum += num if sub_array <= k: ans = mid high = mid - 1 else: low = mid + 1 return ans. The detected topics are Expected Complexities, Company Tags Google, Company Tags, Google, Topic Tags, Arrays, Binary Search, Related Articles. Review the synced source file for the implementation details.
