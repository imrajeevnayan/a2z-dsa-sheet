-- Platform: Coding Ninjas (Code360)
-- Problem: IMDb Metacritic Rating (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/imdb_1755910
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-19T19:17:48.785Z

SELECT i.Title, i.Rating
FROM IMDB i
JOIN earning e
ON i.Movie_id = e.Movie_id
WHERE i.MetaCritic > 60
  AND e.Domestic > 100000000
  AND i.Title LIKE '%2012%';
