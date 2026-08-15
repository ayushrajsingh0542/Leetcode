-- Last updated: 15/08/2026, 20:05:24
# Write your MySQL query statement below
with e1 as (
select *,dense_rank() over(order by  salary desc) as rn
from employee)

select (select salary
from e1
where rn=2 limit 1) as SecondHighestSalary

