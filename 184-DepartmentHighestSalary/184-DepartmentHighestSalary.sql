-- Last updated: 15/08/2026, 20:05:08
# Write your MySQL query statement below
with ed1 as (
select a.id,a.name,a.salary,a.departmentId,b.name as depname,dense_rank() over(partition by a.departmentId order by salary desc) as rn
from employee a
join department b on a.departmentId=b.id)

select depname as Department,name as Employee,Salary
from ed1
where rn=1

