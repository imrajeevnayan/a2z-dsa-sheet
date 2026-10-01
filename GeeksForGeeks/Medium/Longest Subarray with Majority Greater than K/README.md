# Longest Subarray with Majority Greater than K

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/longest-subarray-with-majority-greater-than-k/1)

## Solved On
01 Oct 2026 at 11:03 pm

<h2><a href="https://www.geeksforgeeks.org/problems/longest-subarray-with-majority-greater-than-k/1">Longest Subarray with Majority Greater than K</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array<strong> arr[]</strong> and an integer <strong>k</strong>, the task is to find the length of <strong>longest </strong>subarray in which the <strong>count </strong>of elements<strong> greater than k</strong> is <strong>more </strong>than the <strong>count </strong>of elements<strong> less than or equal to k</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input:</span><span style="font-size: 18px;"> </span></strong><span style="font-size: 18px;"><span style="font-size: 14pt;">arr[]</span><span style="font-size: 14pt;"> = [1, 2, 3, 4, 1], k = 2</span>
<strong>Output: </strong></span><span style="font-size: 18px;">3<br></span><strong><span style="font-size: 14pt;">Explanation: </span></strong><span style="font-size: 18.6667px;">The subarray [2, 3, 4] or [3, 4, 1] satisfy the given condition, and there is no subarray of length 4 or 5 which will hold the given condition, so the answer is 3.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [6, 5, 3, 4], k = 2
<strong>Output: </strong></span><span style="font-size: 18px;">4<br><strong>Explanation:</strong> In the subarray [6, 5, 3, 4], there are 4 elements &gt; 2 and 0 elements &lt;= 2, so it is the longest subarray.</span></pre>
<p><strong><span style="font-size: 18px;">Constraints:</span></strong><br><span style="font-size: 14pt;">1 ≤ arr.size() ≤ 10<sup>6 <br></sup>1 ≤ arr[i] ≤ 10<sup>6<br></sup><span style="font-size: 14pt;">0 ≤ k ≤ 10<sup>6</sup></span></span></p>