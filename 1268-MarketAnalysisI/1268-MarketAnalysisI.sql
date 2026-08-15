-- Last updated: 15/08/2026, 19:56:33
# Write your MySQL query statement below
with ue1 as (
    select * from orders 
    where year(order_date)=2019
),
ue2 as(
select a.user_id,a.join_date,b.order_date,b.buyer_id
from users a
left join ue1 b on a.user_id=b.buyer_id),
ue3 as (
select user_id,coalesce(count(order_date),0) as orders_in_2019
from ue2
group by user_id)

select ue3.user_id as buyer_id,b.join_date,ue3.orders_in_2019
from ue3
left join users b on ue3.user_id=b.user_id


