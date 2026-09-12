-- Platform: Coding Ninjas (Code360)
-- Problem: Top Travellers (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/top-travellers_2117112
-- Language: SQL
-- Difficulty: Unknown
-- Topics: in SQL
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:17:07.325Z

SELECT
    u.name,
    COALESCE(SUM(r.distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r
    ON u.id = r.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name ASC;
