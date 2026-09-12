-- Platform: Coding Ninjas (Code360)
-- Problem: Department Highest Salary (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/department-highest-salary_2119329
-- Language: SQL
-- Difficulty: Unknown
-- Topics: SQL, 40 Easy Students DB 0, 40 Easy IMDb Genre 0, 120 Hard Sales Executive 0, 40 Easy IMDb Max Weighted Rating 0, 40 Easy Big Countries 0, 40 Easy Director's Actor 0, 40 Easy Rank Scores 0
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:16:11.731Z

WITH CTE AS (
    SELECT
        B.NAME AS Department,
        A.NAME AS Employee,
        A.SALARY,
        DENSE_RANK() OVER (
            PARTITION BY A.DEPARTMENTID
            ORDER BY A.SALARY DESC
        ) AS rnk
    FROM DEPARTMENT B
    JOIN EMPLOYEE A
        ON A.DEPARTMENTID = B.ID
)
 
SELECT
    Department,
    Employee,
    Salary
FROM CTE
WHERE rnk = 1
ORDER BY Department, Employee DESC;
