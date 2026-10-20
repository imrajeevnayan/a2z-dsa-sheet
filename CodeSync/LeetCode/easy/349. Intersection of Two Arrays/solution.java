/*
 * Platform: LeetCode
 * Problem: 349. Intersection of Two Arrays
 * URL: https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=binary-search
 * Language: Java
 * Difficulty: Easy
 * Topics: Array, Hash Table, Two Pointers, Binary Search, Sorting
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-20T12:37:46.807Z
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) set.add(num);
        for (int num : nums2) {
            if (set.remove(num)) {
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
