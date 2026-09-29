# Count Subarrays with k Odds

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1)

## Solved On
29 Sept 2026 at 11:16 pm

<h2><a href="https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1">Count Subarrays with k Odds</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">You are given an array <strong>arr[]</strong> of positive integers and an integer <strong>k</strong>. You have to <strong>count </strong>the number of subarrays that contain exactly k <strong>odd numbers</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 5, 6, 9], k = 2
<strong>Output: </strong>2</span><span style="font-size: 18px;">
<strong>Explanation: </strong></span><span style="font-size: 14pt;">There are 2 subarrays with 2 odds: [2, 5, 6, 9] and [5, 6, 9].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [<span style="color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; text-wrap-mode: wrap; background-color: #f9f9f9;">2, 2, 5, 6, 9, 2, 11</span>], k = 2
<strong>Output: </strong>8<br><strong>Explanation: </strong>There are 8 subarrays with 2 odds: [2, 2, 5, 6, 9], [2, 5, 6, 9], [5, 6, 9], [2, 2, 5, 6, 9, 2], [2, 5, 6, 9, 2], [5, 6, 9, 2], [6, 9, 2, 11] and [9, 2, 11].</span></pre>