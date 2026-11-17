# Repeated Pattern Check

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/the-pattern-matcher/1)

## Solved On
17 Nov 2026 at 11:49 am

<h2><a href="https://www.geeksforgeeks.org/problems/the-pattern-matcher/1">Repeated Pattern Check</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given a string <strong>s</strong> made of two characters of <strong>'x' </strong>and <strong>'y'</strong>.&nbsp; The task is to verify whether <strong>s</strong> is made by concatenating substrings that follow the pattern <strong>x<sup>n</sup>y<sup>n</sup></strong>&nbsp; (equal number of y'<em>s</em> follow equal number of x'<em>s)</em>.&nbsp;</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>s = "xxyyxy" <br><strong>Output: </strong>true<br><strong>Explanation: </strong></span><span style="font-size: 14pt;">The string can be split into "xxyy" + "xy". Both substrings contain an equal number of consecutive 'x' and 'y' characters.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>s = "xyx"<br><strong>Output: </strong>false<br><strong>Explanation:</strong> The last 'x' cannot form a valid substring because it is not followed by a matching 'y'. </span></pre>