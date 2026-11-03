-- Platform: LeetCode
-- Problem: 511. Game Play Analysis I
-- URL: https://leetcode.com/problems/game-play-analysis-i/description/?envType=problem-list-v2&envId=database
-- Language: SQL
-- Difficulty: Easy
-- Topics: Database
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-11-03T14:38:44.366Z

+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| player_id    | int     |
| device_id    | int     |
| event_date   | date    |
| games_played | int     |
+--------------+---------+
(player_id, event_date) is the primary key (combination of columns with unique values) of this table.
This table shows the activity of players of some games.
Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.
