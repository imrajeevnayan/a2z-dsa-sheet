-- Platform: Coding Ninjas (Code360)
-- Problem: IMDb Rating (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/testingg-sql_1755903
-- Language: SQL
-- Difficulty: Unknown
-- Topics: Uncategorized
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:10:49.724Z

select title,rating from IMDB 
where movie_id in(select movie_id from genre where genre like 'C%')
and  title like '%2014%'
and budget > 40000000
