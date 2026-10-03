# Sum Tree

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sum-tree/1)

## Solved On
03 Oct 2026 at 10:17 am

<h2><a href="https://www.geeksforgeeks.org/problems/sum-tree/1">Sum Tree</a></h2><h3>Difficulty Level: Medium</h3><hr><div class="entry-content"><p><span style="font-size: 14pt;">Given the<strong> </strong>root of a Binary Tree with <strong>n</strong> nodes, check whether it is a Sum Tree and return true if it is, otherwise return false. </span></p><p><span style="font-size: 14pt;">A Sum Tree is a Binary Tree in which the value of every non-leaf node is equal to the sum of all nodes present in its left and right subtrees. An empty tree and a leaf node are also considered Sum Trees.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [3, 1, 2]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929966/Web/Other/blobid0_1781949612.png" height="100"> <br><strong>Output:</strong> true
<strong>Explanation: </strong></span><span style="font-size: 18.6667px;">The sum of left subtree and right subtree is 1 + 2 = 3, which is the value of the root node. Therefore, the given binary tree is a sum tree.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [10, 20, 30, 10, 10]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929966/Web/Other/blobid1_1781949647.png" width="148" height="115"> <br><strong>Output: </strong>false
<strong>Explanation:</strong> </span><span style="font-size: 18.6667px;">The given tree is not a Sum Tree. For the root node, the sum of nodes in the left and right subtrees is 40 + 30 = 70, which is not equal to the root value 10.</span></pre></div>