# class Solution {public: int smallestSubstring(string s) { int n = s.size(); int c0 = 0, c1 = 0, c2 = 0; int l = 0, ans = INT_MAX; for(int r = 0; r < n; r++) { if(s[r] == '0') c0++; else if(s[r] == '1') c1++; else c2++; while(c0 > 0 && c1 > 0 && c2 > 0) { ans = min(ans, r - l + 1); if(s[l] == '0') c0--; else if(s[l] == '1') c1--; else c2--; l++; } } return ans == INT_MAX ? -1 : ans; }};

- Platform: GeeksforGeeks
- Language: class Solution: def smallestSubstring(self, s): # code here char_count = 3 count_arr = [0] * char_count bool_arr = [False] * char_count n = len(s) i = j = 0 min_len = pow(10, 5) + 1 updated = False while j < n: ind = int(s[j]) count_arr[ind] += 1 bool_arr[ind] = True while i < j and sum(bool_arr) == char_count: updated = True min_len = min(min_len, j - i + 1) ind1 = int(s[i]) count_arr[ind1] -= 1 if count_arr[ind1] == 0: bool_arr[ind1] = False i += 1 j += 1 if not updated: return -1 return min_len
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Paytm, Company Tags, Paytm, Topic Tags, sliding-window, two-pointer-algorithm, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1
- Synced: 2026-09-13T16:39:49.500Z

## Problem Description

Given a string s consisting only of the characters '0', '1' and '2', determine the length of the smallest substring that contains all three characters at least once. If no such substring exists, return -1. Examples : Input: s = "10212" Output: 3 Explanation: The substring "102" is the shortest substring that contains all three characters '0', '1', and '2', so the answer is 3. Input: s = "12121" Output: -1 Explanation: The character '0' is not present in the string, so no substring can contain all three characters '0', '1', and '2'. Hence, the answer is -1. Constraints: 1 ≤ s.size() ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def smallestSubstring(self, s): # code here char_count = 3 count_arr = [0] * char_count bool_arr = [False] * char_count n = len(s) i = j = 0 min_len = pow(10, 5) + 1 updated = False while j < n: ind = int(s[j]) count_arr[ind] += 1 bool_arr[ind] = True while i < j and sum(bool_arr) == char_count: updated = True min_len = min(min_len, j - i + 1) ind1 = int(s[i]) count_arr[ind1] -= 1 if count_arr[ind1] == 0: bool_arr[ind1] = False i += 1 j += 1 if not updated: return -1 return min_len. The detected topics are Expected Complexities, Company Tags Paytm, Company Tags, Paytm, Topic Tags, sliding-window, two-pointer-algorithm, Strings. Review the synced source file for the implementation details.
