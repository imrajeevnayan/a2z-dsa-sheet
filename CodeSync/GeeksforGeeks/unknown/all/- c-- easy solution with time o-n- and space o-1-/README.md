# # c++ easy solution with time o(n) and space o(1)

- Platform: GeeksforGeeks
- Language: def reverseWithSpacesIntact(self, s): # code here s_arr = list(s) left, right = 0, len(s_arr) - 1 # 2-pointers approach while left < right: if s_arr[left] != " " and s_arr[right] != " ": s_arr[left], s_arr[right] = s_arr[right], s_arr[left] if s_arr[left] == " ": left += 1 elif s_arr[right] == " ": right -= 1 else: left += 1 right -= 1 return str("").join(s_arr)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, two-pointer-algorithm, Strings, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-a-string-with-spaces-intact5213/1
- Synced: 2026-09-14T11:02:43.595Z

## Problem Description

Given a string s, reverse the string without altering the positions of the spaces. Examples : Input: s = "Help others" Output: "sreh topleH" Explanation: The space remains at the same position (index 4), while all the non-space characters are reversed. Input: s = "geeksforgeeks" Output: "skeegrofskeeg" Explanation: Since there are no spaces in the string, the entire string is reversed.

## Explanation

This solution was accepted on GeeksforGeeks using def reverseWithSpacesIntact(self, s): # code here s_arr = list(s) left, right = 0, len(s_arr) - 1 # 2-pointers approach while left < right: if s_arr[left] != " " and s_arr[right] != " ": s_arr[left], s_arr[right] = s_arr[right], s_arr[left] if s_arr[left] == " ": left += 1 elif s_arr[right] == " ": right -= 1 else: left += 1 right -= 1 return str("").join(s_arr). The detected topics are Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, two-pointer-algorithm, Strings, Related Articles. Review the synced source file for the implementation details.
