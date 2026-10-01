# Intersection of Two Linked Lists

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/intersection-of-two-linked-list/1)

## Solved On
01 Oct 2026 at 06:23 pm

<h2><a href="https://www.geeksforgeeks.org/problems/intersection-of-two-linked-list/1">Intersection of Two Linked Lists</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given two linked lists <strong>head1 </strong>and <strong>head2</strong>, find&nbsp;the intersection of two linked lists. Each of the two linked lists contains distinct node values.</span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong>&nbsp;The order of nodes in this list should be the same as the order in which those particular nodes appear in input head1 and return null if no common element is present.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;">Input: head1: 9-&gt;6-&gt;4-&gt;2-&gt;3-&gt;8 , head2: 1-&gt;2-&gt;8-&gt;6<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700535/Web/Other/blobid1_1720589846.png" width="399" height="188"> <br><strong>Output: </strong>6-&gt;2-&gt;8<br><strong>Explanation: </strong>Nodes 6, 2 and 8 are common in both of the lists and the order will be according to LinkedList1. </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>head1: 5-&gt;3-&gt;1-&gt;13-&gt;14 , head2: 3-&gt;13<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700535/Web/Other/blobid0_1720589787.png" width="399" height="188"> <br><strong>Output: </strong>3-&gt;13<br><strong>Explanation: </strong>Nodes 3 and 13 are common in both of the lists and the order will be according to LinkedList1. </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ no. of nodes in head1, head2 ≤ 10<sup>4<br></sup>1 ≤ node-&gt;data ≤ 10<sup>5</sup></span></p>