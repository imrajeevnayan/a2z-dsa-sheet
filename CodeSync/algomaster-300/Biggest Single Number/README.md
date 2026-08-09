# Biggest Single Number

- Platform: LeetCode
- Language: Database
- Difficulty: Easy
- Topics: Database
- Runtime: 107 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/biggest-single-number/
- Synced: 2026-08-08T19:24:01.828Z

## Problem Description

Table: MyNumbers +-------------+------+ | Column Name | Type | +-------------+------+ | num | int | +-------------+------+ This table may contain duplicates (In other words, there is no primary key for this table in SQL). Each row of this table contains an integer. A single number is a number that appeared only once in the MyNumbers table. Find the largest single number. If there is no single number, report null. The result format is in the following example. Example 1: Input: MyNumbers table: +-----+ | num | +-----+ | 8 | | 8 | | 3 | | 3 | | 1 | | 4 | | 5 | | 6 | +-----+ Output: +-----+ | num | +-----+ | 6 | +-----+ Explanation: The single numbers are 1, 4, 5, and 6. Since 6 is the largest single number, we return it. Example 2: Input: MyNumbers table: +-----+ | num | +-----+ | 8 | | 8 | | 7 | | 7 | | 3 | | 3 | | 3 | +-----+ Output: +------+ | num | +------+ | null | +------+ Explanation: There are no single numbers in the input table so we return null.

## Explanation

This solution was accepted on LeetCode using Database. The detected topics are Database. Review the synced source file for the implementation details.
