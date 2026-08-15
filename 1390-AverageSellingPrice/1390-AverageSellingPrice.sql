-- Last updated: 15/08/2026, 19:55:50
# Write your MySQL query statement below
with pu as (
select p.product_id,
p.price*u.units as ex
from Prices p
left join UnitsSold u on p.product_id=u.product_id
and u.purchase_date between p.start_date and p.end_date),
pu2 as (
    select pu.product_id,
sum(ex) as total_price
from pu
group by pu.product_id
),pu3 as (
    select
    product_id,
    sum(units) as total_units
    from UnitsSold
    group by product_id
)
select pu2.product_id,
coalesce(Round(pu2.total_price/pu3.total_units,2),0) as average_price
from pu2
left join pu3 on pu2.product_id=pu3.product_id
group by pu2.product_id;
