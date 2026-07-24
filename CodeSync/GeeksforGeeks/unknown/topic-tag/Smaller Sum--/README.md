# Smaller Sum✅✅

- Platform: GeeksforGeeks
- Language: while(low<high) //low=0, high=len(a) { mid=(low+high)/2; if(arr[i]<mid) low=mid+1; else high=mid } return low
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Arrays, Binary Search, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smaller-sum--170647/1
- Synced: 2026-07-24T12:33:17.119Z

## Problem Description

You are given an array arr of n integers. For each index i, you have to find the sum of all integers present in the array with a value less than arr[i]. Example 1: Input: n = 3 arr = {1, 2, 3} Output: 0 1 3 Explanation: For 1, there are no elements lesser than itself. For 2, only 1 is lesser than 2. And for 3, 1 and 2 are lesser than 3, so the sum is 3. Example 2: Input: n = 2 arr = {4, 4} Output: 0 0 Explanation: For 4, there are no elements lesser than itself. For 4, there are no elements lesser than itself. There are no smaller elements than 4. Your Task: You don't need to read input or print anything. Your task is to complete the function smallerSum() which takes an integer n and an array arr and returns an array of length n , the answer for every index. Expected Time Complexity:O(n log n) Expected Space Complexity:O(n) Constraints: 1 <= n <= 105 0 <= arr[i] <= 109

## Explanation

This solution was accepted on GeeksforGeeks using while(low<high) //low=0, high=len(a) { mid=(low+high)/2; if(arr[i]<mid) low=mid+1; else high=mid } return low. The detected topics are Topic Tags Related Articles, Topic Tags, Arrays, Binary Search, Related Articles. Review the synced source file for the implementation details.
