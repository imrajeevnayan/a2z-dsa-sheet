# Is Binary Tree Heap

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/is-binary-tree-heap/1)

## Solved On
16 Nov 2026 at 11:01 pm

<h2><a href="https://www.geeksforgeeks.org/problems/is-binary-tree-heap/1">Is Binary Tree Heap</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">You are given the <strong>root </strong>of a binary tree, and the task is to determine whether it satisfies the properties of a <strong>max-heap</strong>.</span></p><p><span style="font-size: 14pt;">A binary tree is considered a max-heap if it satisfies the following conditions:</span></p><ol><li><span style="font-size: 14pt;"><strong>Completeness</strong>: Every level of the tree, except possibly the last, is completely filled, and all nodes are as far left as possible.</span></li><li><span style="font-size: 14pt;"><strong>Max-Heap Property</strong>: The value of each node is greater than or equal to the values of its children.</span></li></ol><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input:</strong> root = [97, 46, 37, 12, 3, 7, 31, 6, 9]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/881982/Web/Other/blobid0_1733648140.jpg" width="300" height="268"> <br><strong>Output: </strong>true
<strong>Explanation:</strong> The tree is complete and satisfies the max-heap property.
</span></pre><pre><span style="font-size: 14pt;"><strong>Input:</strong> root = [97, 46, 37, 12, 3, 7, 31, N, N, 2, 4]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/881982/Web/Other/blobid1_1733648320.jpg" width="300" height="268"> <br><strong>Output:</strong> false<br><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation:</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span>The tree is not complete and does not follow the Max-Heap Property, hence it is not a max-heap.</span></pre>