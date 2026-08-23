# Count Vowel Strings in Ranges

- Platform: LeetCode
- Language: Prefix Sum
- Difficulty: Medium
- Topics: Array, String, Prefix Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/count-vowel-strings-in-ranges/?envType=problem-list-v2&envId=prefix-sum
- Synced: 2026-08-23T04:57:32.891Z

## Problem Description

You are given a 0-indexed array of strings words and a 2D array of integers queries. Each query queries[i] = [li, ri] asks us to find the number of strings present at the indices ranging from li to ri (both inclusive) of words that start and end with a vowel. Return an array ans of size queries.length, where ans[i] is the answer to the ith query. Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'. Example 1: Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]] Output: [2,3,0] Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e". The answer to the query [0,2] is 2 (strings "aba" and "ece"). to query [1,4] is 3 (strings "ece", "aa", "e"). to query [1,1] is 0. We return [2,3,0]. Example 2: Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]] Output: [3,2,1] Explanation: Every string satisfies the conditions, so we return [3,2,1]. Constraints: 1 <= words.length <= 105 1 <= words[i].length <= 40 words[i] consists only of lowercase English letters. sum(words[i].length) <= 3 * 105 1 <= queries.length <= 105 0 <= li <= ri < words.length

## Explanation

This solution was accepted on LeetCode using Prefix Sum. The detected topics are Array, String, Prefix Sum. Review the synced source file for the implementation details.
