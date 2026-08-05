# SIMPLE SOLUTION

- Platform: GeeksforGeeks
- Language: int findMinDiff(vector<int>& a, int m) { // code here sort(a.begin(), a.end()); int n = a.size(); int mini = INT_MAX; for (int i = 0; i <= n - m; i++){ mini = min(mini, a[m+i-1] - a[i]); } return mini; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Sorting, Related Interview Experiences, Flipkart Interview Experience Set 24
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
- Synced: 2026-08-05T11:29:33.263Z

## Problem Description

Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that: Each student gets exactly one packet. The difference between maximum number of chocolates given to a student and minimum number is minimum and return that minimum possible difference. Examples: Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5 Output: 6 Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing m packets as [3, 4, 9, 7, 9]. Input: arr = [7, 3, 2, 4, 9, 12, 56], m = 3 Output: 2 Explanation: The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing m packets as [3, 2, 4]. Input: arr = [3, 4, 1, 9, 56], m = 5 Output: 55 Explanation: With 5 packets for 5 students, each student will receive one packet, so the difference is 56 - 1 = 55. Constraints: 1 ≤ m ≤ arr.size ≤ 105 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using int findMinDiff(vector<int>& a, int m) { // code here sort(a.begin(), a.end()); int n = a.size(); int mini = INT_MAX; for (int i = 0; i <= n - m; i++){ mini = min(mini, a[m+i-1] - a[i]); } return mini; }. The detected topics are Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Sorting, Related Interview Experiences, Flipkart Interview Experience Set 24. Review the synced source file for the implementation details.
