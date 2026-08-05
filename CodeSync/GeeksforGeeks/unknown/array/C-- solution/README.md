# C++ solution :

- Platform: GeeksforGeeks
- Language: class Solution { public: int maxPerimeter(vector<int> &arr) { // code here. sort(arr.begin(), arr.end(), greater<int>()); for(int i=0; i<arr.size()-2; i++){ if(arr[i+1] + arr[i+2] > arr[i]){ return arr[i] + arr[i+1] + arr[i+2]; } else { return -1; } } } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Mathematical, Sorting, Related Articles, Maximum Perimeter Triangle From Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-perimeter-of-triangle-from-array4322/1
- Synced: 2026-08-05T11:28:20.280Z

## Problem Description

Given an array arr[] of positive integers. Find out the maximum perimeter of the triangle from the array. Examples: Input: arr[] = [6, 1, 6, 5, 8, 4] Output: 20 Explanation: Triangle formed by 8,6 & 6. Thus perimeter 20. Input: arr[] = [7, 55, 20, 1, 4, 33, 12] Output: -1 Explanation:As the triangle is not possible because the condition: the sum of two sides should be greater than third is not fulfilled here. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int maxPerimeter(vector<int> &arr) { // code here. sort(arr.begin(), arr.end(), greater<int>()); for(int i=0; i<arr.size()-2; i++){ if(arr[i+1] + arr[i+2] > arr[i]){ return arr[i] + arr[i+1] + arr[i+2]; } else { return -1; } } } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Mathematical, Sorting, Related Articles, Maximum Perimeter Triangle From Array. Review the synced source file for the implementation details.
