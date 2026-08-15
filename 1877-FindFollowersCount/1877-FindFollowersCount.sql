-- Last updated: 15/08/2026, 19:53:26
# Write your MySQL query statement below
select user_id,count(*) as followers_count
from followers
group by user_id
order by user_id asc;