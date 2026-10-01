# Rearrange a linked list

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/rearrange-a-linked-list/1)

## Solved On
01 Oct 2026 at 06:18 pm

<h2><a href="https://www.geeksforgeeks.org/problems/rearrange-a-linked-list/1">Rearrange a linked list</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even position nodes are together. (</span><span style="font-size: 18px;">C</span><span style="font-size: 18px;">onsidering 1-based indexing.</span><span style="font-size: 18px;">)</span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong></span><span style="font-size: 18px;"> You should place all odd-positioned nodes first and then the even-positioned ones. Also, the relative order of odd-positioned nodes and even-positioned nodes should be maintained.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>head: 1-&gt;2-&gt;3-&gt;4
<strong>Output: </strong>1-&gt;3-&gt;2-&gt;4 
<strong>Explanation: </strong>Odd elements are 1, 3 and even elements are 2, 4. Hence, resultant linked list is 1-&gt;3-&gt;2-&gt;4<br></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700045/Web/Other/blobid0_1722066423.png" width="400" height="120"> </pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>head: 1-&gt;2-&gt;3-&gt;4-&gt;5
<strong>Output: </strong>1-&gt;3-&gt;5-&gt;2-&gt;4 
<strong>Explanation:</strong> Odd elements are 1, 3, 5 and even elements are 2, 4. Hence, resultant linked list is 1-&gt;3-&gt;5-&gt;2-&gt;4.<br></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700045/Web/Other/blobid1_1722066444.png" width="393" height="118"> </pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>4</sup><br>0 ≤ node-&gt;data ≤ 10<sup>3</sup></span></p>