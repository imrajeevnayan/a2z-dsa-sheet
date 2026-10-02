-- Platform: Coding Ninjas (Code360)
-- Problem: Problem list
-- URL: https://www.naukri.com/code360/problems/top-travellers_2117112
-- Language: SQL
-- Difficulty: Hard
-- Topics: SQL Databases Clear all, SQL Databases
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:24:53.682Z

SELECT
    u.name,
    COALESCE(SUM(r.distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r
    ON u.id = r.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name ASC;
