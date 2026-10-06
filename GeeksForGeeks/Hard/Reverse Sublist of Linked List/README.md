# Reverse Sublist of Linked List

## Difficulty: Hard

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1)

## Solved On
06 Oct 2026 at 11:04 pm

<h2><a href="https://www.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1">Reverse Sublist of Linked List</a></h2><h3>Difficulty Level: Hard</h3><hr><p><span style="font-size: 14pt;">Given a <strong>singly linked list</strong> and two positions <strong>a</strong> and <strong>b</strong>, reverse the nodes of the linked list from position a to b (1-indexed) and return the head of the modified linked list. The reversal must be done in-place without using extra space for another list.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>a = 2, b = 4,<strong> </strong>head = 1-&gt;3-&gt;5-&gt;4-&gt;9-&gt;8-&gt;10-&gt;NULL<br> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929243/Web/Other/blobid16_1780579322.png" height="100"><br><strong>Output:</strong><br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929243/Web/Other/blobid17_1780579336.png" height="100"><br><strong>Explanation: </strong>Nodes from position 3 to 4 are reversed resulting in 1 4 5 3 9 8 10.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>a = 1, b = 8,<strong> </strong>head = 1-&gt;7-&gt;5-&gt;3-&gt;9-&gt;8-&gt;10-&gt;2-&gt;2-&gt;5-&gt;NULL<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929243/Web/Other/blobid13_1780579022.png" height="100"><br><strong>Output:</strong> <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929243/Web/Other/blobid14_1780579037.png" height="100"><br><strong>Explanation: </strong>The nodes from position 1 to 8 are reversed, resulting in 2 10 8 9 3 5 7 1 2 5.</span></pre><div><span style="font-size: 14pt;"><strong>Constraints:</strong></span></div><div><span style="font-size: 14pt;">1 ≤ size of linked list ≤ 10^5</span></div><div><span style="font-size: 14pt;">1 ≤ a ≤ b ≤ size of linked list</span></div><div><span style="font-size: 14pt;">1 ≤ data of nodes ≤ 10<sup>9</sup></span></div>