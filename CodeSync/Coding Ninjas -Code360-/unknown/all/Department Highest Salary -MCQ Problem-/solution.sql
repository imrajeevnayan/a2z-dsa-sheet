-- Platform: Coding Ninjas (Code360)
-- Problem: Department Highest Salary (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/department-highest-salary_2119329
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:15:24.279Z

WITH CTE AS (
 
SELECT  B.NAME, MAX(SALARY) AS SALARY
 
FROM  DEPARTMENT B JOIN EMPLOYEE A
 
ON A.DEPARTMENTID = B.ID
 
GROUP BY B.NAME
 
)
 
SELECT CTE.NAME AS "Department",N.NAME AS "Employee",CTE.SALARY AS "salary"  FROM CTE INNER JOIN EMPLOYEE N
 
ON CTE.SALARY = N.SALARY ORDER BY CTE.NAME,N.NAME desc
