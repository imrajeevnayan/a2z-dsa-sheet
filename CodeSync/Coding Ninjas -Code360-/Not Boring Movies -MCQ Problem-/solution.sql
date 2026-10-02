-- Platform: Coding Ninjas (Code360)
-- Problem: Not Boring Movies (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/not-boring-movies_2117047
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:58:41.069Z

SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description != 'boring'
ORDER BY rating DESC;
