# XOR Queries of a Subarray

- Platform: LeetCode
- Language: DSA Patterns by anubhav0910 (Copy-a0b4xdj1)
- Difficulty: Medium
- Topics: Array, Bit Manipulation, Prefix Sum
- Runtime: 0 ms
- Memory: 92.56 MB
- Problem URL: https://leetcode.com/problems/xor-queries-of-a-subarray/submissions/2101982370/?envType=problem-list-v2&envId=dapb7olr
- Synced: 2026-08-10T19:08:05.272Z

## Problem Description

You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti]. For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ). Return an array answer where answer[i] is the answer to the ith query. Example 1: Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]] Output: [2,7,14,8] Explanation: The binary representation of the elements in the array are: 1 = 0001 3 = 0011 4 = 0100 8 = 1000 The XOR values for queries are: [0,1] = 1 xor 3 = 2 [1,2] = 3 xor 4 = 7 [0,3] = 1 xor 3 xor 4 xor 8 = 14 [3,3] = 8 Example 2: Input: arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]] Output: [8,0,4,4] Constraints: 1 <= arr.length, queries.length <= 3 * 104 1 <= arr[i] <= 109 queries[i].length == 2 0 <= lefti <= righti < arr.length

## Explanation

This solution was accepted on LeetCode using DSA Patterns by anubhav0910 (Copy-a0b4xdj1). The detected topics are Array, Bit Manipulation, Prefix Sum. Review the synced source file for the implementation details.
