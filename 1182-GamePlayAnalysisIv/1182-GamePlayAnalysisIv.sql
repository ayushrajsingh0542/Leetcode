-- Last updated: 15/08/2026, 19:56:53
# Write your MySQL query statement below
with a1 as (
select count(distinct player_id) as total from Activity),
 a2 as(
select player_id,min(event_date) as login 
from Activity
group by player_id),
a3 as(
select player_id,date_add(login,interval 1 day) as next
from a2),
a4 as (
select count(*) as ans
from a3
join activity on a3.player_id=activity.player_id and a3.next=activity.event_date),
a5 as (
select a1.total,a4.ans
from a1 
cross join a4)
select round(ans/total,2) as fraction
from a5;