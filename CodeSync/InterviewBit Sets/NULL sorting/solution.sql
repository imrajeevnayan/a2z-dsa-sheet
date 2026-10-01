-- Platform: InterviewBit
-- Problem: NULL sorting
-- URL: https://www.interviewbit.com/problems/null-sorting/
-- Language: SQL
-- Difficulty: Hard
-- Topics: Databases, SQL Programming, Description, Discussion, Submissions, Hints, Student Query 8 Minutes Easy Asked in:, Many Tables 21 Minutes Easy Asked in:
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-01T18:09:42.087Z

SELECT Name
FROM Students
ORDER BY
  (TRIM(UPPER(Marks)) = 'ABSENT') DESC,
  CASE WHEN TRIM(UPPER(Marks)) = 'ABSENT' THEN Name END ASC,
  CASE WHEN TRIM(UPPER(Marks)) <> 'ABSENT' THEN CAST(Marks AS UNSIGNED) END ASC,
  Name ASC;
