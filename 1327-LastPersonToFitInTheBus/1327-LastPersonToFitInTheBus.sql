-- Last updated: 15/08/2026, 19:55:59
# Write your MySQL query statement below
with q1 as (
select *,
sum(weight) over (order by turn) as sum
 from Queue
)
select person_name
from q1
where sum<=1000
order by sum desc
limit 1;
