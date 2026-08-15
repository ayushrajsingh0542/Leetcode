-- Last updated: 15/08/2026, 19:53:33
# Write your MySQL query statement below
select user_id,
concat(upper(left(name,1)),lower(substring(name,2,length(name)))) as name
from users
order by user_id