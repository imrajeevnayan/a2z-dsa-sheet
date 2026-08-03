# Probably the smallest code | TC and SC: O(3*N)

- Platform: GeeksforGeeks
- Language: class Solution { vector<int> merge(vector<int> a, vector<int> b){ vector<int> ans; int n = a.size(); int m = b.size(); int i = 0; int j = 0; while(i<n && j<m){ if(a[i]<b[j]){ ans.push_back(a[i++]); } else{ ans.push_back(b[j++]); } } while(i<n){ ans.push_back(a[i++]); } while(j<m){ ans.push_back(b[j++]); } return ans; } public: vector<int> mergeThree(vector<int>& a, vector<int>& b, vector<int>& c) { // code here return merge(a,merge(b,c)); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Sorting, Related Articles, Merge 3 Sorted Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/merge-three-sorted-arrays-1587115620/1
- Synced: 2026-08-03T17:16:19.321Z

## Problem Description

Given three sorted arrays a[], b[] and c[] of positive integers. The task is to merge them into a single array which must be sorted in increasing order. Examples: Input: a[] = [1, 2, 3, 4], b[] = [1, 2, 3, 5] c[] = [1, 2, 3, 4, 5, 6] Output: [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6] Explanation: Merging these three sorted arrays, we get:[1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6] Input:a[] = [1, 2], b[] = [2, 3, 4], c[] = [4, 5, 6, 7] Output: [1, 2, 2, 3, 4, 4, 5, 6, 7] Explanation: Merging three sorted arrays, we get:[1, 2, 2, 3, 4, 4, 5, 6, 7] Constraints: 1 ≤ a.size(),b.size() ,c.size() ≤ 104 1 ≤ a[i], b[i], c[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { vector<int> merge(vector<int> a, vector<int> b){ vector<int> ans; int n = a.size(); int m = b.size(); int i = 0; int j = 0; while(i<n && j<m){ if(a[i]<b[j]){ ans.push_back(a[i++]); } else{ ans.push_back(b[j++]); } } while(i<n){ ans.push_back(a[i++]); } while(j<m){ ans.push_back(b[j++]); } return ans; } public: vector<int> mergeThree(vector<int>& a, vector<int>& b, vector<int>& c) { // code here return merge(a,merge(b,c)); } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Sorting, Related Articles, Merge 3 Sorted Arrays. Review the synced source file for the implementation details.
