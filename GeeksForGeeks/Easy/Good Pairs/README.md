# Good Pairs

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/good-pairs4519/1)

## Solved On
27 Oct 2026 at 06:32 pm

<h2><a href="https://www.geeksforgeeks.org/problems/good-pairs4519/1">Good Pairs</a></h2><h3>Difficulty Level: Easy</h3><hr><p class="PDq2pG_selectionAnchorContainer" data-start="151" data-end="254"><span style="font-size: 14pt;">Given an array arr of n positive integers, count the number of good pairs (i , j ) such that:</span></p>
<ul data-start="259" data-end="299">
<li data-section-id="1ad1xeg" data-start="259" data-end="275"><span style="font-size: 14pt;">&nbsp;1&nbsp;</span><span style="font-size: 18px;">≤ i, j&nbsp;</span><span style="font-size: 18px;">≤ array size</span></li>
<li data-section-id="1ad1xeg" data-start="259" data-end="275"><span style="font-size: 18px;">arr[i] &lt; arr[j]&nbsp;</span></li>
</ul>
<p data-start="302" data-end="374"><span style="font-size: 14pt;">Two pairs are considered different if they differ in at least one index.</span></p>
<p><span style="font-size: 14pt;"> </span></p>
<p data-start="379" data-end="447"><span style="font-size: 14pt;">Since the answer can be very large, return it modulo 10^9+7.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 1]  
<strong>Output: </strong>1
<strong>Explanation: </strong>The only good pair is (2,1). 
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2 ,3, 2]</span><span style="font-size: 18px;"><strong>
Output</strong>: 2</span><span style="font-size: 18px;"><strong>
Explanation</strong>: The two good pairs are (2,3) and (3,2).
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints</strong>:<br>1&nbsp;</span><span style="font-size: 18px;">≤ n</span><span style="font-size: 18px;">&nbsp;</span><span style="font-size: 18px;">≤</span><span style="font-size: 18px;">&nbsp;10^5<br></span><span style="font-size: 18px;">1&nbsp;</span><span style="font-size: 18px;">≤</span><span style="font-size: 18px;"> arr[i]&nbsp;</span><span style="font-size: 18px;">≤</span><span style="font-size: 18px;">&nbsp;10^3</span></p>