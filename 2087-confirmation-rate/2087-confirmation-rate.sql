# Write your MySQL query statement below
SELECT s.user_id,
CASE WHEN c.user_id IS NULL
THEN 0
ELSE ROUND(SUM(c.action='confirmed')/COUNT(*),2)
END AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
    ON s.user_id = c.user_id
GROUP BY s.user_id