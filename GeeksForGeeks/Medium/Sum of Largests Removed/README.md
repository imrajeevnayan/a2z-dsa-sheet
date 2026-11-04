# Sum of Largests Removed

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/maximize-the-sum-of-selected-numbers-from-an-array-to-make-it-empty0836/1)

## Solved On
04 Nov 2026 at 11:30 pm

<h2><a href="https://www.geeksforgeeks.org/problems/maximize-the-sum-of-selected-numbers-from-an-array-to-make-it-empty0836/1">Sum of Largests Removed</a></h2><h3>Difficulty Level: Medium</h3><hr><p dir="ltr"><span data-lexical-text="true">Given an array </span><strong data-lexical-text="true">arr[]</strong><span data-lexical-text="true"> of n integers, perform the following operation repeatedly until the array is empty:</span></p><ol><li dir="ltr" value="1"><span data-lexical-text="true">Find the largest number x currently remaining in the array.</span></li><li dir="ltr" value="2"><span data-lexical-text="true">Add x to your total sum.</span></li><li dir="ltr" value="3"><span data-lexical-text="true">Remove one occurrence of x from the array.</span></li><li dir="ltr" value="4"><span data-lexical-text="true">If x - 1 exists in the array, remove one occurrence of it as well.</span></li></ol><p dir="ltr"><span data-lexical-text="true">Return the final total sum.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 2, 2, 2, 3, 4]
<strong>Output: </strong>10
<strong>Explanation: </strong>We select 4, so 4 and 3 are deleted leaving us with [1,2,2,2]. Then we select 2, so 2 &amp; 1 are deleted. We are left with [2,2]. We select 2 in next two steps, thus the sum is 4+2+2+2=10.
</span></pre><pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 2, 3]<strong>
Output: </strong>4
<strong>Explanation:</strong> We select 3, so 3 and 2 are deleted leaving us with [1]. Then we select 1, 0 doesn't exist so we delete 1. thus the sum is 3+1=4.</span>
</pre>