# Max Consecutive 1's with K Flips

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1)

## Solved On
19 Oct 2026 at 10:14 pm

<h2><a href="https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1">Max Consecutive 1's with K Flips</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given a binary array <strong>arr[]</strong> containing only 0s and 1s and an integer <strong>k</strong>, you are allowed to flip at most <strong>k</strong>&nbsp;0s to 1s. Find the maximum number of consecutive <strong>1's</strong> that can be obtained in the array after performing the operation at most <strong>k</strong>&nbsp;times.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 0, 1], k = 1
<strong>Output: </strong>3
<strong>Explanation: </strong></span><span style="font-size: 18.6667px;">By flipping the zero at index 1, we get the longest subarray from index 0 to 2 containing all 1’s.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 0, 0, 1, 0, 1, 0, 1], k = 2
<strong>Output: </strong>5
<strong>Explanation: </strong>By flipping the zeroes at indices 4 and 6, we get the longest subarray from index 3 to 7 containing all 1’s.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 1], k = 2
<strong>Output: </strong>2
<strong>Explanation: </strong>Since the array is already having the max consecutive 1's, hence we dont need to perform any operation. Hence the answer is 2.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>0 ≤ k ≤ arr.size()<br>0 ≤ arr[i] ≤ 1</span></p>