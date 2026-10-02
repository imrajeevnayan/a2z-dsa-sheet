-- Platform: Coding Ninjas (Code360)
-- Problem: Problem list
-- URL: https://www.naukri.com/code360/problems/delete-duplicate-emails_2111947
-- Language: SQL
-- Difficulty: Hard
-- Topics: SQL Databases Clear all, SQL Databases
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:55:48.993Z

DELETE FROM Person
WHERE Id NOT IN (
    SELECT MIN(Id)
    FROM Person
    GROUP BY Email
);
