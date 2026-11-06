# Linked List to Binary Tree

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/make-binary-tree/1)

## Solved On
06 Nov 2026 at 01:48 pm

<h2><a href="https://www.geeksforgeeks.org/problems/make-binary-tree/1">Linked List to Binary Tree</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given a Linked List, construct complete binary tree from the given Linked List and return the root of the tree. The result will be judged by printing the level order traversal of the binary tree. <br><br></span><span style="font-size: 14pt;"><strong>Note:&nbsp;</strong>The complete binary tree is represented as a linked list in a way where if the root node is stored at position i, its left, and right children are stored at position&nbsp;<strong>2*i+1</strong>, and&nbsp;<strong>2*i+2</strong> respectively. H is the height of the tree and this space is used implicitly for the recursion stack.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head[] = [1, 2, 3, 4, 5]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/907724/Web/Other/blobid4_1754630164.webp" width="466" height="58"><br><strong>Output: </strong>[1, 2, 3, 4, 5]<strong>
Explanation: </strong>The tree would look like <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/907724/Web/Other/blobid0_1754630061.webp" width="245" height="190"><br>Now, the level order traversal of the above tree is 1 2 3 4 5.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head[] = [5, 4, 3, 2, 1]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/907724/Web/Other/blobid1_1754630079.webp" width="490" height="61"><br><strong>Output: </strong>[5, 4, 3, 2, 1]<strong>
Explanation: </strong>The tree would look like
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/907724/Web/Other/blobid2_1754630112.webp" width="262" height="203"> <br>Now, the level order traversal of the above tree is 5 4 3 2 1.</span></pre>