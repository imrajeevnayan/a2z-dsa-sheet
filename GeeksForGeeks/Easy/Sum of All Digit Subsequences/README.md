# Sum of All Digit Subsequences

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sum-of-all-sub-sequences-of-a-number3437/1)

## Solved On
15 Nov 2026 at 02:08 am

<h2><a href="https://www.geeksforgeeks.org/problems/sum-of-all-sub-sequences-of-a-number3437/1">Sum of All Digit Subsequences</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;">Given a string<strong> s</strong> which consists of digits, find sum of all digits across all non-empty subsequences of s.</span></p><p><span style="font-size: 14pt;"><strong>Note:</strong> Since the answer can be very large, return it modulo 10^9 + 7.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "123" 
<strong>Output:</strong> 24
<strong>Explanation:</strong> The non-empty subsequences are: [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]. The sum of all digits in these subsequences is: 1 + 2 + 3 + (1 + 2) + (1 + 3) + (2 + 3) + (1 + 2 + 3) = 24.
</span></pre><pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "405"
<strong>Output:</strong> 36
<strong>Explanation:</strong> The non-empty subsequences are: [4], [0], [5], [4, 0], [4, 5], [0, 5], [4, 0, 5]. The sum of all digits in these subsequences is 36.
</span></pre>