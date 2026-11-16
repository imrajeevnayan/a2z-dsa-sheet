# Lowest Common Ancestor in a BST

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1)

## Solved On
16 Nov 2026 at 10:24 pm

<h2><a href="https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1">Lowest Common Ancestor in a BST</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given&nbsp;a Binary Search Tree (BST) with unique node values and two nodes <strong>n1</strong> and <strong>n2</strong> (n1 != n2), find their Lowest Common Ancestor (LCA).</span></p>
<p><span style="font-size: 14pt;">The Lowest Common Ancestor (LCA) of two nodes is defined as the deepest node in the tree that has both n1 and n2 as descendants, where a node can be a descendant of itself.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [5, 4, 6, 3, N, N, 7, N, N, N, 8], n1-&gt;data = 7, n2-&gt;data = 8<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932632/Web/Other/blobid3_1785496263.webp" width="214" height="189"> &nbsp; &nbsp; &nbsp; <br><strong>Output: </strong>7<br><strong>Explanation:</strong> 7 is the lowest node that has both 7 and 8 as descendants.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], n1-&gt;data = 8, n2-&gt;data = 14<br> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932632/Web/Other/blobid2_1785496262.webp" width="223" height="232"><br><strong>Output: </strong>8<br><strong>Explanation:</strong> 8 is the lowest node that has both 8 and 14 as descendants.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [2, 1, 3], n1-&gt;data = 1, n2-&gt;data = 3
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933253/Web/Other/blobid0_1788112133.png" alt="" width="128" height="112">
<strong>Output: 2</strong><br><strong>Explanation:</strong> 2 is the lowest node that has both 1 and 3 as descendants.</span></pre>
