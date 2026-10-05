# Pairwise Swap in Linked List

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1)

## Solved On
05 Oct 2026 at 11:09 pm

<h2><a href="https://www.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1">Pairwise Swap in Linked List</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18.6667px;">Given the <strong>head</strong> of a singly linked list, swap every two adjacent nodes and return the new head.</span></p>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Note</strong><span style="font-size: 14pt;"><strong>:</strong> Try to swap the nodes, not only the data. </span></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head = 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930683/Web/Other/blobid0_1783748781.webp" width="581" height="80"> <br><strong>Output: </strong>2 -&gt; 1 -&gt; 4 -&gt; 3 -&gt; 5<strong>
Explanation: </strong>The list has 5 nodes, so we form pairs from the front: [<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">1, 2], [3, 4], and 5 remains unpaired (odd node count).
</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Swapping each pair gives: [2, 1], [4, 3], and 5 stays as is.
</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Final list: 2 -&gt; 1 -&gt; 4 -&gt; 3 -&gt; 5.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head = 8 -&gt; 7 -&gt; 5 -&gt; 2 -&gt; 1<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/930683/Web/Other/blobid1_1783748871.webp" width="582" height="80">
<strong>Output: </strong>7 -&gt; 8 -&gt; 2 -&gt; 5 -&gt; 1<strong>
Explanation: </strong>The list has 5 nodes, so we form pairs from the front: [<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">8, 7], [5, 2], and 1 remains unpaired (odd node count).
</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Swapping each pair gives: [7, 8], [2, 5], and 1 stays as is.
</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Final list: 7 -&gt; 8 -&gt; 2 -&gt; 5 -&gt; 1.</span></span></pre>
<p><span style="font-size: 12pt;"><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 ≤ size of linked list ≤ 10<sup>6<br></sup>1 ≤ elements of linked list ≤</span> 10<sup>6</sup><sup><br></sup></span></p>