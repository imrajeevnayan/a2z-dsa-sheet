# Implement Trie

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Company Tags, Accolite, Amazon, Microsoft, D-E-Shaw, FactSet, Topic Tags, Trie
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/trie-insert-and-search0651/1
- Synced: 2026-07-30T11:17:37.241Z

## Problem Description

Implement Trie class and complete insert(), search() and isPrefix() function for the following queries : Type 1 : (1, word), calls insert(word) function and insert word in the Trie Type 2 : (2, word), calls search(word) function and check whether word exists in Trie or not. Type 3 : (3, word), calls isPrefix(word) function and check whether word exists as a prefix of any string in Trie or not. Examples : Input: query[][] = [[1, "abcd"], [1, "abc"], [1, "bcd"], [2, "bc"], [3, "bc"], [2, "abc"]] Output: [false, true, true] Explanation: string "bc" does not exist in the trie, "bc" exists as prefix of the word "bcd" in the trie, and "abc" also exists in the trie. Input: query[][] = [[1, "gfg"], [1, "geeks"], [3, "fg"], [3, "geek"], [2, "for"]] Output: [false, true, false] Explanation: The string "for" is not present in the trie, "fg" is not a valid prefix, while "geek" is a valid prefix of the word "geeks" in the trie. Constraints: 1 ≤ query.size() ≤ 104 1 ≤ word.size() ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Company Tags, Accolite, Amazon, Microsoft, D-E-Shaw, FactSet, Topic Tags, Trie. Review the synced source file for the implementation details.
