# BST Maximum Difference

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/bst-maximum-difference--170647/1)

## Solved On
16 Nov 2026 at 11:00 pm

<h2><a href="https://www.geeksforgeeks.org/problems/bst-maximum-difference--170647/1">BST Maximum Difference</a></h2><h3>Difficulty Level: Medium</h3><hr><p class="PDq2pG_selectionAnchorContainer" data-start="807" data-end="884"><span style="font-size: 14pt;">Given a Binary Search Tree (BST) and a target<strong> </strong>value. Let:</span></p>
<ul data-start="889" data-end="1137">
<li data-section-id="xpyuqa" data-start="889" data-end="1003"><span style="font-size: 14pt;"> S1&nbsp;be the sum of node values along the path from the root to the target node, excluding the target node. </span></li>
<li data-section-id="1h528il" data-start="1006" data-end="1135"><span style="font-size: 14pt;"> S2&nbsp;be the sum of node values along the path from the target node to any leaf in its subtree, excluding the target node. </span></li>
</ul>
<p class="PDq2pG_selectionAnchorContainer" data-start="277" data-end="386"><span style="font-size: 14pt;"> </span></p>
<p data-start="1140" data-end="1180"><span style="font-size: 14pt;">Return the maximum value of S1 − S2.</span></p>
<p><span style="font-size: 14pt;"> <strong>Note: </strong>If the target node is not present in the tree&nbsp;then return -1.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [25, 20, 35, 15, 22, 30, 45, N, N, N, N, N, 32], target = 20<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932694/Web/Other/blobid1_1786951116.webp" width="260" height="253"><br><strong>Output:</strong> 10
<strong>Explanation:</strong> From the root to the target node (<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">excluding the target</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">), the sum of node data is </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">25</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">. From the target node to the leaf nodes (</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">e</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">xcluding the target), the path sums are </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">15</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> and </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">22</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">. Therefore, the maximum difference is </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">25 - 15 = 10</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">.</span>
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [25, 20, 35, 15, 22, 30, 45, N, N, N, N, N, 32], target = 50<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932694/Web/Other/blobid2_1786951205.webp" width="260" height="252"></span><span style="font-size: 14pt;">
<strong>Output:</strong> -1
<strong>Explanation:</strong> The target node is not present in the tree.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [40, 20, 60, 10, 30, N, 70, N, N, 25], target = 20<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932694/Web/Other/blobid3_1786951291.webp" width="220" height="254"><br><strong>Output:</strong> 30
<strong>Explanation: </strong>From the root to the target (excluding the target), the sum of node data is 40. From the target to the leaf nodes (excluding the target), the sums of node data are 10 (20 -&gt; 10) and 55 (20 -&gt; 30 -&gt; 25). Therefore, the possible differences are 40 - 10 = 30 and 40 - 55 = -15. The maximum difference is 30.
</span></pre>