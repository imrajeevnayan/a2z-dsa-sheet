# Closest Three Sum

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/three-sum-closest/1)

## Solved On
29 Sept 2026 at 11:13 pm

<h2><a href="https://www.geeksforgeeks.org/problems/three-sum-closest/1">Closest Three Sum</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array, <strong>a</strong><strong>rr[]</strong> of integers, and another number <strong>target</strong>, find three integers in the array such that their sum is closest to the target. Return the sum of the three integers.</span></p>
<p><span style="font-size: 18px;">Note: If there are multiple solutions, return the maximum one.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [-1, 2, 2, 4], target = 4<strong><br>Output: </strong>5<strong><br>Explanation: </strong>All possible triplets<br>[-1, 2, 2], sum = (-1) + 2 + 2 = 3<br>[-1, 2, 4], sum = (-1) + 2 + 4 = 5<br>[-1, 2, 4], sum = (-1) + 2 + 4 = 5<br>[2, 2, 4], sum = 2 + 2 + 4 = 8<br>Triplet [-1, 2, 2], [-1, 2, 4] and [-1, 2, 4] have sum closest to target, so return the maximum one, that is 5.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 10, 4, 5], target = 10<strong><br>Output: </strong>10<strong><br>Explanation:</strong> All possible triplets<br>[1, 10, 4], sum = (1 + 10 + 4) = 15<br>[1, 10, 5], sum = (1 + 10 + 5) = 16<br>[1, 4, 5], sum = (1 + 4 + 5) = 10<br>[10, 4, 5], sum = (10 + 4 + 5) = 19 <br>Triplet [1, 4, 5] has sum = 10 which is closest to target<strong>.</strong></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>3 ≤ arr.size() ≤ 10<sup>3</sup><br>-10<sup>5</sup> ≤ arr[i] ≤ 10<sup>5</sup><br>1 ≤ target&nbsp;≤ 10<sup>5</sup></span></p>