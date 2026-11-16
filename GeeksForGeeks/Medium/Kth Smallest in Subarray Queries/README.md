# Kth Smallest in Subarray Queries

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/easy-query3301/1)

## Solved On
16 Nov 2026 at 10:56 pm

<h2><a href="https://www.geeksforgeeks.org/problems/easy-query3301/1">Kth Smallest in Subarray Queries</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given an integer array <strong>arr[]</strong>&nbsp;and a 2D array <strong>queries[][]</strong>, where each query is represented as [l, r, k], find the kth smallest element in the subarray nums[l...r] (using 1-based indexing). </span></p><p><span style="font-size: 18.6667px;">Return an array containing the answer for each query in the same order.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [4, 1, 2, 2, 3], queries[][] = [[1, 5, 2], [3, 5, 3]]
<strong>Output: </strong>[2, 3]
<strong>Explanation: </strong>For the 1st query 2nd smallest in [1, 5] is 2. For the 2nd query 3rd smallest in [3, 5] is 3.
</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5], queries[][] = [[2, 5, 1]]
<strong>Output: </strong>[2]
<strong>Explanation: </strong>The 1st smallest in [2, 5] is 2.</span><span style="font-size: 14pt;"> </span></pre><p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ n ≤ 15000<br>1 ≤ arr[i] ≤ n<br>1 ≤ no. of queries ≤ 10<sup>4</sup><br>1 ≤ l ≤ r ≤ n<br>1 ≤ k ≤ r-l+1</span></p>