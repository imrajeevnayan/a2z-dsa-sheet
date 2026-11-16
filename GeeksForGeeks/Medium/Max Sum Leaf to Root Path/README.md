# Max Sum Leaf to Root Path

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/maximum-sum-leaf-to-root-path/1)

## Solved On
16 Nov 2026 at 10:26 pm

<h2><a href="https://www.geeksforgeeks.org/problems/maximum-sum-leaf-to-root-path/1">Max Sum Leaf to Root Path</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given root of a binary tree, find the <strong>maximum </strong>sum path from any leaf node to the root.</span></p><p><strong><span style="font-size: 18px;">Examples:</span></strong></p><pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">root[] = [1, 2, 3, 4, 5, N, 8, N, 2, N, N, 6, 7]</span><span style="font-size: 18px;"><br>             <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928748/Web/Other/blobid3_1779520846.png" width="144" height="144"></span>
<span style="font-size: 18px;"><strong>Output: </strong>19</span>
<strong><span style="font-size: 18px;">Explanation: </span></strong><span style="font-size: 18px;">There are 4 leaf nodes in the tree, resulting in 4 leaf-to-root paths: <br>2 -&gt; 4 -&gt; 2 -&gt; 1, 5 -&gt; 2 -&gt; 1, 6 -&gt; 8 -&gt; 3 -&gt; 1, and 7 -&gt; 8 -&gt; 3 -&gt; 1. <br>Among these, the path 7 -&gt; 8 -&gt; 3 -&gt; 1 has the maximum sum. <br>The sum of this path is 7 + 8 + 3 + 1 = 19.</span></pre><pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">root[] = [1, -2, 3, N, 5, N, 8]</span><span style="font-size: 18px;"><br>            <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928748/Web/Other/blobid4_1779527134.png" width="130" height="124"></span>
<span style="font-size: 18px;"><strong>Output: </strong>12</span>
<strong><span style="font-size: 18px;">Explanation : </span></strong><span style="font-size: 14pt;">There are 2 leaf nodes in the tree, resulting in 2 leaf-to-root paths: </span><br><span style="font-size: 18px;">5 -&gt; -2 -&gt; 1 and 8 -&gt; 3 -&gt; 1. <br>Among these, the path 8 -&gt; 3 -&gt; 1 has the maximum sum. <br>The sum of this path is 8 + 3 + 1 = 12.</span></pre>