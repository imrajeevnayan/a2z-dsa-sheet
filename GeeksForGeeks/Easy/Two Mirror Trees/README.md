# Two Mirror Trees

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/two-mirror-trees/1)

## Solved On
03 Oct 2026 at 10:03 am

<h2><a href="https://www.geeksforgeeks.org/problems/two-mirror-trees/1">Two Mirror Trees</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given two binary trees, <strong>a</strong> and <strong>b</strong>, check whether the two trees are mirror images of each other.&nbsp; </span><span style="font-size: 18px;">Two binary trees are mirror images if:</span></p>
<ul>
<li><span style="font-size: 18px;">Their root nodes have the same value.</span></li>
<li><span style="font-size: 18px;">The left subtree of the first tree is the mirror of the right subtree of the second tree.</span></li>
<li><span style="font-size: 18px;">The right subtree of the first tree is the mirror of the left subtree of the second tree.</span><span style="font-size: 18px;">&nbsp;</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">a[] = [1, 3, 2, N, N, 5, 4], b[] = [1, 2, 3, 4, 5, N, N]</span><strong style="font-size: 18px;"><br></strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933186/Web/Other/blobid0_1787566101.webp" width="298" height="149"><br><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">true<br></span><strong style="font-size: 18px;">Explanation:</strong><span style="font-size: 18px;"> Both trees have the same values and opposite subtree structures, so they are mirror images.</span></span>
</pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">a[] = [1, 2, 3], b[] = [1, 2, 4]</span><strong style="font-size: 18px;"><br></strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933186/Web/Other/blobid2_1787566688.webp" width="267" height="174"> <br><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">false<br></span></span><strong style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation:</strong><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">  The root values are the same, but the corresponding nodes 3 and 4 have different values. Therefore, the two trees are not mirror images of each other.</span></pre>
