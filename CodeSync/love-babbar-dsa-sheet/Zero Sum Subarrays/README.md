# Zero Sum Subarrays

- Platform: GeeksforGeeks
- Language: long long int findSubarray(vector<long long int> &arr, int n ) { long long int result = 0; map<long long int, int> freq; long long int sum = 0; freq[0]++; for(int i = 1; i <= n; i++){ sum += arr[i-1]; freq[sum]++; result += freq[sum] - 1; } return result; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftOYO Rooms, Company Tags, Amazon, Microsoft, OYO Rooms, Topic Tags, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/zero-sum-subarrays1825/1
- Synced: 2026-07-10T10:24:13.611Z

## Problem Description

You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0. Examples: Input: arr[] = [0, 0, 5, 5, 0, 0] Output: 6 Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0]. Input: arr[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7] Output: 4 Explanation: The 4 subarrays are [-1, -3, 4], [-2, 2], [2, 4, 6, -12], and [-1, -3, 4, -2, 2] Input: arr[] = [0] Output: 1 Explanation: The only subarray is [0]. Constraints: 1 <= n <= 106 -109 <= arr[ i ] <= 109

## Explanation

This solution was accepted on GeeksforGeeks using long long int findSubarray(vector<long long int> &arr, int n ) { long long int result = 0; map<long long int, int> freq; long long int sum = 0; freq[0]++; for(int i = 1; i <= n; i++){ sum += arr[i-1]; freq[sum]++; result += freq[sum] - 1; } return result; }. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftOYO Rooms, Company Tags, Amazon, Microsoft, OYO Rooms, Topic Tags, Arrays. Review the synced source file for the implementation details.
