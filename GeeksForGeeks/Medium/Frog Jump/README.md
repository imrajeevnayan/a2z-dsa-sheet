# Frog Jump

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/geek-jump/1)

## Solved On
29 Sept 2026 at 07:34 pm

<h2><a href="https://www.geeksforgeeks.org/problems/geek-jump/1">Frog Jump</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an integer array <strong>height[]</strong> where height[i] represents the height of the i-th stair, a frog starts from the first stair and wants to reach the last stair. </span></p>
<p><span style="font-size: 18px;">From any stair i, the frog has two options: it can either jump to the (i+1)th stair or the (i+2)th stair. The cost of a jump is the absolute difference in height between the two stairs. </span></p>
<p><span style="font-size: 18px;">Determine the minimum total cost required for the frog to reach the last stair.</span></p>
<p><span style="font-size: 18px;"><strong>Example:<br></strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> heights[] = [20, 30, 40, 20]</span><br><span style="font-size: 18px;"><strong>Output:</strong> 20</span><br><span style="font-size: 18px;"><strong>Explanation:</strong> Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:</span><br><span style="font-size: 18px;">jump from stair 0 to 1: cost = |30 - 20| = 10</span><br><span style="font-size: 18px;">jump from stair 1 to 3: cost = |20 - 30| = 10</span><br><span style="font-size: 18px;">Total Cost = 10 + 10 = 20</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> heights[] = [30, 20, 50, 10, 40]</span><br><span style="font-size: 18px;"><strong>Output:</strong> 30</span><br><span style="font-size: 18px;"><strong>Explanation:</strong> Minimum cost will be incurred when frog jumps from stair 0 to 2 then 2 to 4:</span><br><span style="font-size: 18px;">jump from stair 0 to 2: cost = |50 - 30| = 20</span><br><span style="font-size: 18px;">jump from stair 2 to 4: cost = |40 - 50| = 10<br></span><span style="font-size: 18px;">Total Cost = 20 + 10 = 30</span></pre>
