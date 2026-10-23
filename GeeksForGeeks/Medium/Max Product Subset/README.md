# Max Product Subset

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1)

## Solved On
23 Oct 2026 at 10:36 pm

<h2><a href="https://www.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1">Max Product Subset</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an array <strong>arr[],</strong> find and return the maximum product possible with the subset of elements present in the array. </span></p><p><strong><span style="font-size: 14pt;">Note: </span></strong><span style="font-size: 14pt;">The maximum product can be of a single element also. S</span><span style="font-size: 14pt;">ince the product can be large, return it modulo 10<sup>9</sup> + 7.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [-1, 0, -2, 4, 3]
<strong>Output: </strong>24
<strong>Explanation:</strong> Maximum product will be (-1 * -2 * 4 * 3) = 24</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [-1, 0]
<strong>Output: </strong>0<br><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation:</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> Maximum product will be ( -1  *  0) = 0</span><br></span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [5]
<strong>Output: </strong>5</span><br><span style="font-size: 14pt;"><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation:</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> Maximum product will be 5.</span></span></pre>