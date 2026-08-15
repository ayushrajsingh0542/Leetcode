-- Last updated: 15/08/2026, 20:05:21
# Write your MySQL query statement below
select score , dense_rank() over(order by score desc) as 'rank'
from scores
