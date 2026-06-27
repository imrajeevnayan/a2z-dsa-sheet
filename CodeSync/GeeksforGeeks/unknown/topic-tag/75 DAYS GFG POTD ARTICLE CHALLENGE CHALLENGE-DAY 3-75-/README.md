# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 3/75)

- Platform: GeeksforGeeks
- Language: class Solution: def reverseString(self, input_word): word_length = len(input_word) if word_length < 2: return input_word char_list = list(input_word) left_ptr, right_ptr = 0, word_length - 1 while left_ptr <= right_ptr: char_list[left_ptr], char_list[right_ptr] = char_list[right_ptr], char_list[left_ptr] left_ptr, right_ptr = left_ptr + 1, right_ptr - 1 return "".join(char_list)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Data Structures, Related Articles, Reverse A String In C Cpp Different Methods, Reverse A String In Java, String Reverse
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-a-string/1
- Synced: 2026-06-27T10:17:18.162Z

## Problem Description

You are given a string s, and your task is to reverse the string. Examples: Input: s = "Geeks" Output: "skeeG" Input: s = "for" Output: "rof" Input: s = "a" Output: "a" Constraints: 1 <= s.size() <= 106 s contains only alphabetic characters (both uppercase and lowercase).

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def reverseString(self, input_word): word_length = len(input_word) if word_length < 2: return input_word char_list = list(input_word) left_ptr, right_ptr = 0, word_length - 1 while left_ptr <= right_ptr: char_list[left_ptr], char_list[right_ptr] = char_list[right_ptr], char_list[left_ptr] left_ptr, right_ptr = left_ptr + 1, right_ptr - 1 return "".join(char_list). The detected topics are Expected Complexities, Topic Tags, Strings, Data Structures, Related Articles, Reverse A String In C Cpp Different Methods, Reverse A String In Java, String Reverse. Review the synced source file for the implementation details.
