# Delete Nodes Greater than K

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1)

## Solved On
04 Oct 2026 at 12:03 pm

<h2><a href="https://www.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1">Delete Nodes Greater than K</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given the <strong>root </strong>of a Binary Search Tree (BST) and an integer <strong>k</strong>, delete all nodes whose values are greater than or equal to <strong>k</strong> and return the root of the modified BST.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root[] = [4, 1, 9], k = 2<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932924/Web/Other/blobid0_1786535165.png" alt="" width="195" height="179"><br><strong>Output: [</strong>1]<br><strong>Explanation: </strong></span><span style="font-size: 14pt;">Nodes 4 and 9 are greater than or equal to 2, so they are deleted. The remaining BST contains only 1.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root[] = [8, 3, 10, 1, 6, 9, 12], k = 10<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/932924/Web/Other/blobid1_1786535165.png" alt="" width="375" height="268"><br><strong>Output: </strong>[1, 3, 6, 8, 9]<br><strong>Explanation: </strong></span><span style="font-size: 14pt;">Nodes 10 and 12 are greater than or equal to 10, so they are deleted. The remaining nodes are 1, 3, 6, 8 and 9.</span></pre>