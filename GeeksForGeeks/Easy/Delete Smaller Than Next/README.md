# Delete Smaller Than Next

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller3115/1)

## Solved On
07 Nov 2026 at 08:47 pm

<h2><a href="https://www.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller3115/1">Delete Smaller Than Next</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given an array<strong> arr[] </strong>and a number <strong>k</strong>. Delete <strong>k</strong> elements that are smaller than the next element (i.e., we delete arr[i] if arr[i] &lt; arr[i+1]) or become smaller than the next because the next element is deleted.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [20, 10, 25, 30, 40], k = 2
<strong>Output: </strong>[25, 30, 40]
<strong>Explanation: </strong>First we delete 10 because it follows arr[i] &lt; arr[i+1]. Then we delete 20 because 25 is moved next to it and it also starts following the condition.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [3, 100, 1] , k = 1<strong>
Output: </strong>[100, 1] </span></pre>
