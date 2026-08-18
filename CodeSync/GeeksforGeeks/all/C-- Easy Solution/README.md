# C++ Easy Solution

- Platform: GeeksforGeeks
- Language: class Solution{ public: bool isPossible(int s1, int s2, int n, int mid) { if((mid/s1)+(mid/s2) >= n) return true; return false; } int minTime(int s1, int s2, int n){ int start = 0; int end = min(s1*n,s2*n); int ans = 0; while(start <= end) { int mid = start + (end-start)/2; if(isPossible(s1, s2, n, mid)) { ans = mid; end = mid - 1; } else start = mid + 1; } return ans; } };
- Difficulty: Unknown
- Topics: Company Tags Oracle Topic Tags Related Articles, Company Tags Oracle, Company Tags, Oracle, Topic Tags, Mathematical, Binary Search, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-the-minimum-time0253/1
- Synced: 2026-08-18T08:46:00.965Z

## Problem Description

Geek wants to scan N documents using two scanners. If S1 and S2 are the time taken by the scanner 1 and scanner 2 to scan a single document, find the minimum time required to scan all the N documents. You can use one or more scanners at a time. Example 1: Input: S1 = 2, S2 = 4, N = 2 Output: 4 Explaination: Here we have two possibilities. Either scan both documents in scanner 1 or scan one document in each scanner. In both the cases time required is 4. Example 2: Input: S1 = 1, S2 = 3, N = 2 Output: 2 Explaination: Here the optimal approach is to scan both of them in the first scanner. Your Task: You do not need to read input or print anything. Your task is to complete the function minTime() which takes S1, S2 and N as input parameters and returns the minimum tme required to scan the documents. Expected Time Complexity: O(logN) Expected Auxiliary Space: O(1) Constraints: 1 ≤ S1, S2, N ≤ 106 1 ≤ S1*N, S2*N ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution{ public: bool isPossible(int s1, int s2, int n, int mid) { if((mid/s1)+(mid/s2) >= n) return true; return false; } int minTime(int s1, int s2, int n){ int start = 0; int end = min(s1*n,s2*n); int ans = 0; while(start <= end) { int mid = start + (end-start)/2; if(isPossible(s1, s2, n, mid)) { ans = mid; end = mid - 1; } else start = mid + 1; } return ans; } };. The detected topics are Company Tags Oracle Topic Tags Related Articles, Company Tags Oracle, Company Tags, Oracle, Topic Tags, Mathematical, Binary Search, Related Articles. Review the synced source file for the implementation details.
