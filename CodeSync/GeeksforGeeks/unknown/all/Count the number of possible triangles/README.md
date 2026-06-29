# Count the number of possible triangles

- Platform: GeeksforGeeks
- Language: class Solution { public: int countTriangles(vector<int>& arr) { int n = arr.size(); sort(arr.begin(), arr.end()); int sum = 0; for(int i = 0;i<n-2;i++){ for(int j = i+1;j<n-1;j++){ int s1 = arr[i], s2 = arr[j]; int idx = lower_bound(arr.begin()+j+1, arr.end(), s1+s2) - arr.begin(); sum+=(idx-j-1); } } return sum; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Arrays, Sorting
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
- Synced: 2026-06-29T15:37:33.744Z

## Problem Description

Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. A triangle with three given sides is only possible if sum of any two sides is always greater than the third side. Examples: Input: arr[] = [4, 6, 3, 7] Output: 3 Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle. Input: arr[] = [10, 21, 22, 100, 101, 200, 300] Output: 6 Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]. Input: arr[] = [1, 2, 3] Output: 0 Explanation: No triangles are possible. Constraints: 1 ≤ arr.size() ≤ 103 0 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int countTriangles(vector<int>& arr) { int n = arr.size(); sort(arr.begin(), arr.end()); int sum = 0; for(int i = 0;i<n-2;i++){ for(int j = i+1;j<n-1;j++){ int s1 = arr[i], s2 = arr[j]; int idx = lower_bound(arr.begin()+j+1, arr.end(), s1+s2) - arr.begin(); sum+=(idx-j-1); } } return sum; } };. The detected topics are Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Arrays, Sorting. Review the synced source file for the implementation details.
