-- Platform: Coding Ninjas (Code360)
-- Problem: Combine Two Tables (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/combine-two-tables_2110759
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:04:48.674Z

select p.FirstName ,p.LastName,a.city,a.state
From Person p Left Join Address a 
on p.PersonId=a.PersonId;
