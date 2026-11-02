# Absolute Difference Divisible by K

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/absolute-difference-divisible-by-k/1)

## Solved On
02 Nov 2026 at 08:19 pm

<h2><a href="https://www.geeksforgeeks.org/problems/absolute-difference-divisible-by-k/1">Absolute Difference Divisible by K</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an&nbsp;integer array <strong>arr[]</strong> and an integer <strong>k</strong>. Count the number of pairs (i , j) such that: </span><span style="font-size: 14pt;">(i &lt; j).</span></p><p><span style="font-size: 14pt;">The absolute difference between arr[i] and arr[j] is divisible by k.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [3, 7, 11], k = 4
<strong>Output: </strong>3
<strong>Explanation:<br></strong>The valid pairs are:
(3, 7), since |3 - 7| = 4, which is divisible by 4.
(3, 11), since |3 - 11| = 8, which is divisible by 4.
(7, 11), since |7 - 11| = 4, which is divisible by 4.<br></span><span style="font-size: 14pt;">Therefore, the answer is <code dir="ltr">3</code></span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = {1, 2, 3, 4}, k = 2
<strong>Output: </strong>2
<strong>Explanation:<br></strong>The valid pairs are: <br>(1, 3), since |1 - 3| = 2, which is divisible by 2.<br>(2, 4), since |2 - 4| = 2, which is divisible by 2.<br>Therefore, the answer is <strong>2</strong>.</span></pre>