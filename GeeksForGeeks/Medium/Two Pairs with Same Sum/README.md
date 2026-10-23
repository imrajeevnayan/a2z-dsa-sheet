# Two Pairs with Same Sum

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/satisfy-the-equation5847/1)

## Solved On
23 Oct 2026 at 10:43 pm

<h2><a href="https://www.geeksforgeeks.org/problems/satisfy-the-equation5847/1">Two Pairs with Same Sum</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of <strong>n</strong> positive integers, find four indices <strong>a</strong>, <strong>b</strong>, <strong>c</strong>, and <strong>d</strong> such that arr[a] + arr[b] = arr[c] + arr[d], where <strong>a</strong>, <strong>b</strong>, <strong>c</strong>, <strong>d </strong>are all distinct indices.</span></p><ul><li><span style="font-size: 18px;">If multiple such quadruplets exist, return the one that is lexicographically smallest when the indices are considered in the order <strong>a</strong>, <strong>b</strong>, <strong>c</strong>, <strong>d</strong>. </span></li><li><span style="font-size: 18px;">If no such quadruplet exists, return {-1, -1, -1, -1}.&nbsp; </span></li><li><span style="font-size: 18px;">Ensure <strong>a &lt; b</strong> and <strong>c &lt; d</strong>, and that the pair<strong> (a, b</strong>) is lexicographically smaller than the pair<strong> (c, d)</strong>.</span></li></ul><p><span style="font-size: 18px;"><br></span><strong style="font-size: 18px;">Examples:</strong></p><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [3, 4, 7, 1, 2, 9, 8]<strong>
Output: </strong>[0, 2, 3, 5]<strong>
Explanation: </strong>arr[0] + arr[2] = 3 + 7 = 10, arr[3] + arr[5] = 1 + 9 = 10. This is the lexicographically smallest such quadruplet of indices.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [424, 12, 31, 7]<strong>
Output: </strong>[-1, -1, -1, -1]<strong>
Explanation: </strong>No two distinct pairs of indices produce the same sum.</span></pre><p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ n ≤ 500<br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p>