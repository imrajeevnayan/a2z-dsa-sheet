/*
 * Platform: LeetCode
 * Problem: 1
 * URL: https://leetcode.com/submissions/detail/2141174492/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 24 ms
 * Memory: 49.14 MB
 * Synced: 2026-09-14T12:29:45.369Z
 */

1class Solution {
2      public int subarraySum(int[] arr, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4          map.put(0, 1);
5         int sum = 0, count = 0;
6          for (int n : arr) {
7                 sum += n;
8            if(map.containsKey(sum-k)) count+=map.get(sum-k);
9            map.put(sum,map.getOrDefault(sum,0)+1); 
10         }
11         return count;
12    }
13}
