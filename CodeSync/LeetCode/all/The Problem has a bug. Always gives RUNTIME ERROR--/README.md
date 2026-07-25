# The Problem has a bug. Always gives RUNTIME ERROR⚠️

- Platform: LeetCode
- Language: Database
- Difficulty: Medium
- Topics: Database
- Runtime: 90 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/nth-highest-salary/
- Synced: 2026-07-25T18:05:46.611Z

## Problem Description

Table: Employee +-------------+------+ | Column Name | Type | +-------------+------+ | id | int | | salary | int | +-------------+------+ id is the primary key (column with unique values) for this table. Each row of this table contains information about the salary of an employee. Write a solution to find the nth highest distinct salary from the Employee table. If there are less than n distinct salaries, return null. The result format is in the following example. Example 1: Input: Employee table: +----+--------+ | id | salary | +----+--------+ | 1 | 100 | | 2 | 200 | | 3 | 300 | +----+--------+ n = 2 Output: +------------------------+ | getNthHighestSalary(2) | +------------------------+ | 200 | +------------------------+ Example 2: Input: Employee table: +----+--------+ | id | salary | +----+--------+ | 1 | 100 | +----+--------+ n = 2 Output: +------------------------+ | getNthHighestSalary(2) | +------------------------+ | null | +------------------------+

## Explanation

This solution was accepted on LeetCode using Database. The detected topics are Database. Review the synced source file for the implementation details.
