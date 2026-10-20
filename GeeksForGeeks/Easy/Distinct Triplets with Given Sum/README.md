# Distinct Triplets with Given Sum

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/find-all-distinct-triplets-with-given-sum/1)

## Solved On
20 Oct 2026 at 05:20 pm

<h2><a href="https://www.geeksforgeeks.org/problems/find-all-distinct-triplets-with-given-sum/1">Distinct Triplets with Given Sum</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;">Given an array <strong data-start="521" data-end="530">arr[]</strong> of integers and an integer <strong data-start="558" data-end="568">target. </strong>Return all possible unique triplets [a, b, c] in the array whose sum is equal to the given<strong> </strong>target. Each triplet must be arranged in non-decreasing order (a ≤ b ≤ c). </span></p>
<p><span style="font-size: 18.6667px;">The triplets may be returned in any order. The driver will sort the output before comparison.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [12, 3, 6, 1, 6, 9], target = 24 </span><span style="font-size: 18px;">
<strong>Output: </strong>[[3, 9, 12], [6, 6, 12]]<strong>
Explanation: </strong></span><span style="font-size: 18px;">Triplets with sum 24 are [3, 9, 12] and [6, 6, 12]. </span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 1, 1, 1], target = 3
<strong>Output: </strong>[[1, 1, 1]]<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">Triplets with sum 3 are [1, 1, 1]. </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [10, 12, 10, 15],</span><span style="font-size: 18px;"> target = 32</span><span style="font-size: 18px;">
<strong>Output: </strong>[[10, 10, 12]]</span><span style="font-size: 14pt;"><strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">Triplets with sum 32 are [10, 10, 12].</span></pre>