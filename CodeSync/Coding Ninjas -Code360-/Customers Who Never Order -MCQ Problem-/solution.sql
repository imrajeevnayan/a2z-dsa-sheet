-- Platform: Coding Ninjas (Code360)
-- Problem: Customers Who Never Order (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/customers-who-never-order_2111946
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-10-02T06:39:00.290Z

SELECT customers.NameCust AS "Customers"
FROM customers
WHERE customers.id NOT IN (
    SELECT CustomerId
    FROM Orders
);
