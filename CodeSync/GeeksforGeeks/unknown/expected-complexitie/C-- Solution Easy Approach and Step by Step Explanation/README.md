# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution { public int maxTask(int[] h, int[] l) { if (h.length == 0) return 0; int sum = 0; int prevSum = 0; int k = (h[0] > l[0]) ? h[0] : l[0]; sum = k; if (h.length > 1) { for(int i = 1; i < h.length; i++) { k = (h[i] + prevSum > l[i] + sum) ? h[i] + prevSum : l[i] + sum; prevSum = sum; sum = k; } } return sum; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Dynamic Programming, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/high-effort-vs-low-effort0213/1
- Synced: 2026-08-10T08:13:59.450Z

## Problem Description

Given two integer arrays h[] and l[], where h[i] and l[i] denote the number of tasks that can be completed on the i-th day by performing a high-effort task and a low-effort task, respectively. For each day, you may choose exactly one of the following: Perform no task. Perform a low-effort task. Perform a high-effort task, which can only be performed on the first day or if no task was performed on the previous day. Return the maximum total number of tasks that can be completed over all days. Examples: Input: h[] = [2, 8, 1], l[] = [1, 2, 1] Output: 9 Explanation: Pick the high-effort task on day 1 and the low-effort task on day 2. Total = 8 + 1 = 9. Input: h[] = [3, 6, 8, 7, 6], l[] = [1, 5, 4, 5, 3] Output: 20 Explanation: Pick the high-effort task on day 0 and low-effort tasks on all remaining days. Total = 3 + 5 + 4 + 5 + 3 = 20.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int maxTask(int[] h, int[] l) { if (h.length == 0) return 0; int sum = 0; int prevSum = 0; int k = (h[0] > l[0]) ? h[0] : l[0]; sum = k; if (h.length > 1) { for(int i = 1; i < h.length; i++) { k = (h[i] + prevSum > l[i] + sum) ? h[i] + prevSum : l[i] + sum; prevSum = sum; sum = k; } } return sum; } }. The detected topics are Expected Complexities, Topic Tags, Dynamic Programming, Related Articles. Review the synced source file for the implementation details.
