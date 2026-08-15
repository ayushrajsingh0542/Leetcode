-- Last updated: 15/08/2026, 20:01:00
# Write your MySQL query statement below
with r1 as (
select requester_id as totalid
from RequestAccepted 
union all
select accepter_id
from RequestAccepted)

select totalid as id,count(totalid) as num
from r1
group by totalid
order by count(totalid) desc
limit 1



