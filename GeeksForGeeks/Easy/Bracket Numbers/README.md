# Bracket Numbers

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/print-bracket-number4058/1)

## Solved On
07 Nov 2026 at 08:45 pm

<h2><a href="https://www.geeksforgeeks.org/problems/print-bracket-number4058/1">Bracket Numbers</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given a string <strong>s</strong>, the task is to find the bracket numbers, i.e., for each bracket in s, return <strong>i</strong> if the bracket is the <strong>i<sup>th</sup></strong> opening or closing bracket&nbsp;to appear in the string.&nbsp;</span></p><p><strong><span style="font-size: 18px;">Note :&nbsp;</span></strong><span style="font-size: 18px;">s contains lowercase English alphabets, and '(', ')' characters a</span><span style="font-size: 18px;">t any index, the number of opening brackets is greater than or equal to closing brackets</span></p><p><strong><span style="font-size: 18px;">&nbsp;Examples:</span></strong></p><pre><span style="font-size: 18px;"><strong>Input:</strong>  s = "(aa(bdc))p(dee)</span><span style="font-size: 18px;">"
<strong>Output:</strong> 1 2 2 1 3 3
<strong>Explanation:</strong> The highlighted brackets in the given string <strong>(</strong>aa<strong>(</strong>bdc<strong>))</strong>p<strong>(</strong>dee<strong>)</strong> are assigned the numbers as: 1 2 2 1 3 3.</span></pre><pre><span style="font-size: 18px;"><strong>Input:</strong>  s = "(((()("
<strong>Output:</strong> 1 2 3 4 4 5
<strong>Explanation:</strong> The highlighted brackets in the given string <strong>(((()(</strong> are assigned the numbers as: 1 2 3 4 4 5</span></pre>