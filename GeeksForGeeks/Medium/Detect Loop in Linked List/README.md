# Detect Loop in Linked List

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1)

## Solved On
02 Oct 2026 at 09:06 pm

<h2><a href="https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1">Detect Loop in Linked List</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given a singly linked list, find if the given linked list contains a<strong> loop or not</strong>.<strong>&nbsp;</strong>A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.<br></span></p><p><span style="font-size: 18.6667px;"><strong>Note:&nbsp;</strong>Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>pos = 2,<br>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/908280/Web/Other/blobid0_1756127210.webp" width="348" height="104"><br><strong>Output: </strong>true<strong>
Explanation: </strong>There exists a loop as last node is connected back to the second node.<br></span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>pos = 0,<br> &nbsp; <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/908280/Web/Other/blobid1_1756127232.webp" width="445" height="66"><br><strong>Output: </strong>false<strong>
Explanation: </strong>There exists no loop in given linked list.<br></span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>pos = 1,<br>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/908280/Web/Other/blobid2_1756127467.webp" width="389" height="96"><br><strong>Output: </strong>true<strong>
Explanation: </strong>There exists a loop as last node is connected back to the first node.</span></pre>