-- Last updated: 15/08/2026, 19:53:49
# Write your MySQL query statement below
with pu as(
select contest_id,
count(*) as total
from register
group by contest_id
order by contest_id asc),
pu2 as(
    select
    count(user_id) as totusers
    from users
), 
pu3 as (
select pu.contest_id,pu.total,pu2.totusers
from pu
cross join pu2)
select contest_id,
round((total/totusers)*100,2) as percentage 
from pu3
order by round((total/totusers)*100,2) desc,contest_id asc;