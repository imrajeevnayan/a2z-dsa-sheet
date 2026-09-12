-- Platform: Coding Ninjas (Code360)
-- Problem: Problem list
-- URL: https://www.naukri.com/code360/problems/second-highest-salary_2110760
-- Language: SQL
-- Difficulty: Hard
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T16:36:10.669Z

SELECT MAX(salary) as salary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
