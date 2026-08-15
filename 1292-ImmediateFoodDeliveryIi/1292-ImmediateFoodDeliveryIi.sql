-- Last updated: 15/08/2026, 19:56:19
# Write your MySQL query statement below
with d1 as(
select count(distinct customer_id) as count
from Delivery),
d3 as (
select d2.delivery_id,d2.customer_id,d2.order_date,d2.customer_pref_delivery_date,d1.count
from delivery d2
cross join d1
order by d2.customer_id,d2.order_date ),
d4 as(
SELECT customer_id,count,order_date,customer_pref_delivery_date ,
       ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY order_date) AS rn
FROM d3)
select round((count(*)/count)*100,2) as immediate_percentage  from d4 
where rn=1 and order_date=customer_pref_delivery_date ;
