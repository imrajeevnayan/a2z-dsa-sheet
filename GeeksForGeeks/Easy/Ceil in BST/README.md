# Ceil in BST

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1)

## Solved On
29 Sept 2026 at 11:27 pm

<h2><a href="https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1">Ceil in BST</a></h2><h3>Difficulty Level: Easy</h3><hr><p data-pm-slice="0 0 []"><span style="font-size: 14pt;">Given a <strong>root</strong>&nbsp;binary search tree and an integer&nbsp;<strong>x </strong>, find the Ceil of&nbsp;<strong>x</strong> in the tree.</span></p><p data-pm-slice="0 0 []"><span style="font-size: 14pt;"><strong>Ceil(x)</strong> is a number that is either equal to x or is immediately greater than x. If Ceil could not be found, return <strong>-1</strong>.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">root = [</span><span style="font-size: 18px;">5, 1, 7, N, 2, N, N, N, 3], x = 3</span>
<span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701135/Web/Other/blobid1_1747983254.webp" width="158" height="222"><br></span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">3</span><strong style="font-size: 18px;">
Explanation: </strong><span style="font-size: 18px;">We find 3 in BST, so ceil of 3 is 3.</span></span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>root = [10, 5, 11, 4, 7, N, N, N, N, N, 8], </span>x = 6<br><span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701135/Web/Other/blobid2_1747983312.webp" width="136" height="192"><br><strong>Output: </strong>7<strong>
Explanation: </strong>We find 7 in BST, so ceil of 6 is 7.</span></pre>