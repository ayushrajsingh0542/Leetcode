-- Last updated: 15/08/2026, 20:05:26
# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.state
from person p
left join address a on p.personId=a.personId