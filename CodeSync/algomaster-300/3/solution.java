/*
 * Platform: LeetCode
 * Problem: 3
 * URL: https://leetcode.com/problems/minimum-size-subarray-sum/submissions/2173279252/?spm=a2ty_o01.29997173.0.0.2292c921cwtrvM
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-16T04:03:30.934Z
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE; // Sabse bada value se start karo
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Right side se add karo
            
            // Jab tak sum target se bada hai, left side se hatao
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); // Chot
