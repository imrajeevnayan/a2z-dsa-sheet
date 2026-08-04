# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution { public: int countPairs(vector<int>& arr, int k) { // code here sort(arr.begin(), arr.end()); int n = arr.size(); int i = n-1 ; int ans = 0; for(int j = n-1; j>0 ; j--){ while(i>=0 && arr[j] - arr[i] <k)i--; ans+= (j - i -1); } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles, Pairs Difference Less K
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/pairs-with-difference-less-than-k1348/1
- Synced: 2026-08-04T10:59:41.555Z

## Problem Description

Given an array arr[] of positive integers and an integer k, find the total number of pairs of elements that have an absolute difference strictly less than k. Note: Pair (i, j) is considered the same as (j, i). Examples: Input : arr[] = [1, 10, 4, 2], k = 3 Output : 2 Explanation: We have an array arr[] = [1, 10, 4, 2] and k = 3 We can make only two pairs with a difference of less than 3. (1, 2) and (4, 2). So, the answer is 2. Input : arr[] = [2, 3, 4], k = 5 Output : 3 Explanation: For the given array arr[] = [2, 3, 4] and k = 5, there are 3 valid pairs where the absolute difference between the pair's elements is less than 5. These pairs are (2, 3), (2, 4), and (3, 4). Hence, the output is 3. Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ k ≤ 105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int countPairs(vector<int>& arr, int k) { // code here sort(arr.begin(), arr.end()); int n = arr.size(); int i = n-1 ; int ans = 0; for(int j = n-1; j>0 ; j--){ while(i>=0 && arr[j] - arr[i] <k)i--; ans+= (j - i -1); } return ans; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles, Pairs Difference Less K. Review the synced source file for the implementation details.
