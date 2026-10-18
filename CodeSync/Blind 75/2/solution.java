/*
 * Platform: LeetCode
 * Problem: 2
 * URL: https://leetcode.com/problems/container-with-most-water/submissions/2175118374/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-18T15:38:27.483Z
 */

1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxWater = 0;
6        
7        while (left < right) {
8            // Current width and height
9            int width = right - left;
10            int h = Math.min(height[left], height[right]);
11            
12            // Calculate area and update max
13            maxWater = Math.max(maxWater, h * width);
14            
15            // Move the pointer with the smaller height
16            if (height[left] < height[right]) {
17                left++;
18            } else {
19                right--;
20            }
21        }
22        
23        return maxWater;
24    }
25}
