# Max Sum Path in Two Arrays

- Platform: GeeksforGeeks
- Language: def maxPathSum(self, a, b): sum1=sum2=0 ans=0 i=j=0 n,m = len(a),len(b) while i<n and j<m: if a[i]<b[j]: sum1+=a[i] i+=1 elif b[j]<a[i]: sum2+=b[j] j+=1 else: sum1+=a[i] sum2+=b[j] sum1=sum2=max(sum1,sum2) i+=1 j+=1 while i<n: sum1+=a[i] i+=1 while j<m: sum2+=b[j] j+=1 return max(sum1,sum2)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1
- Synced: 2026-07-12T18:47:03.400Z

## Problem Description

Given two sorted arrays of distinct integers in increasing order a[] and b[], which may have some common elements, find the maximum sum of a path from the beginning of any array to the end of any array. You may switch from one array to the other only at common elements. Note: When switching, count the common element only once. Examples : Input: a[] = [2, 3, 7, 10, 12], b[] = [1, 5, 7, 8] Output: 35 Explanation: The path will be (1 + 5 + 7 + 10 + 12) = 35, where 1 and 5 come from arr2 and then 7 is common so we switch to arr1 and add 10 and 12. Input: a[] = [1, 2, 3], b[] = [3, 4, 5] Output: 15 Explanation: The path will be (1 + 2 + 3 + 4 + 5) = 15. Constraints: 1 ≤ a.size(), b.size() ≤ 104 1 ≤ a[i], b[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using def maxPathSum(self, a, b): sum1=sum2=0 ans=0 i=j=0 n,m = len(a),len(b) while i<n and j<m: if a[i]<b[j]: sum1+=a[i] i+=1 elif b[j]<a[i]: sum2+=b[j] j+=1 else: sum1+=a[i] sum2+=b[j] sum1=sum2=max(sum1,sum2) i+=1 j+=1 while i<n: sum1+=a[i] i+=1 while j<m: sum2+=b[j] j+=1 return max(sum1,sum2). The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Data Structures, Related Articles. Review the synced source file for the implementation details.
