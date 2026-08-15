-- Last updated: 15/08/2026, 19:55:37
# Write your MySQL query statement below
with stsubpair as(
    select s.student_id,s.student_name,sub.subject_name
    from Students s cross join Subjects sub
)

Select sp.student_id,sp.student_name,sp.subject_name,
count(e.subject_name) as attended_exams
from stsubpair sp
left join Examinations e on 
sp.student_id=e.student_id
and sp.subject_name=e.subject_name
group by
sp.student_id,
sp.student_name,
sp.subject_name
order by
sp.student_id,
sp.subject_name