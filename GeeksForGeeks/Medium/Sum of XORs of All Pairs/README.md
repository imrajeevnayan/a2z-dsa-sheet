# Sum of XORs of All Pairs

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1)

## Solved On
30 Oct 2026 at 11:06 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1">Sum of XORs of All Pairs</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 20px;">Given an integer array <strong>arr[]</strong> of size <strong>n</strong>, compute the sum of the bitwise XOR for all distinct pairs of elements. That is, consider every pair of indices <strong>(i, j)</strong> such that <strong>0 ≤ i &lt; j &lt; n</strong>, and calculate the total sum of (arr[i] XOR arr[j]) over all such pairs.</span></p><p><span style="font-size: 20px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 20px;"><strong>Input :</strong> arr[] = [7, 3, 5]
<strong>Output :</strong> 12
<strong>Explanation: <br></strong>All pairs (i, j) such that i &lt; j and their XOR values are:<br>7 ^ 3 = 4<br>7 ^ 5 = 2<br>3 ^ 5 = 6<br>Sum of all XOR values = 4 + 2 + 6 = 12.
</span></pre><pre><span style="font-size: 20px;"><strong style="font-size: 20px;">Input :</strong><span style="font-size: 20px;"> arr[] = [5, 9, 7, 6] </span><strong style="font-size: 20px;">
Output :</strong><span style="font-size: 20px;"> 47<br></span><strong style="font-size: 20px;">Explanation:<br></strong><span style="font-size: 20px;">All pairs (i, j) such that i &lt; j and their XOR values are:<br>5 ^ 9 = 12
5 ^ 7 = 2
5 ^ 6 = 3
9 ^ 7 = 14
9 ^ 6 = 15
7 ^ 6 = 1<br>Sum of all XOR values = 12 + 2 + 3 + 14 + 15 + 1 = 47.</span></span></pre><pre><span style="font-size: 20px;"><strong style="font-size: 20px;">Input :</strong><span style="font-size: 20px;"> arr[] = [10] </span><strong style="font-size: 20px;">
Output :</strong><span style="font-size: 20px;"> 0<br></span><strong style="font-size: 20px;">Explanation:</strong><span style="font-size: 20px;"> Since there are no pairs, sum is 0.</span></span></pre>