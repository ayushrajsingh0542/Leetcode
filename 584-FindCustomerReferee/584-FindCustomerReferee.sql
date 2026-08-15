-- Last updated: 15/08/2026, 20:01:05
# Write your MySQL query statement below
Select name
from Customer
where (referee_id!=2) or (referee_id IS NULL)