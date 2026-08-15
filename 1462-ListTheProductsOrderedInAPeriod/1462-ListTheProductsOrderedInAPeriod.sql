-- Last updated: 15/08/2026, 19:55:14
# Write your MySQL query statement below
with op1 as (
select * from orders
where month(order_date)=2 and year(order_date)=2020),
 op2 as (
select product_id,sum(unit) as total
from op1
group by product_id
having sum(unit)>=100)

select a.product_name,op2.total as unit
from op2
join products a on a.product_id=op2.product_id