-- Platform: Coding Ninjas (Code360)
-- Problem: Swap Salary (MCQ Problem)
-- URL: https://www.naukri.com/code360/problems/swap-salary_2110762
-- Language: SQL
-- Difficulty: Easy
-- Topics: SQL, 2 solved: 1 Easy 1 Moderate 0 Hard + Ninja
-- Runtime: N/A
-- Memory: N/A
-- Synced: 2026-09-12T17:00:52.795Z

update salary
set sex=case
        when sex='m'then 'f'
        when sex='f'then 'm'
        End;
