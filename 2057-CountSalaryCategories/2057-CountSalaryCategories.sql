-- Last updated: 15/08/2026, 19:52:56
# Write your MySQL query statement below
with a1 as (
select account_id,income,
case
when income<20000 then "Low Salary"
when income>=20000 and income<=50000 then "Average Salary"
else "High Salary"
end as category
from accounts),

 a2 as(
    Select "Low Salary"  as category
    union all 
    select "Average Salary"
    union all
    select "High Salary"
)

select a2.category,count(a1.account_id) as accounts_count
from a2
left join a1 on a1.category=a2.category
group by a2.category;