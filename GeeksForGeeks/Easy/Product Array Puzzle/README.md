# Product Array Puzzle

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1)

## Solved On
27 Oct 2026 at 06:12 pm

<h2><a href="https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1">Product Array Puzzle</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Given an array, <strong>arr[]</strong>,<strong> </strong>construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].<br><strong>Note</strong>: Each element is res[] lies inside the 32-bit integer range.</span></span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [10, 3, 5, 6, 2]
<strong>Output: </strong>[180, 600, 360, 300, 900]<strong>
Explanation: </strong>For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [12, 0]
<strong>Output: </strong>[0, 12]<br><strong style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong><span style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">For i = 0, res[i] is 0.<br></span>For i = 1, res[i] is 12.</span></pre>