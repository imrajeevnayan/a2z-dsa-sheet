# easy code java

- Platform: GeeksforGeeks
- Language: class Solution: def makeEven(self, s): s = list(map(int,s)) # Right-most highest, left-most lowest n = len(s) odd_digit = s[-1] mid_idx = -1 max_idx = -1 flag = True for i in range(n-2, -1, -1): if s[i] % 2 == 0: # Left-most lowest if s[i] < odd_digit: mid_idx = i # Right-most highest elif s[i] > odd_digit: if flag: flag = False max_idx = i idx_to_swap = max_idx if mid_idx != -1: idx_to_swap = mid_idx # Swap s[idx_to_swap], s[-1] = s[-1], s[idx_to_swap] return "".join(map(str,s))
- Difficulty: Unknown
- Topics: Company Tags Morgan Stanley, Company Tags, Morgan Stanley, Topic Tags, Strings, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/odd-to-even0537/1
- Synced: 2026-07-07T16:56:10.435Z

## Problem Description

Given an odd number in the form of string, the task is to make largest even number possible from the given number provided one is allowed to do exactly only one swap operation, if no such number is possible then return the input string itself. Example 1: Input: s = 4543 Output: 4534 Explanation: Swap 4(3rd pos) and 3. Example 2: Input: s = 1539 Output: 1539 Explanation: No even no. present. Your Task: You dont need to read input or print anything. Complete the function makeEven() which takes a string s as input parameter and returns a string after performing given operations. Expected Time Complexity: O(Length of Input string). Expected Auxiliary Space: O(1). Constraints: 1 <= Length of odd number string<= 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def makeEven(self, s): s = list(map(int,s)) # Right-most highest, left-most lowest n = len(s) odd_digit = s[-1] mid_idx = -1 max_idx = -1 flag = True for i in range(n-2, -1, -1): if s[i] % 2 == 0: # Left-most lowest if s[i] < odd_digit: mid_idx = i # Right-most highest elif s[i] > odd_digit: if flag: flag = False max_idx = i idx_to_swap = max_idx if mid_idx != -1: idx_to_swap = mid_idx # Swap s[idx_to_swap], s[-1] = s[-1], s[idx_to_swap] return "".join(map(str,s)). The detected topics are Company Tags Morgan Stanley, Company Tags, Morgan Stanley, Topic Tags, Strings, Data Structures, Related Articles. Review the synced source file for the implementation details.
