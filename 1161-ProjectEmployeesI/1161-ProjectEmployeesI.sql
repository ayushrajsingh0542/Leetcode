-- Last updated: 15/08/2026, 19:57:01
# Write your MySQL query statement below
with pe as (
select p.project_id,p.employee_id,e.experience_years
from Project p
left join Employee e on p.employee_id=e.employee_id)
select project_id,
round(sum(experience_years)/count(*) , 2) as average_years
from pe
group by project_id;