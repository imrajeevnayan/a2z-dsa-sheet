# Repeated Removal of Kth

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/ishaans-internship4400/1)

## Solved On
27 Oct 2026 at 06:31 pm

<h2><a href="https://www.geeksforgeeks.org/problems/ishaans-internship4400/1">Repeated Removal of Kth</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 14pt;">Given two integers <strong>n</strong> and <strong>k</strong>, consider the integers from 1 to n. In each operation, keep every kth remaining integer and remove all others. Repeat this process until the number of remaining integers becomes less than k. Return the smallest integer among the remaining integers.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 30, k = 3
<strong>Output: </strong>27<br><strong data-start="557" data-end="573">Explanation</strong><strong>: </strong>After the first operation, the remaining integers are: 3 6 9 12 15 18 21 24 27 30. Similarly, after the second operation: 9 18 27, and after the third operation: 27. Therefore, the smallest remaining integer is 27.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 18, k = 3
<strong>Output: </strong>9<br><strong data-start="557" data-end="573">Explanation</strong><strong>: </strong>After the first operation, the remaining integers are: 3 6 9 12 15 18. Similarly, after the second operation: 9 18. Since the number of remaining integers is now less than k, the process stops. Therefore, the smallest remaining integer is 9.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints </strong><br>1 ≤ n ≤ 10<sup>5</sup><br>2 ≤ k ≤ 10</span></p>