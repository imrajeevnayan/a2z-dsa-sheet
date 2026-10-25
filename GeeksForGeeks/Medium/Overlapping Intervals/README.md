# Overlapping Intervals

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1)

## Solved On
26 Oct 2026 at 12:03 am

<h2><a href="https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1">Overlapping Intervals</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array of intervals <strong>arr[][] </strong>of size n, where <strong>arr[i]</strong> = <strong>[start<sub>i</sub>, end<sub>i</sub>]</strong> represents the start and end points of the ith interval, merge all overlapping intervals and return the resulting array of non-overlapping intervals.<br><strong>Note: </strong>Two intervals [a, b] and [c, d] such that a </span><span style="font-size: 18px;">≤ c,</span><span style="font-size: 18px;"> are considered overlapping if&nbsp;&nbsp;</span><span style="font-size: 18px;">c </span><span style="font-size: 18px;">≤ </span><span style="font-size: 18px;">b.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr</span><span style="font-size: 18px;">[][]</span><span style="font-size: 18px;"> = [[1, 3], [2, 4], [6, 8], [9, 10]]
<strong>Output: </strong>[[1, 4], [6, 8], [9, 10]]<strong>
Explanation: </strong>In the given intervals we have only two overlapping intervals here, [1, 3] and [2, 4] which on merging will become [1, 4]. Therefore we will return [[1, 4], [6, 8], [9, 10]].</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[][] = [[6, 8], [1, 9], [2, 4], [4, 7]]
<strong>Output: </strong>[[1, 9]]<br><strong>Explanation: </strong>In the given intervals all the intervals overlap with the interval [1, 9]. Therefore we will return [1, 9].<br></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>5</sup><br>0 ≤ start<sub>i</sub> ≤ end<sub>i</sub> ≤ 10<sup>6</sup></span></p>