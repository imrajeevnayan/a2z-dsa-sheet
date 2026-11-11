/*
 * Platform: LeetCode
 * Problem: 9
 * URL: https://leetcode.com/problems/find-right-interval/submissions/2193467351/?envType=problem-list-v2&envId=sorting
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-11T03:23:31.000Z
 */

1class Solution {
2    public int[] findRightInterval(int[][] intervals) {
3        int n = intervals.length;
4        int[] result = new int[n];
5
6        int[][] starts = new int[n][2];
7
8        for (int i = 0; i < n; i++) {
9            starts[i][0] = intervals[i][0]; // start
10            starts[i][1] = i;               // original index
11        }
12
13        Arrays.sort(starts, (a, b) -> a[0] - b[0]);
14
15        for (int i = 0; i < n; i++) {
16            int target = intervals[i][1];
17
18            int left = 0, right = n - 1;
19            int ans = -1;
20
21            while (left <= right) {
22                int mid = left + (right - left) / 2;
23
24                if (starts[mid][0] >= target) {
25                    ans = starts[mid][1];
26                    right = mid - 1; // search for smaller valid start
27                } else {
28                    left = mid + 1;
29                }
30            }
31
32            result[i] = ans;
33        }
34
35        return result;
36    }
37}
