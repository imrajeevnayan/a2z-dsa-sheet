/*
 * Platform: TakeUForward
 * Problem: 3 Sum
 * URL: https://takeuforward.org/practice/dsa/3-sum
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: 2.129 ms
 * Memory: N/A
 * Synced: 2026-09-24T19:22:17.908Z
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
