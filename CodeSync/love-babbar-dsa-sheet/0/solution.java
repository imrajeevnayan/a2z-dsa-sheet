/*
 * Platform: LeetCode
 * Problem: 0
 * URL: https://leetcode.com/submissions/detail/2128523208/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 0 ms
 * Memory: 43.50 MB
 * Synced: 2026-09-02T19:11:43.416Z
 */

1class Solution {
2    public int findMin(int[] arr) {
3        int left = 0,right = arr.length - 1,ans = Integer.MAX_VALUE;
4        while (left <= right) {
5            int mid = left + (right - left) / 2;
6            if (arr[mid] > arr[right]) {
7                // Minimum right side mein hai
8                left = mid + 1;
9            } else {
10
11                // arr[mid] minimum ka candidate hai
12                ans = Math.min(ans, arr[mid]);
13
14                // Aur chhota left mein ho sakta hai
15                right = mid - 1;
16            }
17        }
18        return ans;
19    }
20}
21
