/*
 * Platform: LeetCode
 * Problem: 1
 * URL: https://leetcode.com/submissions/detail/2148424578/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 18 ms
 * Memory: 45.46 MB
 * Synced: 2026-09-21T08:44:13.629Z
 */

1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);                         
4        int n = nums.length;
5        
6        int closestSum = nums[0] + nums[1] + nums[2]; // ⚠️ pehla triplet = initial best
7        
8        for (int i = 0; i < n - 2; i++) {
9            int left = i + 1, right = n - 1;
10            
11            while (left < right) {
12                int sum = nums[i] + nums[left] + nums[right];
13                
14                // SCOREBOARD: ye sum zyada kareeb hai kya?
15                if (Math.abs(sum - target) < Math.abs(closestSum - target))  closestSum = sum;
16                
17                if (sum == target) return target;   // 🎯 PERFECT! Isse behtar kuch nahi — BHAAGO!
18                else if (sum < target) left++;      // bada sum chahiye
19                else right--;                        // chhota sum chahiye
20            }
21        }
22        return closestSum;
23    }
24}
