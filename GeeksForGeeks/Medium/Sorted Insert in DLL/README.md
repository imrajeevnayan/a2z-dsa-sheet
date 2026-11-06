# Sorted Insert in DLL

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1)

## Solved On
06 Nov 2026 at 12:34 pm

<h2><a href="https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1">Sorted Insert in DLL</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given a sorted doubly linked list and an element <strong>x</strong>, you need to insert the element <strong>x</strong> into the correct position in the sorted Doubly linked list(DLL).</span></p>
<p><span style="font-size: 18px;"><span class="selectable-text copyable-text" style="caret-color: #000000;">Note: The DLL is sorted in ascending order</span></span></p>
<p><span style="font-size: 18px;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>LinkedList: 3-&gt;5-&gt;8-&gt;10-&gt;12 , x = 9<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700608/Web/Other/blobid0_1721115793.png" width="425" height="67"><br><strong>Output: </strong>3-&gt;5-&gt;8-&gt;<strong>9</strong>-&gt;10-&gt;12<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700608/Web/Other/blobid1_1721115806.png" width="423" height="74"><strong><br></strong></span><span style="font-size: 14pt;"><strong>Explanation: </strong>Here node 9 is inserted in the Doubly Linked-List.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>LinkedList: 1-&gt;4-&gt;10-&gt;11 , x = 15<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700608/Web/Other/blobid2_1721115876.png" width="342" height="68"><br><strong>Output: </strong></span><span style="font-size: 18px;">1-&gt;4-&gt;10-&gt;11-&gt;<strong>15<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700608/Web/Other/blobid3_1721115891.png" width="380" height="76"><br></strong></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>3<br></sup>1 ≤ node -&gt; data , x ≤ 10<sup>4</sup><sup><br></sup></span></p>