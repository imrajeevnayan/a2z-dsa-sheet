-- Platform: Coding Ninjas (Code360)
-- Problem: || Accepted || Easy to understand solution. For those whose solution is not accepted, please check the output order and alias. "salary" is accepted alias and name dept name and salary should be in descending order.
-- URL: https://www.naukri.com/code360/problems/department-highest-salary_2119329
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Interview problems
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:14:35.310Z

SELECT
    Department,
    Employee,
    Salary
FROM (
    SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS rnk
    FROM Employee e
    JOIN Department d
        ON e.departmentId = d.id
) x
WHERE rnk = 1;
