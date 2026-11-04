# Coin Piles

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/coin-piles5152/1)

## Solved On
04 Nov 2026 at 11:51 pm

<h2><a href="https://www.geeksforgeeks.org/problems/coin-piles5152/1">Coin Piles</a></h2><h3>Difficulty Level: Medium</h3><hr><p data-start="246" data-end="383"><span style="font-size: 14pt;">You are given an array <strong>arr[]</strong> of integers, where each element represents the number of coins in a pile. You are also given an integer <strong>k.</strong><br></span><span style="font-size: 14pt;">Your task is to remove the minimum number of <strong>coins</strong> such that the absolute difference between the number of coins in any two updated piles is at most <strong>k.</strong></span></p><p><span style="font-size: 18px;"> <strong>Note</strong>:&nbsp;You can also remove a pile by removing all the coins of that pile.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 2, 2, 2], k = 0
<strong>Output: </strong>0
<strong>Explanation: </strong></span><span style="font-size: 18px;">For any two piles the difference in the number of coins is &lt;= 0. So no need to remove any coin.</span> 
</pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[]<strong> = </strong>[1, 5, 1, 2, 5, 1], k = 3
<strong>Output: </strong>2</span>
<span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">If we remove one coin each from both the piles containing 5 coins, then for any two piles the absolute difference in the number of coins is &lt;= 3.</span> 
</pre>