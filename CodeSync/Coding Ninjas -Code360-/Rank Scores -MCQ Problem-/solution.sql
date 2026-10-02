-- Platform: Coding Ninjas (Code360)
-- Problem: Rank Scores (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/rank-scores_2117771
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:22:41.510Z

SELECT Score as score ,
dense_rank()over(ORDER BY Score DESC) as "Rank"
FROM Scores
ORDER BY Score desc;
