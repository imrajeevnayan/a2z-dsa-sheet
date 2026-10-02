-- Platform: Coding Ninjas (Code360)
-- Problem: Friend Request
-- URL: https://www.naukri.com/code360/problems/friend-request_2111952
-- Language: SQL
-- Difficulty: Medium
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:55:55.639Z

Table: FriendRequest

+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| sender_id      | int     |
| send_to_id     | int     |
| request_date   | date    |
+----------------+---------+
There is no primary key for this table, it may contain duplicates.
This table contains the ID of the user who sent the request, the ID of the user who received the request, and the date of the request.


Table: RequestAccepted

+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| requester_id   | int     |
| accepter_id    | int     |
| accept_date    | date    |
+----------------+---------+
 There is no primary key for this table, it may contain duplicates.
