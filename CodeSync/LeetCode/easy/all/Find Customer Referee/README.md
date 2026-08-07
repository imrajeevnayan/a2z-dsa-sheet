# Find Customer Referee

- Platform: LeetCode
- Language: SQL
- Difficulty: Easy
- Topics: Database
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/find-customer-referee/description/?envType=problem-list-v2&envId=dmjree02
- Synced: 2026-08-07T08:18:40.942Z

## Problem Description

Table: Customer +-------------+---------+ | Column Name | Type | +-------------+---------+ | id | int | | name | varchar | | referee_id | int | +-------------+---------+ In SQL, id is the primary key column for this table. Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them. Find the names of the customer that are either: referred by any customer with id != 2. not referred by any customer. Return the result table in any order. The result format is in the following example. Example 1: Input: Customer table: +----+------+------------+ | id | name | referee_id | +----+------+------------+ | 1 | Will | null | | 2 | Jane | null | | 3 | Alex | 2 | | 4 | Bill | null | | 5 | Zack | 1 | | 6 | Mark | 2 | +----+------+------------+ Output: +------+ | name | +------+ | Will | | Jane | | Bill | | Zack | +------+

## Explanation

This solution was accepted on LeetCode using SQL. The detected topics are Database. Review the synced source file for the implementation details.
