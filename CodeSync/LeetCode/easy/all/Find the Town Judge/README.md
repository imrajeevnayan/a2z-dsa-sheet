# Find the Town Judge

- Platform: LeetCode
- Language: Graph Theory
- Difficulty: Easy
- Topics: Array, Hash Table, Graph Theory
- Runtime: 0 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/find-the-town-judge/?envType=problem-list-v2&envId=graph
- Synced: 2026-06-22T19:34:16.357Z

## Problem Description

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge. If the town judge exists, then: The town judge trusts nobody. Everybody (except for the town judge) trusts the town judge. There is exactly one person that satisfies properties 1 and 2. You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist. Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise. Example 1: Input: n = 2, trust = [[1,2]] Output: 2 Example 2: Input: n = 3, trust = [[1,3],[2,3]] Output: 3 Example 3: Input: n = 3, trust = [[1,3],[2,3],[3,1]] Output: -1 Constraints: 1 <= n <= 1000 0 <= trust.length <= 104 trust[i].length == 2 All the pairs of trust are unique. ai != bi 1 <= ai, bi <= n

## Explanation

This solution was accepted on LeetCode using Graph Theory. The detected topics are Array, Hash Table, Graph Theory. Review the synced source file for the implementation details.
