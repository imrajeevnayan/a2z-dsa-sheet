# Reverse Alternate K in Linked List

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/xor-linked-list/1)

## Solved On
29 Sept 2026 at 12:46 am

<h2><a href="https://www.geeksforgeeks.org/problems/xor-linked-list/1">Reverse Alternate K in Linked List</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given the </span><strong style="font-size: 18px;">head</strong><span style="font-size: 18px;"> of a linked list and an integer </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;">, reverse every alternate group of k nodes, starting with the first group.</span></p>
<p><span style="font-size: 18px;"> If the number of nodes left at the end of the list is fewer than k, reverse these remaining nodes or leave them in their original order, depending on the alternation pattern.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">head</span><strong style="font-size: 18px;"> = </strong><span style="font-size: 14pt;">1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; NULL, k = 2<br><strong>Output: </strong>2 -&gt; 1 -&gt; 3 -&gt; 4 -&gt; 6 -&gt; 5 -&gt; NULL<br><strong>Explanation: <br></strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929567/Web/Other/blobid0_1783762605.png" alt="" width="374" height="45"><br>The nodes that are reversed are highlighted in green in the figure.</span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>head = 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 7 -&gt; 8 -&gt; NULL, k = 3<br><strong>Output: </strong>3 -&gt; 2 -&gt; 1 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 8 -&gt; 7-&gt; NULL<br></span><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Explanation: <br></strong><span style="font-size: 14pt;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929567/Web/Other/blobid1_1783762744.png" alt="" width="387" height="41"><br></span><span style="font-size: 18.6667px;">The nodes that are reversed are highlighted in green in the figure.</span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&nbsp;<span style="font-size: 18.6667px;">≤</span> number of nodes, node-&gt;data <span style="font-size: 18.6667px;">≤</span>&nbsp;10<sup>5</sup></span></p>