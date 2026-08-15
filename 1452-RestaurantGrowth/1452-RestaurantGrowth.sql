-- Last updated: 15/08/2026, 19:55:24
WITH daily AS (
    SELECT visited_on, SUM(amount) AS amount
    FROM Customer
    GROUP BY visited_on
),
c2 AS (
    SELECT visited_on,
           SUM(amount) OVER(ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount_7day,
           ROW_NUMBER() OVER(ORDER BY visited_on) AS rn
    FROM daily
)
SELECT visited_on,
       amount_7day AS amount,
       ROUND(amount_7day/7, 2) AS average_amount
FROM c2
WHERE rn >= 7;  
