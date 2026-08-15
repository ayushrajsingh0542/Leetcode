-- Last updated: 15/08/2026, 19:56:35
# Write your MySQL query statement below
select distinct author_id as id
from Views
Where author_id=viewer_id
order by author_id ASC