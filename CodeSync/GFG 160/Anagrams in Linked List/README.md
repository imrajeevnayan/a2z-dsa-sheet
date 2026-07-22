# Anagrams in Linked List

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, sliding-window, Related Articles, Find Anagrams In Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-anagrams-in-linked-list--170647/1
- Synced: 2026-07-22T17:23:39.001Z

## Problem Description

Given the head of a character linked list and a string str, return all non-overlapping anagrams of str present in the linked list. If multiple anagrams overlap, choose the leftmost one. Return an empty array if no anagram exists. Examples: Input: head: a -> b -> c -> a -> d -> b -> c -> a, str = bac Output: [a -> b -> c, b -> c -> a] Explanation: In the given linked list, there are three anagrams: But in 1 and 2, a -> b -> c and b -> c-> a are ovelapping. So we take a -> b -> c as it comes first from left.So the output is: [a -> b -> c, b -> c -> a] Input: Linked list: a -> b -> d -> c -> a, str = bac Output: -1 Explanation: There is no anagrams, so the output is -1 Constraints: 1 ≤ size of linked list ≤ 106 'a' ≤ node->data ≤ 'z'

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Linked List, sliding-window, Related Articles, Find Anagrams In Linked List. Review the synced source file for the implementation details.
