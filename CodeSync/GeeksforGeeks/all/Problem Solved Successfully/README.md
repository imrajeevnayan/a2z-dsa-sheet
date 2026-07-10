# Problem Solved Successfully

- Platform: GeeksforGeeks
- Language: class Solution { //BRUTE FORCE APPROACH:RECURSION+BACKTRACKING private void subsetSumsCheck(int index,int[] arr,int n,int sum,ArrayList<Integer> ans){ if(index >= n){ ans.add(sum); return; } subsetSumsCheck(index+1,arr,n,sum+arr[index],ans); subsetSumsCheck(index+1,arr,n,sum,ans); } public ArrayList<Integer> subsetSums(int[] arr) { ArrayList<Integer> ans = new ArrayList<>(); int n = arr.length; subsetSumsCheck(0,arr,n,0,ans); return ans; } } //T(n):T(n)=O(2^n) //Sc:T(n)=O(2^n)
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/subset-sums2234/1
- Synced: 2026-07-09T12:02:50.921Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { //BRUTE FORCE APPROACH:RECURSION+BACKTRACKING private void subsetSumsCheck(int index,int[] arr,int n,int sum,ArrayList<Integer> ans){ if(index >= n){ ans.add(sum); return; } subsetSumsCheck(index+1,arr,n,sum+arr[index],ans); subsetSumsCheck(index+1,arr,n,sum,ans); } public ArrayList<Integer> subsetSums(int[] arr) { ArrayList<Integer> ans = new ArrayList<>(); int n = arr.length; subsetSumsCheck(0,arr,n,0,ans); return ans; } } //T(n):T(n)=O(2^n) //Sc:T(n)=O(2^n). Review the synced source file for the implementation details.
