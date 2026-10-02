-- Platform: Coding Ninjas (Code360)
-- Problem: Duplicate Emails (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/duplicate-emails_2105465
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:26:02.510Z

SELECT Email from Person
GROUP BY Email
HAVING COUNT(Email)>1;
