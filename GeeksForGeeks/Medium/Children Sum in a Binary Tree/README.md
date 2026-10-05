# Children Sum in a Binary Tree

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/children-sum-parent/1)

## Solved On
05 Oct 2026 at 11:18 pm

<h2><a href="https://www.geeksforgeeks.org/problems/children-sum-parent/1">Children Sum in a Binary Tree</a></h2><h3>Difficulty Level: Medium</h3><hr><p dir="ltr"><span style="font-size: 14pt;">Given a binary tree, find if it satisfies the&nbsp;Children Sum Property which has the following rules</span></p><ul><li value="1"><span style="font-size: 14pt;">Each non-leaf node must have a value equal to the&nbsp;sum&nbsp;of its&nbsp;left&nbsp;and&nbsp;right&nbsp;children's values. </span></li><li value="2"><span style="font-size: 14pt;">A NULL child is considered to have a value of 0, and all leaf nodes are considered valid by default.</span></li></ul><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">root =</span><strong style="font-size: 18px;"> </strong><span style="font-size: 18px;">[35, 20, 15, 15, 5, 10, 5]</span></span><br><span style="font-size: 18px;"><strong style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/907368/Web/Other/blobid1_1754457377.webp" width="232" height="161"></strong>
<strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">True</span><strong style="font-size: 18px;">
Explanation: </strong><span style="font-size: 18px;">Here, every node is sum of its left and right child.</span></span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>root = [1, 4, 3, 5]<strong><br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/907368/Web/Other/blobid2_1754457435.webp" width="217" height="172"></strong>  
<strong>Output: </strong>False<strong>
Explanation: </strong>Here, 1 is the root node and 4, 3 are its child nodes. 4 + 3 = 7 which is not equal to the value of root node. Hence, this tree does not satisfy the given condition.</span></pre>