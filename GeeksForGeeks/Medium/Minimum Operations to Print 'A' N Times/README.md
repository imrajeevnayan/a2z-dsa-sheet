# Minimum Operations to Print 'A' N Times

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/special-keyboard-2/1)

## Solved On
29 Sept 2026 at 11:03 pm

<h2><a href="https://www.geeksforgeeks.org/problems/special-keyboard-2/1">Minimum Operations to Print 'A' N Times</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given an integer <strong>n</strong>, initially there is one character 'A' on the screen. You can perform only the following two operations:</span></p>
<p><span style="font-size: 18.6667px;"><strong>Copy All</strong>: Copies all the characters currently on the screen (partial copy is not allowed).</span></p>
<p><span style="font-size: 18.6667px;"><strong>Paste</strong>: Pastes the characters that were copied most recently.</span></p>
<p><span style="font-size: 18.6667px;">Return the <strong>minimum</strong> number of operations required to obtain exactly n characters 'A' on the screen.</span></p>
<p><strong><span style="font-size: 14pt;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> n = 3
<strong>Output:</strong> 3
<strong>Explanation: </strong>Initially, there is one character 'A'.
Step 1: Use the Copy All operation.
Step 2: Use the Paste operation to get 'AA'.
Step 3: Use the Paste operation to get 'AAA'.
Only three operations are needed to get three 'A's on the screen.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> n = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong> No operations are needed, since a single 'A' is already on the screen.</span></pre>
<p><span style="font-size: 18.6667px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>9</sup></span></p>