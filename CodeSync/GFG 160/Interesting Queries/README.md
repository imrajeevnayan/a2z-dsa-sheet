# Interesting Queries

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Map, Sqrt Decomposition, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/interesting-queries4742/1
- Synced: 2026-06-30T09:02:26.974Z

## Problem Description

Given an array nums of n elements and q queries . Each query consists of two integers l and r . You task is to find the number of elements of nums[] in range [l,r] which occur atleast k times. Example 1: Input: nums = {1,1,2,1,3}, Queries = {{1,5}, {2,4}}, k = 1 Output: {3,2} Explanation: For the 1st query, from l=1 to r=5 1, 2 and 3 have the frequency atleast 1. For the second query, from l=2 to r=4, 1 and 2 have the frequency atleast 1. Example 2: Input: nums = {1,2,3,1}, Queries = {{1,4}, {2,4},{4,4}, k = 2 Output: {1,0,0} Explanation: For the 1st query, from l=1 to r=4 1 have the frequency atleast 2. For the second query, from l=2 to r=4, no number has the frequency atleast 2. For the third query, from l=4 to r=4, no number has the frequency atleast 2. Your Task: Your task is to complete the function solveQueries() which takes nums, Queries and k as input parameter and returns a list containg the answer for each query. Expected Time Complexity: O(n*sqrt(n)*log(n)) Expected Space Compelxity: O(n) Constraints: 1 <= n, no of Queries, k <= 104 1 <= nums[i] <= 103 1 <= Queries[i][0] <= Queries[i][1] <= n

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Topic Tags Related Articles, Topic Tags, Map, Sqrt Decomposition, Data Structures, Related Articles. Review the synced source file for the implementation details.
