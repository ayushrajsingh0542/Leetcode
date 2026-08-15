-- Last updated: 15/08/2026, 19:52:53
# Write your MySQL query statement below
with sc1 as (
select user_id,count(action) as total
from confirmations
group by user_id),
sc2 as (
select user_id,count(action) as cnf
from confirmations 
where action='confirmed'
group by user_id),
sc3 as (
select sc1.user_id,coalesce(round(sc2.cnf/sc1.total,2),0) as cnf_rate
from sc1
left join sc2 on sc1.user_id=sc2.user_id)
select a.user_id,coalesce(sc3.cnf_rate,0) as confirmation_rate
from Signups a
left join sc3 on a.user_id=sc3.user_id
