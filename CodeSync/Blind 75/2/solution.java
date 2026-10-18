/*
 * Platform: LeetCode
 * Problem: 2
 * URL: https://leetcode.com/problems/container-with-most-water/submissions/2175118374/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-18T15:38:26.533Z
 */

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            // Current width and height
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            
            // Calculate area and update max
            maxWater = Math.max(maxWater, h * width);
            
            // Move the pointer with the smaller height
