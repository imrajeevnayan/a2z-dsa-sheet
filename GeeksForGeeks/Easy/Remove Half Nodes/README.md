# Remove Half Nodes

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/remove-half-nodes/1)

## Solved On
11 Oct 2026 at 05:39 pm

<h2><a href="https://www.geeksforgeeks.org/problems/remove-half-nodes/1">Remove Half Nodes</a></h2><h3>Difficulty Level: Easy</h3><hr><p class="PDq2pG_selectionAnchorContainer" data-start="168" data-end="362"><span style="font-size: 14pt;">Given the root<strong> </strong>of a binary tree. Remove all half nodes from the tree. A <strong data-start="268" data-end="281">half node</strong> is a node that has exactly one child (either a left child or a right child). </span><span style="font-size: 14pt;">When a half node is removed, its only child takes its place and gets connected directly to the removed node's parent.&nbsp;</span></p>
<p class="PDq2pG_selectionAnchorContainer" data-start="168" data-end="362"><span style="font-size: 14pt;">Return the root of the modified tree after all half nodes have been removed.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> root[] = [5, 7, 8, 2]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930742/Web/Other/blobid0_1783935538.webp" width="180" height="158"><strong>
Output: </strong>[5, 2, 8]<br><strong>Explanation: </strong>Node 7 is a half node because it has only one child (2). After removing node 7, its only child (2) is directly connected to node 5. The level order traversal of the modified tree is: 5 2 8. Hence, the output is [5, 2, 8].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root[] = [3, 1, 2]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930742/Web/Other/blobid2_1783935754.webp" width="183" height="107"></span><span style="font-size: 18px;"><strong><br></strong></span><span style="font-size: 18px;"><strong>Output: </strong>[3, 1, 2]<br><strong>Explanation: </strong>Every node has either zero or two children. Therefore, there are no half nodes to remove, and the tree remains unchanged. The level order traversal of the tree is: 3 1 2. Hence, the output is [3, 1, 2].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>4</sup>, n is the number of nodes<br>1 ≤ node-&gt;data ≤ 10<sup>4</sup></span></p>