/*
 * Platform: TakeUForward
 * Problem: Median of 2 sorted arrays
 * URL: https://takeuforward.org/practice/dsa/median-of-2-sorted-arrays
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T20:35:50.605Z
 */

int i = 0, j = 0, k = 0;
        int[] merge = new int[arr1.length + arr2.length];
    public double median(int[] arr1, int[] arr2) {
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
class Solution {
