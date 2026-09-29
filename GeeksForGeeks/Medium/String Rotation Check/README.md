# String Rotation Check

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1)

## Solved On
29 Sept 2026 at 10:57 pm

<h2><a href="https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1">String Rotation Check</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">You are given two strings <strong>s1 </strong>and&nbsp;<strong>s2</strong>, of equal lengths. The task is to check&nbsp;if&nbsp;<strong>s2</strong>&nbsp;is a rotated version of the string&nbsp;<strong>s1</strong>.</span></p><p><span style="font-size: 14pt;"><strong>Note:</strong> A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.</span></p><p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "abcd"<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">, s2 = "cdab</span>"<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><br></span><strong>Output: </strong>true<strong>
Explanation: </strong>After 2 right rotations, s1 will become equal to s2.
</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "aab", s2 = "aba"<br><strong>Output: </strong>true<strong>
Explanation: </strong>After 1 left rotation, s1 will become equal to s2.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "abcd", s2 = "acbd"<br><strong>Output: </strong>false<strong>
Explanation: </strong>Strings are not rotations of each other.</span></pre>