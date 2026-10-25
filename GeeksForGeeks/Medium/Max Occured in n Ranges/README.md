# Max Occured in n Ranges

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/maximum-occured-integer4602/1)

## Solved On
26 Oct 2026 at 12:04 am

<h2><a href="https://www.geeksforgeeks.org/problems/maximum-occured-integer4602/1">Max Occured in n Ranges</a></h2><h3>Difficulty Level: Medium</h3><hr><p data-pm-slice="0 0 []"><span style="font-size: 14pt;">You are given two integer arrays <strong>L[]</strong> and <strong>R[]</strong>, where each <strong>L[i]</strong> and <strong>R[i]</strong> define the start and end of a range respectively. The goal is to find the integer that appears in the most number of these ranges. If multiple integers occur in the same maximum number of ranges, then return the smallest integer among them.&nbsp;<br></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> L[] = [1, 4, 3, 1], R[] = [15, 8, 5, 4]
<strong>Output: </strong>4<strong>
Explanation: </strong>The given ranges are [1, 15] [4, 8] [3, 5] [1, 4]. The smallest number that is most common or appears most times in the ranges is 4.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>L[] = [1, 5, 9, 13, 21], R[] = [15, 8, 12, 20, 30]
<strong>Output: </strong>5<strong>
Explanation: </strong>The given ranges are [1, 15] [5, 8] [9, 12] [13, 20] [21, 30]. The smallest number that is most common or appears most times in the ranges is 5.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ L.size() ≤ 10<sup>6</sup><br>0 ≤ L[i], R[i] ≤ 10<sup>6</sup></span></p>