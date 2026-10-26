# Minimize Max Min Diff with Subarray Removal

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/minimize-the-difference/1)

## Solved On
26 Oct 2026 at 11:53 am

<h2><a href="https://www.geeksforgeeks.org/problems/minimize-the-difference/1">Minimize Max Min Diff with Subarray Removal</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">You are given an array <strong>arr[]</strong> of size <strong>n</strong>. You need to remove a subarray<strong> </strong>of size <strong>k</strong> , such that the difference between the maximum and minimum values of the remaining array is minimized. Find the minimum value obtained after performing the operation of the removal of the subarray.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input</strong>: arr = [1, 2, 3, 4, 5], k = 3 <br><strong>Output:</strong> 1<br><strong>Explanation: </strong>We remove first subarray of length 3, the remaining array is [4,5] and the difference of maximum and minimum element<strong> </strong>is<strong> </strong>1 i.e 5 - 4 = 1</span></pre><pre><span style="font-size: 14pt;"><strong>Input</strong>: arr = [2, 3, 1, 4, 6, 7], k = 3<br><strong>Output:</strong> 2<br><strong>Explanation: <br></strong>If we remove the subarray [2,3,1] then remaining array is [4,6,7] and the difference  = 7-4 = 3<br>If we remove the subarray [3,1,4] then remaining array is [2,6,7] and the difference  = 7-2 = 5<br>If we remove the subarray [1,4,6] then remaining array is [2,3,7] and the difference  = 7-2 = 5<br>If we remove the subarray [4,6,7] then remaining array is [2,3,1] and the difference  = 3-1 = 2<br>So the answer is min(3,5,5,2) = 2</span></pre>