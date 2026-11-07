# Max Sum of 2 Smallest Across Subarrays

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/1)

## Solved On
07 Nov 2026 at 09:48 pm

<h2><a href="https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/1">Max Sum of 2 Smallest Across Subarrays</a></h2><h3>Difficulty Level: Medium</h3><hr><p data-start="133" data-end="195"><span style="font-size: 14pt;">Given an array arr[] of integers. Find the maximum sum of the smallest and second smallest elements across all subarrays (of size &gt;= 2) of the given array.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input:</strong><span style="font-size: 14pt;"> arr[] = [4, 3, 5, 1]
</span><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 8
</span><strong style="font-size: 14pt;">Explanation: </strong>A<span style="font-size: 18.6667px;">ll subarrays with at least 2 elements and find the two smallest numbers in each:
[4, 3] -&gt; 3 + 4 = 7
[4, 3, 5] -&gt; 3 + 4 = 7
[4, 3, 5, 1] -&gt; 1 + 3 = 4
[3, 5] -&gt; 3 + 5 = 8
[3, 5, 1] -&gt; 1 + 3 = 4
[5, 1] -&gt; 1 + 5 = 6<br></span></span><span style="font-size: 14pt;"><span style="font-size: 14pt;">Maximum Score is 8.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1, 2, 3]
<strong>Output:</strong> 5<br><strong>Explanation: </strong>All subarray with at least 2 elements and find the two smallest numbers in each:<strong><br></strong></span><span style="font-size: 14pt;">[1, 2] -&gt; 1 + 2 = 3<br></span><span style="font-size: 14pt;">[1, 2, 3] -&gt; 1 + 2 = 3<br>[2, 3] -&gt; 2 + 3 = 5<br>Maximum Score is 5</span></pre>
