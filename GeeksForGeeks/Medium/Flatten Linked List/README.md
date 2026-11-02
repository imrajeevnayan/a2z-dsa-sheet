# Flatten Linked List

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1?page=7)

## Solved On
02 Nov 2026 at 11:13 pm

<h2><a href="https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1?page=7">Flatten Linked List</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">In a linked list, every node has two pointers: <strong>next </strong>and <strong>bottom</strong>. The heads of <strong>n</strong> linked lists are connected using the next pointer, while the bottom pointer points to the next node in the current linked list.</span></p><p><span style="font-size: 18.6667px;">Each linked list is sorted in non-decreasing order of data, and the head nodes are also sorted in non-decreasing order.</span></p><p><span style="font-size: 18.6667px;">Given the <strong>head</strong> of the first linked list, flatten the linked lists into a single sorted linked list such that every node is connected using only the bottom pointers.</span></p><p><strong style="font-size: 14pt;">Examples:</strong></p><pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/935163/Web/Other/blobid0_1792134717.webp" width="409" height="221"><br></strong><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 5 -&gt; 7 -&gt; 8 -&gt; 10 -&gt; 19 -&gt; 20 -&gt; 22 -&gt; 28 -&gt; 40 -&gt; 45.<br></span><strong style="font-size: 14pt;">Explanation</strong><span style="font-size: 14pt;">: <br>Bottom pointer of 5 is pointing to 7.<br>Bottom pointer of 7 is pointing to 8.<br>Bottom pointer of 10 is pointing to 20 and so on.
So, after flattening the linked list the sorted list will be <br></span><span style="font-size: 18.6667px;">5 -&gt; 7 -&gt; 8 -&gt; 10 -&gt; 19 -&gt; 20 -&gt; 22 -&gt; 28 -&gt; 40 -&gt; 45.</span></span></pre><pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/935163/Web/Other/blobid1_1792134741.webp" width="413" height="188"><br></strong><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 5 -&gt; 7 -&gt; 8 -&gt; 10 -&gt; 19 -&gt; 22 -&gt; 28 -&gt; 30 -&gt; 50<br></span><strong style="font-size: 14pt;">Explanation:<br></strong><span style="font-size: 14pt;">Bottom pointer of 5 is pointing to 7.<br>Bottom pointer of 7 is pointing to 8.<br>Bottom pointer of 8 is pointing to 30 and so on.<br></span><span style="font-size: 18.6667px;">So, after flattening the linked list the sorted list will be 
5 -&gt; 7 -&gt; 8 -&gt; 10 -&gt; 19 -&gt; 22 -&gt; 28 -&gt; 30 -&gt; 50.</span></span></pre>