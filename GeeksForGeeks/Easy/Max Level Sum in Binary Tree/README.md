# Max Level Sum in Binary Tree

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/max-level-sum-in-binary-tree/1)

## Solved On
03 Oct 2026 at 10:06 am

<h2><a href="https://www.geeksforgeeks.org/problems/max-level-sum-in-binary-tree/1">Max Level Sum in Binary Tree</a></h2><h3>Difficulty Level: Easy</h3><hr><p data-start="407" data-end="502"><span style="font-size: 14pt;">Given the <strong>root </strong>of a binary tree, return the <strong>maximum </strong>sum of values among all levels of the tree. </span><span style="font-size: 14pt;">A level sum is the sum of all node values at the same depth.</span></p><p><strong><span style="font-size: 18px;">Examples:</span></strong></p><pre><span style="font-size: 18px;"><strong>Input: </strong>root<strong> </strong>=<strong> </strong></span><span style="font-size: 14pt;">[4, 2, -5, -1, 3, -2, 6]<br></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929512/Web/Other/blobid1_1781081412.webp" width="308" height="200">
<span style="font-size: 18px;"><strong>Output:</strong> 6</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>Sum of all nodes of 0th level is 4. <br>Sum of all nodes of 1st level is 2 - 5 = -3. <br>Sum of all nodes of 2nd level is -1 + 3 -2 + 6 = 6. <br>Hence, maximum sum is 6.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>root =<strong> </strong>[1, 2, 3, 4, 5, N, 8, N, N, N, N, N, N, 6, 7]<strong>    </strong><br></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929512/Web/Other/blobid2_1781081855.webp" width="307" height="240"><br><span style="font-size: 18px;"><strong>Output:</strong> 17</span>
<span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 14pt;">Sum of all nodes of 0th level is 1. <br>Sum of all nodes of 1st level is 2 + 3 = 5. <br>Sum of all nodes of 2nd level is 4 + 5 + 8 = 17. <br>Sum of all nodes of 3rd level is 6 + 7 = 13. <br>Hence, maximum sum is 17.</span></pre>