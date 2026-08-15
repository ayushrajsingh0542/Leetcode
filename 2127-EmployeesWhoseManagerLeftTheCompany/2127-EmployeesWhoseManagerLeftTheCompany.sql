-- Last updated: 15/08/2026, 19:52:35
# Write your MySQL query statement below
with e2 as (
select a.employee_id,a.salary,a.manager_id
from employees a
left join employees b on a.manager_id=b.employee_id
where b.employee_id is null
order by a.employee_id)

select employee_id from e2 
where manager_id is not null and salary<30000





