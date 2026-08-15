-- Last updated: 15/08/2026, 19:57:11
# Write your MySQL query statement below
with cp1 as(
select customer_id,count(distinct product_key) as count
from customer
group by customer_id),
cp2 as (
select count(*) as total
from product)
select cp1.customer_id
from cp1
join cp2 on cp1.count=cp2.total;