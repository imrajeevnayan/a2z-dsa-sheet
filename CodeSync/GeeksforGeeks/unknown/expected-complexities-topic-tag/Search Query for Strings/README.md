# Search Query for Strings

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings, Trie, Advanced Data Structure
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/search-query-for-strings5049/1
- Synced: 2026-08-21T10:35:27.283Z

## Problem Description

A Trie (Prefix Tree) is an efficient data structure used for storing and searching strings, especially when dealing with prefixes. You are given an array of strings arr[] of size n containing only lowercase English letters, and an array of query strings queries[] of size q. An empty TrieNode* root is provided as the root of the Trie. Insert all strings from arr[] into the Trie and, for each query string, check whether it exists in the Trie. For every query, return 1 if the string exists in arr[]; otherwise, return 0. Note: The required Trie functions are already implemented in the driver code. You only need to call them. Examples: Input: arr[] = ["the", "there", "any", "by", "their"], queries[] = ["the", "an", "any"] Output: [1, 0, 1] Explanation: After inserting all strings from words[] into the Trie: "the" is present in the Trie, so the answer is 1. "an" is not present as a complete word, so the answer is 0. "any" exists in the Trie, so the answer is 1. Hence, the output is [1, 0, 1]. Input: arr[] = ["cat", "car", "dog", "door"], queries[] = ["car", "dog", "do"] Output: [1, 1, 0] Explanation: After inserting all strings from words[] into the Trie: "car" is present in the Trie, so the answer is 1. "dog" is present as a complete word, so the answer is 1. "do" exists in the Trie, so the answer is 0. Hence, the output is [1, 1, 0]. Constraints: 1 ≤ n ≤ 103 1 ≤ q ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings, Trie, Advanced Data Structure. Review the synced source file for the implementation details.
