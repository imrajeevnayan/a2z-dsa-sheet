/*
 * Platform: LeetCode
 * Problem: -
 * URL: https://leetcode.com/submissions/detail/2139409513/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 4 ms
 * Memory: 69.61 MB
 * Synced: 2026-09-12T11:16:35.846Z
 */

1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int left=0,currSum=0,ans=Integer.MIN_VALUE; 
4        for(int right=0;right<nums.length;right++){
5            currSum+=nums[right];
6            if(right-left+1>k){
7                currSum-=nums[left];
8                left++;
9            }
10            if(right-left+1==k){
11                ans=Math.max(ans,currSum);
12            }
13        }
14        return (double)ans/k;
15    }
16}
