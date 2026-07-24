# Sum of Middle of two sorted arrays

- Platform: GeeksforGeeks
- Language: class Solution { public int SumofMiddleElements(int[] arr1, int[] arr2) { int i=0,n=arr1.length,m=arr2.length; int ans[]=new int[n+m]; for(int a:arr1){ ans[i++]=a; } for(int b:arr2){ ans[i++]=b; } Arrays.sort(ans); int len=n+m; int a=ans[len/2]; int b=ans[(len-1)/2]; return a+b; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonD-E-Shaw, Company Tags, Amazon, D-E-Shaw, Topic Tags, Arrays, Divide and Conquer
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1
- Synced: 2026-07-24T12:34:53.865Z

## Problem Description

Given two sorted integer arrays arr1[] and arr2[] of the same size. Find the sum of the middle elements of two sorted arrays arr1 and arr2. Examples: Input: arr1[] = [1, 2, 4, 6], arr2[] = [4, 5, 6, 9] Output: 9 Explanation: The merged array looks like [1, 2, 4, 4, 5, 6, 6, 9,]. Sum of middle elements is 9 (4 + 5). Input: arr1[] = [1, 12, 15, 26, 38], arr2[] = [2, 13, 17, 30, 45] Output: 32 Explanation: The merged array looks like [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17). Constraints: 1 ≤ arr1.size() == arr2.size() ≤ 103 1 ≤ arr1[i] ≤ 106 1 ≤ arr2[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int SumofMiddleElements(int[] arr1, int[] arr2) { int i=0,n=arr1.length,m=arr2.length; int ans[]=new int[n+m]; for(int a:arr1){ ans[i++]=a; } for(int b:arr2){ ans[i++]=b; } Arrays.sort(ans); int len=n+m; int a=ans[len/2]; int b=ans[(len-1)/2]; return a+b; } }. The detected topics are Expected Complexities, Company Tags AmazonD-E-Shaw, Company Tags, Amazon, D-E-Shaw, Topic Tags, Arrays, Divide and Conquer. Review the synced source file for the implementation details.
