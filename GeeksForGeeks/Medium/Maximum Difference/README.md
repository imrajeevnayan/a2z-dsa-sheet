# Maximum Difference

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/maximum-difference-1587115620/1)

## Solved On
26 Oct 2026 at 12:05 am

<h2><a href="https://www.geeksforgeeks.org/problems/maximum-difference-1587115620/1">Maximum Difference</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 12pt;">Given an integer array <strong>arr </strong>of<strong> </strong>integers, the task is to find the maximum absolute difference between the nearest <strong>left smaller</strong> element and the nearest <strong>right smaller </strong>element of every element in array arr. If for any component of the arr, the nearest smaller element doesn't exist then consider it as 0.</span></p>
<p><span style="font-size: 12pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>arr = [2, 1, 8]
<strong>Output:</strong> 1<br><strong>Explanation: </strong>left smaller array ls = [0, 0, 1], right smaller array rs = [1, 0, 0]. Maximum Diff of abs(ls[i] - rs[i]) = 1</span></pre>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>arr = [2, 4, 8, 7, 7, 9, 3]
<strong>Output:</strong> 4<br><strong>Explanation:</strong> left smaller array ls = [0, 2, 4, 4, 4, 7, 2], right smaller rs = [0, 3, 7, 3, 3, 3, 0]. Maximum Diff of abs(ls[i] - rs[i]) = abs(7 - 3) = 4</span></pre>
<p><span style="font-size: 12pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>6</sup><br>1&lt;= arr[i] &lt;=10<sup>9</sup><br></span></p>