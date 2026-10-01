# Sort according to an Array

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/relative-sorting4323/1)

## Solved On
01 Oct 2026 at 10:54 pm

<h2><a href="https://www.geeksforgeeks.org/problems/relative-sorting4323/1">Sort according to an Array</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given two integer arrays <strong>a1[] </strong>and <strong>a2[]</strong>. Sort the first array <strong>a1[] </strong>such that all the relative positions of the elements in the first array are the <strong>same</strong> as the elements in the second array <strong>a2[]</strong>.<br><strong>Note</strong>: If elements are repeated in the second array, consider their first occurance only. Elements not in a2[] should appear in a1[] at the end in ascending order.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a1[] = [2, 1, 2, 3, 4], a2[] = [2, 1, 2]
<strong>Output: </strong>[2, 2, 1, 3, 4]<strong>
Explanation: </strong>Array elements of a1[] are sorted according to a2[]. So 2 comes first then 1 comes, now we append remaining elements of a1[] in sorted order.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a1[] = [4, 1, 3, 3, 2], a2[] = [3, 1]
<strong>Output: </strong>[3, 3, 1, 2, 4]<strong>
Explanation: </strong>Elements 3 and 1 come first as per a2[]. Others (2, 4) are sorted and placed after.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ arr1.size(), arr2.size() ≤ 10<sup>6</sup><br>1 ≤ arr1[i], arr2[i] ≤ 10<sup>6</sup> </span></p>