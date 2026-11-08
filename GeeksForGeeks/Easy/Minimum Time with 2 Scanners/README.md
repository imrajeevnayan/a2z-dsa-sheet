# Minimum Time with 2 Scanners

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/find-the-minimum-time0253/1)

## Solved On
08 Nov 2026 at 09:09 am

<h2><a href="https://www.geeksforgeeks.org/problems/find-the-minimum-time0253/1">Minimum Time with 2 Scanners</a></h2><h3>Difficulty Level: Easy</h3><hr><p data-pm-slice="1 1 []"><span style="font-size: 14pt;">Geek has <strong>n</strong> documents that need to be scanned using two scanners. Scanner 1 takes <strong>s1</strong> units of time to scan one document, while scanner 2 takes <strong>s2</strong> units of time to scan one document.</span></p><p><span style="font-size: 14pt;">Both scanners can operate simultaneously, and each scanner can scan only one document at a time. A scanner can start scanning its next document immediately after finishing the current one.</span></p><p><span style="font-size: 14pt;">Find the minimum time required to scan all <strong>n</strong> documents.</span></p><p><strong><span style="font-size: 18px;">Examples:</span></strong></p><pre><span style="font-size: 18px;"><strong>Input:</strong> n = 2, s1 = 2, s2 = 4
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can either scan both documents using scanner 1, which takes 2 × 2 = 4 units of time, or scan one document using each scanner simultaneously, which takes max(2, 4) = 4 units of time. Both approaches require 4 units of time.</span></pre><pre><span style="font-size: 18px;"><strong>Input:</strong> n = 2, s1 = 1, s2 = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> The optimal approach is to scan both documents using scanner 1, which takes 2 × 1 = 2 units of time.</span></pre>