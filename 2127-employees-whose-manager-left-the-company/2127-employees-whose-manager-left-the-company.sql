# Write your MySQL query statement below
WITH cte AS(
SELECT *
FROM Employees
WHERE salary < 30000)

SELECT employee_id
FROM cte
WHERE manager_id NOT IN (SELECT employee_id FROM Employees)
ORDER BY employee_id