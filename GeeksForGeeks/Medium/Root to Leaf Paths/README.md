# Root to Leaf Paths

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1)

## Solved On
29 Sept 2026 at 08:09 pm

<h2><a href="https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1">Root to Leaf Paths</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;"><span style="font-size: 18px;">Given a Binary Tree, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree. </span></span></p>
<p><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Note</strong>: The paths should be returned such that paths from the left subtree of any node are listed first, followed by paths from the right subtree.</span></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [1, 2, 3, 4, 5, N, N]
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20241007105251989873/ex-3.webp" alt="ex-3" width="276" height="245">
<strong>Output: </strong>[[1, 2, 4], [1, 2, 5], [1, 3]]
<strong>Explanation: </strong>All the possible paths from root node to leaf nodes are: 1 -&gt; 2 -&gt; 4, 1 -&gt; 2 -&gt; 5 and 1 -&gt; 3</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [1, 2, 3]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700553/Web/Other/blobid0_1745821559.jpg" width="244" height="203"><br><strong>Output: </strong>[[1, 2], [1, 3]] 
<strong>Explanation: </strong>All the possible paths from root node to leaf nodes are: 1 -&gt; 2 and 1 -&gt; 3</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> root = [10, 20, 30, 40, 60, N, N]
<strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700553/Web/Other/blobid1_1745821586.jpg" width="249" height="265"><br>Output: </strong>[[10, 20, 40], [10, 20, 60], [10, 30]]<br></span><strong style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">All the possible paths from root node to leaf nodes are: 10 -&gt; 20 -&gt; 40, 10 -&gt; 20 -&gt; 60 and 10 -&gt; 30</span></pre>