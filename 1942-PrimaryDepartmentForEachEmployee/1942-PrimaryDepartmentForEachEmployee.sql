-- Last updated: 15/08/2026, 19:53:07
# Write your MySQL query statement below
with e1 as (
select *,count(employee_id) over (partition by employee_id) as count 
from employee)
select employee_id,department_id 
from e1 
where count=1 or primary_flag='Y'