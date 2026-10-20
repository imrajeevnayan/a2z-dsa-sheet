# Subarrays Product Less than K

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1)

## Solved On
20 Oct 2026 at 05:55 pm

<h2><a href="https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1">Subarrays Product Less than K</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-family: arial, helvetica, sans-serif; font-size: 14pt;">Given an integer array <strong>arr[]</strong> of positive numbers, the task is to find the number of possible contiguous subarrays having product less than <strong>k</strong>. </span></p>
<p><span style="font-family: arial, helvetica, sans-serif; font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;"><strong style="font-family: arial, helvetica, sans-serif;">Input :</strong><span style="font-family: arial, helvetica, sans-serif;"> k = 10, arr[] = [1, 2, 3, 4]
</span><strong style="font-family: arial, helvetica, sans-serif;">Output : </strong><span style="font-family: arial, helvetica, sans-serif;">7
</span><strong style="font-family: arial, helvetica, sans-serif;">Explanation:</strong><span style="font-family: arial, helvetica, sans-serif;">
The contiguous subarrays whose product is less than 10 are [1], [2], [3], [4], [1, 2], [2, 3], and [1, 2, 3]. Therefore, the total number of valid contiguous subarrays is 7.</span></span></span></pre>
<pre><span style="font-size: 14pt;"><span style="font-family: arial, helvetica, sans-serif;"><strong>Input:</strong> k = 100, arr[] = [1, 9, 2, 8, 6, 4, 3]
<strong>Output: </strong>16<br><strong>Explanation: </strong></span><span style="font-family: arial, helvetica, sans-serif;">There are 16 contiguous subarrays whose product of elements is strictly less than 100. </span></span></pre>
<p><span style="font-size: 14pt;"><span style="font-family: arial, helvetica, sans-serif;"><strong>Constraints:<br></strong></span><span style="font-family: arial, helvetica, sans-serif;">1 ≤ n ≤ 10<sup>5</sup><br></span><span style="font-family: arial, helvetica, sans-serif;">1 ≤ k ≤ 10<sup>5</sup><br></span><span style="font-family: arial, helvetica, sans-serif;">1 ≤ arr[i] ≤ 10<sup>3</sup></span></span></p>