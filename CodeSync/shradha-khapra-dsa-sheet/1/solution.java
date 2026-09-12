/*
 * Platform: LeetCode
 * Problem: 1
 * URL: https://leetcode.com/submissions/detail/2139295637/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 1 ms
 * Memory: 77.04 MB
 * Synced: 2026-09-12T11:16:20.806Z
 */

1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxsum=Integer.MIN_VALUE,curr=0;
4        for(int n:nums){
5            curr+=n;
6            if(curr >maxsum)maxsum=curr;
7            if(curr <0) curr=0;
8        }
9        return maxsum;
10    }
11}
