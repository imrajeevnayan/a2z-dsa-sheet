# Length of longest subarray

- Platform: GeeksforGeeks
- Language: int longestSubarry( vector< int >& arr ) { int longest{}, current{}; for ( const int num : arr ) if ( num < 0 ) { longest = max( longest, current ); current = 0; } else ++current; return max( longest, current ); }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, two-pointer-algorithm, Arrays, Related Articles, Longest Subarray Non Negative Integers
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/length-of-longest-subarray0440/1
- Synced: 2026-09-17T17:32:48.390Z

## Problem Description

Given an array arr[], return the length of the longest subarray of non-negative integers. Examples: Input: arr[] = [2, 3, 4, -1, -2, 1, 5, 6, 3] Output: 4 Explanation: The subarray [ 1, 5, 6, 3] has longest length 4 and contains no negative integers. Input: arr[] = [1, 0, 0, 1, -1, -1, 0, 0, 1, 0] Output: 4 Explanation: The subarrays [1, 0, 0, 1] and [0, 0, 1, 0] both have the maximum length 4 and contain no negative integers. Hence, the answer is 4. Constraints: 1 ≤ arr.size() ≤ 106 -106 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using int longestSubarry( vector< int >& arr ) { int longest{}, current{}; for ( const int num : arr ) if ( num < 0 ) { longest = max( longest, current ); current = 0; } else ++current; return max( longest, current ); }. The detected topics are Expected Complexities, Topic Tags, two-pointer-algorithm, Arrays, Related Articles, Longest Subarray Non Negative Integers. Review the synced source file for the implementation details.
