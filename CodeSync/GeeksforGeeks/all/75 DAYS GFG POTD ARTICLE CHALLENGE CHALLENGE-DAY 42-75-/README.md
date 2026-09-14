# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 42/75)

- Platform: GeeksforGeeks
- Language: class Solution: def count_substrings_with_k_distinct_characters(self, s, k): count = 0 # Initialize a counter for the substrings character_count = dict() # Initialize a dictionary to track character counts start_index = 0 # Initialize the starting index of the current substring for end_index in range(len(s)): character_count[s[end_index]] = character_count.get(s[end_index], 0) + 1 while len(character_count) > k: # Remove characters from the start of the substring until we have 'k' distinct characters first_char = s[start_index] if character_count[first_char] == 1: del character_count[first_char] else: character_count[first_char] -= 1 start_index += 1 count += (end_index - start_index + 1) # Increment the count based on substring length return count def countSubstr (self, s, k): # Code here return self.count_substrings_with_k_distinct_characters(s, k) - self.count_substrings_with_k_distinct_characters(s, k - 1)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags D-E-Shaw, Company Tags, D-E-Shaw, Topic Tags, sliding-window, two-pointer-algorithm, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1
- Synced: 2026-09-14T09:06:49.267Z

## Problem Description

You are given a string s consisting of lowercase characters and an integer k, You have to count all possible substrings that have exactly k distinct characters. Examples : Input: s = "abc", k = 2 Output: 2 Explanation: Possible substrings are ["ab", "bc"] Input: s = "aba", k = 2 Output: 3 Explanation: Possible substrings are ["ab", "ba", "aba"] Input: s = "aa", k = 1 Output: 3 Explanation: Possible substrings are ["a", "a", "aa"]

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def count_substrings_with_k_distinct_characters(self, s, k): count = 0 # Initialize a counter for the substrings character_count = dict() # Initialize a dictionary to track character counts start_index = 0 # Initialize the starting index of the current substring for end_index in range(len(s)): character_count[s[end_index]] = character_count.get(s[end_index], 0) + 1 while len(character_count) > k: # Remove characters from the start of the substring until we have 'k' distinct characters first_char = s[start_index] if character_count[first_char] == 1: del character_count[first_char] else: character_count[first_char] -= 1 start_index += 1 count += (end_index - start_index + 1) # Increment the count based on substring length return count def countSubstr (self, s, k): # Code here return self.count_substrings_with_k_distinct_characters(s, k) - self.count_substrings_with_k_distinct_characters(s, k - 1). The detected topics are Expected Complexities, Company Tags D-E-Shaw, Company Tags, D-E-Shaw, Topic Tags, sliding-window, two-pointer-algorithm, Strings. Review the synced source file for the implementation details.
