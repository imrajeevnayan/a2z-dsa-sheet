# Frogs and Jumps

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/frogs-and-jumps--170647/1)

## Solved On
11 Oct 2026 at 08:34 pm

<h2><a href="https://www.geeksforgeeks.org/problems/frogs-and-jumps--170647/1">Frogs and Jumps</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Frogs are positioned at one end of a pond, and each wants to reach the other end. The pond has some leaves arranged in a straight line. </span></p>
<p><span style="font-size: 18px;">Each frog has a strength <strong>s</strong>, meaning it jumps exactly <strong>s </strong>leaves at a time - for example, a frog with strength 2 visits leaves 2, 4, 6, and so on while crossing the pond.</span></p>
<p><span style="font-size: 18px;">Given the strength of each frog (as an array <strong>arr[]</strong>) and the total number of leaves <strong>k</strong>, find how many leaves are not visited by any frog after all frogs have crossed the pond.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [3, 2, 4], k = 4
<strong>Output:</strong> 1
<strong>Explanation:</strong> Frog with strength 3 visits leaf 3. Frog with strength 2 visits leaves 2, 4. Frog with strength 4 visits leaf 4. Leaf 1 is never visited by any frog.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 3, 5], k = 6
<strong>Output:</strong> 0
<strong>Explanation:</strong> Frog with strength 1 visits leaves 1, 2, 3, 4, 5, 6 every leaf. All leaves are already covered, so none are left unvisited.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n, k, arr[i] ≤ 10<sup>5</sup></span></p>