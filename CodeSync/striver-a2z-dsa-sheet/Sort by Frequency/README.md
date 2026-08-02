# Sort by Frequency

- Platform: GeeksforGeeks
- Language: class Solution: def frequencySort(self, s: str) -> str: # Step 1: Count frequency of each character freq = {} for char in s: freq[char] = freq.get(char, 0) + 1 # Step 2: Sort characters by frequency (ascending), then by character sorted_items = sorted(freq.items(), key=lambda item: (item[1], item)) # Step 3: Build the resulting string by repeating each character return "".join(char * count for char, count in sorted_items)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Sorting, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sort-string-according-to-increasing-frequency/1
- Synced: 2026-08-02T10:36:51.915Z

## Problem Description

Given a string s, the task is to arrange the string according to the frequency of each character, in ascending order. If two elements have the same frequency, then they are sorted in lexicographical order. Examples: Input: s = "geeksforgeeks" Output: forggkksseeee Explanation: All the characters with minimum frequency will occur first and the one with same frequency will be arranged lexicographically. Input: s = "abc" Output: abc Explanation: The frequency is one for all characters hence they'll be arranged lexicographically. Constraints : 1 ≤ s.length() ≤ 106 s consist of lowercase english alphabets.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def frequencySort(self, s: str) -> str: # Step 1: Count frequency of each character freq = {} for char in s: freq[char] = freq.get(char, 0) + 1 # Step 2: Sort characters by frequency (ascending), then by character sorted_items = sorted(freq.items(), key=lambda item: (item[1], item)) # Step 3: Build the resulting string by repeating each character return "".join(char * count for char, count in sorted_items). The detected topics are Expected Complexities, Topic Tags, Strings, Sorting, Related Articles. Review the synced source file for the implementation details.
