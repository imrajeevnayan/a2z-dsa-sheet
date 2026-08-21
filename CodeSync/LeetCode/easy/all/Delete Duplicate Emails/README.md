# Delete Duplicate Emails

- Platform: LeetCode
- Language: SQL 50
- Difficulty: Easy
- Topics: Database
- Runtime: 74 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/delete-duplicate-emails/description/?envType=study-plan-v2&envId=top-sql-50
- Synced: 2026-08-21T10:25:29.727Z

## Problem Description

Table: Person +-------------+---------+ | Column Name | Type | +-------------+---------+ | id | int | | email | varchar | +-------------+---------+ id is the primary key (column with unique values) for this table. Each row of this table contains an email. The emails will not contain uppercase letters. Write a solution to delete all duplicate emails, keeping only one unique email with the smallest id. For SQL users, please note that you are supposed to write a DELETE statement and not a SELECT one. For Pandas users, please note that you are supposed to modify Person in place. After running your script, the answer shown is the Person table. The driver will first compile and run your piece of code and then show the Person table. The final order of the Person table does not matter. The result format is in the following example. Example 1: Input: Person table: +----+------------------+ | id | email | +----+------------------+ | 1 | john@example.com | | 2 | bob@example.com | | 3 | john@example.com | +----+------------------+ Output: +----+------------------+ | id | email | +----+------------------+ | 1 | john@example.com | | 2 | bob@example.com | +----+------------------+ Explanation: john@example.com is repeated two times. We keep the row with the smallest Id = 1.

## Explanation

This solution was accepted on LeetCode using SQL 50. The detected topics are Database. Review the synced source file for the implementation details.
