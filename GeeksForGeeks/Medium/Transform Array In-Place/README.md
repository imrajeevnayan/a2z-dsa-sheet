# Transform Array In-Place

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1)

## Solved On
26 Oct 2026 at 12:19 am

<h2><a href="https://www.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1">Transform Array In-Place</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an integer array<strong> arr[]</strong> of size <strong>n</strong>, where each element lies in the range [0, n-1], transform the array such that every element at index <strong>i</strong> becomes:<br></span><strong><span style="font-size: 18px;">arr[i]=arr[arr[i]].</span></strong></p>
<p><span style="font-size: 18px;">The transformation must be performed in-place, meaning the same array should store both the original and updated values without using another array.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 0]
<strong>Output: </strong>[0, 1]<strong>
Explanation: </strong></span><span style="font-size: 18px;">The original array is [1, 0]. <br>At index 0, arr[0] = 1, so the new value becomes arr[1] = 0. <br>At index 1, arr[1] = 0, so the new value becomes arr[0] = 1. <br>Thus, the transformed array becomes [0, 1].</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [4, 0, 2, 1, 3]
<strong>Output: </strong>[3, 4, 2, 0, 1]<strong>
Explanation: </strong></span><span style="font-size: 18px;">The original array is [4, 0, 2, 1, 3]. <br>Each element is replaced by the value at index arr[i] in the original array. <br>So the new values become 3, 4, 2, 0, 1 respectively, and the transformed array becomes [3, 4, 2, 0, 1].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ n ≤ 4*10<sup>4</sup><br>0 ≤ arr[i] &lt; n</span></p>