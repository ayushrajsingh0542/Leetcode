-- Last updated: 15/08/2026, 19:51:40
# Write your MySQL query statement below
select teacher_id, count(distinct subject_id) as cnt
from Teacher
group by teacher_id;