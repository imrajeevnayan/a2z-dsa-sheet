# Wave Array

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/wave-array-1587115621/1)

## Solved On
28 Oct 2026 at 12:20 am

<h2><a href="https://www.geeksforgeeks.org/problems/wave-array-1587115621/1">Wave Array</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an <strong>s</strong><strong>orted</strong> array arr[] of integers. Sort the array into a wave-like array (In Place). In other words,<strong> </strong>arrange the elements into a sequence such that : arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and so on. If there are multiple solutions, find the lexicographically smallest one.</span></p><p><span style="font-size: 14pt;"><strong>Note: </strong>The given array is sorted in ascending order, and modify the given array in-place without returning a new array.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5]
<strong>Output: </strong>[2, 1, 4, 3, 5]<strong>
Explanation: </strong>Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 4, 7, 8, 9, 10]
<strong>Output: </strong>[4, 2, 8, 7, 10, 9]<strong>
Explanation: </strong>Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.<br></span></pre><pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1]<br><strong>Output:</strong> [1]</span></pre>