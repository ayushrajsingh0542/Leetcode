-- Last updated: 15/08/2026, 20:00:53
# Write your MySQL query statement below

SELECT *, IF(x+y>z and y+z>x and z+x>y, "Yes", "No") as triangle FROM Triangle