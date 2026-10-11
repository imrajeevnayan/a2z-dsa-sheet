# Sum of Right Leaf Nodes

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sum-of-right-leaf-nodes/1)

## Solved On
11 Oct 2026 at 06:29 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sum-of-right-leaf-nodes/1">Sum of Right Leaf Nodes</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;"><span style="font-size: 18.6667px;">Given the root of a Binary Tree, return the <strong>sum </strong>of all right leaf nodes. </span></span><span style="font-size: 14pt;"><span style="font-size: 18.6667px;">A right leaf node is a node that is the right child of its parent and does not have any left or right child.</span><br><strong style="font-size: 14pt;"><br>Examples:</strong><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [1, 2, 3, 4, 5, N, 8, N, 2, N, N, 6, 7]<br>       <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928621/Web/Other/blobid0_1779443234.png" width="160" height="160"><br><strong>Output : </strong>14
<strong>Explanation: </strong>All the right leaf nodes presents are 2, 5 and 7 which sums up to 14.<br>        <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928621/Web/Other/blobid1_1779444047.webp" width="160" height="160"><br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [1, -2, 3, N, 5, N, 8]<br>         <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928621/Web/Other/blobid3_1779444497.png" width="149" height="142"> &nbsp;<br><strong>Output: </strong>13
<strong>Explanation: </strong>All the right leaf nodes presents are 5 and 8 which sums up to 13.<br>        <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928621/Web/Other/blobid4_1779444667.webp" width="183" height="183"></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>6</sup><sup><br></sup>1 ≤ node-&gt;data ≤ 10<sup>5</sup><sup><br></sup>It is guaranteed that sum will not exceed integer max value<br></span></p>