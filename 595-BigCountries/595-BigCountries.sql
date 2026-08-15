-- Last updated: 15/08/2026, 20:01:10
# Write your MySQL query statement below
select name,population,area
from World
where (area>=3000000) or (population>=25000000)