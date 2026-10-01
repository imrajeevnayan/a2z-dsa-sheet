# Smallest Subarray with All of Most Frequent

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/smallest-subarray-with-all-occurrences-of-a-most-frequent-element2258/1)

## Solved On
01 Oct 2026 at 11:08 pm

<h2><a href="https://www.geeksforgeeks.org/problems/smallest-subarray-with-all-occurrences-of-a-most-frequent-element2258/1">Smallest Subarray with All of Most Frequent</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given an array <strong>arr[]</strong>, let<strong> x </strong>be an element with the maximum frequency in the array. Find the smallest sub-segment of the array in which x is also the element with the <strong>maximum </strong>frequency.</span></p><p><span style="font-size: 18.6667px;"><strong>Note:</strong> If two or more elements have the same maximum frequency and the same sub-segment size, return the sub-segment that occurs first in the array.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input :</strong> arr[] = [1, 2, 2, 3, 1]
<strong>Output :</strong> [2, 2]
<strong>Explanation: </strong>Note that there are two elements that appear two times, 1 and 2. The smallest window for 1 is whole array and smallest window for 2 is [2, 2]. Since window for 2 is smaller, this is our output.</span></pre><pre><span style="font-size: 18px;"><strong>Input :</strong> arr[] = [1, 4, 3, 5, 3, 5] <strong>
Output :</strong> [3, 5, 3] <br><strong>Explanation: </strong></span><span style="font-size: 18px;">In this array, both 3 and 5 have the highest frequency of 3. However, the sub-segment [3, 5, 3] occurs earlier in the array than [5, 3, 5], so the correct output is [3, 5, 3].</span></pre>