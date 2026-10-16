# Counting elements in two arrays

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1)

## Solved On
16 Oct 2026 at 11:21 pm

<h2><a href="https://www.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1">Counting elements in two arrays</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">You are given two unsorted arrays <strong>a[]</strong> and <strong>b[]</strong>. Both arrays may contain duplicate elements. For each element in <strong><code>a[]</code></strong>, your task is to count how many elements in <strong><code>b[]</code></strong> are <strong>less than or equal</strong> to that element.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> a[] = [4, 8, 7, 5, 1], b[] = [4, 48, 3, 0, 1, 1, 5]
<strong>Output: </strong>[5, 6, 6, 6, 3]
<strong>Explanation: <br></strong>For a[0] = 4, there are 5 elements in b (4, 3, 0, 1, 1) that are ≤ 4.
For a[1] = 8 and a[2] = 7, there are 6 elements in b that are ≤ 8 and ≤ 7.
For a[3] = 5, there are 6 elements in b that are ≤ 5.
For a[4] = 1, there are 3 elements in b (0, 1, 1) that are ≤ 1.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> a[] = [10, 20], b[] = [30, 40, 50]
<strong>Output: </strong>[0, 0]
<strong>Explanation: <br></strong>For a[0] = 10 and a[1] = 20, there are no elements in b that are less than or equal to 10 or 20. Hence, the output is [0, 0].</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ a.size(), b.size() ≤ 10<sup>5</sup><br>0 ≤ a[i], b[j] ≤ 10<sup>5</sup></span></p>