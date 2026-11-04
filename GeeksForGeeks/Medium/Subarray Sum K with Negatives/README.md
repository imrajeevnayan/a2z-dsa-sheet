# Subarray Sum K with Negatives

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/hopscotch4857/1)

## Solved On
04 Nov 2026 at 11:34 pm

<h2><a href="https://www.geeksforgeeks.org/problems/hopscotch4857/1">Subarray Sum K with Negatives</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an array of integers <strong>arr[]</strong> and an integer <strong>k</strong>, find the starting and ending indices of a contiguous subarray whose sum is equal to k. If multiple subarrays have a sum equal to k, return the indices of the 1st valid subarray. If no such subarray exists, return [-1, -1].</span></p><p><span style="font-size: 14pt;"><strong>Note:</strong> Use 0-based indexing.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong><strong>Input:</strong></strong> arr[] = [1, 4, 20, 3, 10, 5], k = 33</span><br><span style="font-size: 14pt;"><strong><strong>Output:</strong></strong> [2, 4]</span><br><span style="font-size: 14pt;"><strong><strong>Explanation:</strong></strong> Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33</span></pre><pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [2, 12, -2, -20, 10], k = -10<br><strong>Output:</strong> [1, 3]<br><strong>Explanation:</strong> Sum of elements between indices 0 and 3 is 12 - 2 - 20 = -10</span></pre><pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [-10, 0, 2, -2, -20, 10], k = 20<br><strong>Output:</strong> [-1, -1]<br><strong>Explanation:</strong> There is no subarray with the given sum</span></pre>