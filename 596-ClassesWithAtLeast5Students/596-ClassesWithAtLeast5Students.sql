-- Last updated: 15/08/2026, 20:01:01
# Write your MySQL query statement below
select class
from courses
group by class
having count(class)>=5;