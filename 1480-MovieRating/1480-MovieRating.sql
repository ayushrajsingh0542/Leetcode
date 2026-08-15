-- Last updated: 15/08/2026, 19:55:01
# Write your MySQL query statement below
with mum1 as (
select *,count(user_id) as count
from MovieRating 
group by user_id
order by count(user_id) desc),

mum2 as (
select a.movie_id,a.user_id,a.rating,a.created_at,a.count,b.name as username
from mum1 a
join Users b on a.user_id=b.user_id
order by a.count desc , b.name asc
limit 1),
mum3 as (
select *,avg(rating) over(partition by movie_id) as avg
from MovieRating 
having month(created_at)=2 and year(created_at)=2020),
mum4 as (
select movie_id,max(avg) as max  from mum3
group by movie_id
order by avg desc),
mum5 as (
select a.movie_id,b.title,a.max
from mum4 as a
join movies b on a.movie_id=b.movie_id
order by a.max desc, b.title
limit 1)
select username as results
from mum2
union all
select title
from mum5





