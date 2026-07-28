# How To Solve It?

- Platform: GeeksforGeeks
- Language: class Solution: def constructLowerArray(self,arr): ans=[0]*len(arr) def mergeSort(arr): if len(arr)<2: return arr mid=len(arr)//2 left=mergeSort(arr[:mid]) right=mergeSort(arr[mid:]) return merge(left,right) def merge(left,right): nonlocal ans ll,rr=0,0 while ll<len(left): while rr<len(right) and right[rr]<left[ll]: rr+=1 ans[left[ll][1]]+=rr ll+=1 l,r=0,0 result=[] while l<len(left) and r<len(right): if left[l][0]<=right[r][0]: result.append(left[l]) l+=1 else: result.append(right[r]) r+=1 result.extend(left[l:]) result.extend(right[r:]) return result newArr=[] for i in range(len(arr)): newArr.append((arr[i],i)) mergeSort(newArr) return ans
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags GoogleCodenation, Company Tags, Google, Codenation, Topic Tags, Arrays, Sorting
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-smaller-elements2214/1
- Synced: 2026-07-28T09:15:12.997Z

## Problem Description

Given an array arr containing non-negative integers. Count and return an array res where res[i] denotes the number of smaller elements on right side of arr[i]. Examples: Input: arr[] = [12, 1, 2, 3, 0, 11, 4] Output: [6, 1, 1, 1, 0, 1, 0] Explanation: There are 6 smaller elements right after 12. There is 1 smaller element right after 1. And so on. Input: arr[] = [1, 2, 3, 4, 5] Output: [0, 0, 0, 0, 0] Explanation: There are 0 smaller elements right after 1. There are 0 smaller elements right after 2. And so on. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i] ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def constructLowerArray(self,arr): ans=[0]*len(arr) def mergeSort(arr): if len(arr)<2: return arr mid=len(arr)//2 left=mergeSort(arr[:mid]) right=mergeSort(arr[mid:]) return merge(left,right) def merge(left,right): nonlocal ans ll,rr=0,0 while ll<len(left): while rr<len(right) and right[rr]<left[ll]: rr+=1 ans[left[ll][1]]+=rr ll+=1 l,r=0,0 result=[] while l<len(left) and r<len(right): if left[l][0]<=right[r][0]: result.append(left[l]) l+=1 else: result.append(right[r]) r+=1 result.extend(left[l:]) result.extend(right[r:]) return result newArr=[] for i in range(len(arr)): newArr.append((arr[i],i)) mergeSort(newArr) return ans. The detected topics are Expected Complexities, Company Tags GoogleCodenation, Company Tags, Google, Codenation, Topic Tags, Arrays, Sorting. Review the synced source file for the implementation details.
