# Repeated Pattern Removal

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/demonitisation0013/1)

## Solved On
04 Nov 2026 at 11:37 pm

<h2><a href="https://www.geeksforgeeks.org/problems/demonitisation0013/1">Repeated Pattern Removal</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given two strings, <strong>txt</strong> and <strong>pat</strong>, repeatedly perform the following operation until pat no longer appears in txt:</span></p><ul><li><span style="font-size: 18.6667px;">Find the <strong>leftmost</strong> occurrence of the substring pat in txt.</span></li><li><span style="font-size: 18.6667px;">Remove that occurrence from txt.</span></li><li><span style="font-size: 18.6667px;">Concatenate the remaining parts of the string.</span></li></ul><p><span style="font-size: 18.6667px;">Return the resulting string after all occurrences of pat have been removed.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>txt = "aba", pat = "a"
<strong>Output: </strong>"b"
<strong>Explanation: </strong>Remove "a" from the leftmost occurrence in "aba" to get "ba". Removing "a" again results in "b".</span>
</pre><pre><span style="font-size: 18px;"><strong>Input: </strong>txt = "aabababa", pat = "aba"
<strong>Output: </strong>"ba"
<strong>Explanation: </strong>Removing the leftmost occurrence of "aba" from "aabababa" gives "ababa". Removing it again gives "ba".</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>txt = "geeksgeeks", pat = "geeks"
<strong>Output: </strong>""
<strong>Explanation: </strong>The substring "geeks" is removed twice, resulting in an empty string.</span></pre>