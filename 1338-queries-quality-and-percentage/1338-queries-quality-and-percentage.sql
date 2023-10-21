# Write your MySQL query statement below

SELECT query_name, 
ROUND (SUM(rating/position)/COUNT(*) ,2)  AS quality, 
ROUND (SUM(CASE when rating < 3 then 1 else 0 end)/COUNT(*) *100 ,2) AS poor_query_percentage 
FROM Queries
GROUP BY query_name;
