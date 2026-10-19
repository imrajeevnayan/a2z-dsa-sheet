-- Platform: Coding Ninjas (Code360)
-- Problem: IMDb Genre (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/imdb_1755912
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-19T19:20:43.675Z

SELECT
    g.genre,
    MAX(e.domestic + e.worldwide - m.budget) AS net_profit
FROM imdb m
JOIN earning e
    ON m.movie_id = e.movie_id
JOIN genre g
    ON m.movie_id = g.movie_id
WHERE m.title LIKE '%2012%'
  AND g.genre IS NOT NULL
  AND e.domestic IS NOT NULL
  AND e.worldwide IS NOT NULL
  AND m.budget IS NOT NULL
GROUP BY g.genre
ORDER BY g.genre;
