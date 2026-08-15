-- Last updated: 15/08/2026, 19:53:19
# Write your MySQL query statement below
with e1 as (
select reports_to,Round(Avg(age)) as average_age,count(reports_to) as reports_count
from employees
where reports_to is not null
group by reports_to)

select e1.reports_to as employee_id,e.name,e1.reports_count,e1.average_age
from e1
left join employees e on e1.reports_to=e.employee_id
order by e.employee_id;