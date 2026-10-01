# Missing Element in Range

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/missing-element-in-range/1)

## Solved On
01 Oct 2026 at 11:05 pm

<h2><a href="https://www.geeksforgeeks.org/problems/missing-element-in-range/1">Missing Element in Range</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an array arr[] of integers and a range [low, high], find all the numbers within the range that are not present in the array. return the missing numbers in sorted order.</span></p>
<p><strong><span style="font-size: 14pt;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [10, 12, 11, 15], low = 10, high = 15<strong><br>Output: </strong>[13, 14]<strong><br>Explanation: </strong>Numbers <code data-start="756" data-end="760">13</code> and <code data-start="765" data-end="769">14</code> lie in the range <code data-start="787" data-end="797">[10, 15]</code> but are not present in the array.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1, 4, 11, 51, 15], low = 50, high = 55<br><strong>Output: </strong>[50, 52, 53, 54, 55]<br></span><span style="font-size: 14pt;"><strong>Explanation: </strong>Numbers 50, 52, 53, 54 and 55 lie in the range [50, 55] but are not present in the array.<br></span></pre>
<p><strong><span style="font-size: 14pt;">Constraints:<br></span></strong><span style="font-size: 14pt;">1 ≤ arr.size(), low, high ≤ 10</span><span style="font-size: 14pt;"><sup>5</sup><br><span style="font-size: 14pt;">1 ≤ arr[i] ≤ 10</span><span style="font-size: 14pt;"><sup>5</sup></span></span></p>