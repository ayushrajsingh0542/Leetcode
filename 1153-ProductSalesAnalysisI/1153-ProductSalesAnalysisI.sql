-- Last updated: 15/08/2026, 19:57:06
# Write your MySQL query statement below
select Product.product_name,Sales.year,Sales.price
from Sales
Join Product on Product.product_id=Sales.product_id;