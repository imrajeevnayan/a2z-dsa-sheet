# Closest Triplet Diff in Three Arrays

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/closest-triplet3807/1)

## Solved On
04 Nov 2026 at 11:49 pm

<h2><a href="https://www.geeksforgeeks.org/problems/closest-triplet3807/1">Closest Triplet Diff in Three Arrays</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 20px;">Given three sorted arrays a[], b[] and c[], find the minimum value of max(abs(a[i] – b[j]), abs(b[j] – c[k]), abs(c[k] – a[i])). Here i, j and k are indexes in arrays a[], b[] and c[] respectively and abs() indicates absolute value.</span></p>
<p><strong><span style="font-size: 20px;">Examples:</span></strong></p>
<pre><span style="font-size: 20px;"><strong>Input: </strong>a[] = [1, 4, 10], b[] = [2, 15, 20], c[] = [10, 12]
<strong>Output: </strong>5
<strong>Explanation: </strong>We take 10 from a, 15 from b and 10 from c, so max(abs(10-15),abs(15-12),abs(10-10))is 5</span></pre>
<pre><span style="font-size: 20px;"><strong>Input: </strong>a[] = [20, 24, 100], b[] = [2, 19, 22, 79, 800], c[] = [10, 12, 23, 24, 119]
<strong>Output: </strong>2
<strong>Explanation: </strong>We take 24 from a, 22 from b and 24 from c. So max(abs(24-22), abs(24-22), abs(24-24))) is 2.</span></pre>
<p><span style="font-size: 20px;"><strong>Constraints:</strong><br>1 ≤ |a|, |b| , |c| ≤ 10<sup>4</sup><br>1 ≤ a[i],b[j],c[k] ≤ 10<sup>6 </sup></span><span style="font-size: 18px;">where 0 ≤ i &lt; p , 0 ≤ j &lt; q , 0 ≤ k &lt; r</span></p>