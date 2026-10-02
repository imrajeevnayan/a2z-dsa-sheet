-- Platform: Coding Ninjas (Code360)
-- Problem: Friend Request
-- URL: https://www.naukri.com/code360/problems/friend-request_2111952
-- Language: SQL
-- Difficulty: Medium
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:56:33.949Z

SELECT 
    ROUND(
        IFNULL(
            (SELECT COUNT(*) FROM RequestAccepted) / 
            NULLIF((SELECT COUNT(DISTINCT sender_id, send_to_date) FROM FriendRequest), 0),
        0),
    2) AS accept_rate;
