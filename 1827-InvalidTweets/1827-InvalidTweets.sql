-- Last updated: 15/08/2026, 19:53:31
# Write your MySQL query statement below
select tweet_id
from Tweets
where CHAR_LENGTH(content)>15