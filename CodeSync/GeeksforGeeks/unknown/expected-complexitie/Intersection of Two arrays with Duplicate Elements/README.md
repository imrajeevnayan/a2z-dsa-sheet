# Intersection of Two arrays with Duplicate Elements

- Platform: GeeksforGeeks
- Language: class Solution: def intersect(self, a, b): sa = set(a) return list(sa.intersection(b))
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Sorting, two-pointer-algorithm, Arrays, Hash, Related Articles, Intersection Of Two Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1
- Synced: 2026-08-09T14:21:47.196Z

## Problem Description

Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both the arrays. The intersection should not have duplicate elements and the result may contain elements in any order. Note: The driver code will sort the resulting array in increasing order before printing. Examples: Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1] Output: [1, 3] Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements. Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1] Output: [1] Explanation: 1 is the only common element present in both the arrays. Input: a[] = [1, 2, 3], b[] = [4, 5, 6] Output: [] Explanation: No common element in both the arrays. Constraints: 1 ≤ a.size(), b.size() ≤ 105 0 ≤ a[i], b[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def intersect(self, a, b): sa = set(a) return list(sa.intersection(b)). The detected topics are Expected Complexities, Topic Tags, Sorting, two-pointer-algorithm, Arrays, Hash, Related Articles, Intersection Of Two Arrays. Review the synced source file for the implementation details.
