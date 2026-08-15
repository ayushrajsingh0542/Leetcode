-- Last updated: 15/08/2026, 19:54:53
# Write your MySQL query statement below
select EmployeeUNI.unique_id,Employees.name
from EmployeeUNI
right Join Employees on EmployeeUNI.id=Employees.id;