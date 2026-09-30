/*
 * Platform: InterviewBit
 * Problem: Performance Improvement
 * URL: https://www.interviewbit.com/problems/performance-improvement/
 * Language: Java
 * Difficulty: Medium
 * Topics: Databases, SQL Programming, Description, Discussion, Submissions, Hints, Same Countries 24 Minutes Medium Asked in:, 5'th Highest Marks 23 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-29T18:21:10.620Z
 */

SELECT t1.TestId
FROM Tests t1
JOIN Tests t2 ON t1.TestId = t2.TestId + 1
WHERE t1.Marks > t2.Marks;
