# Elements Less Than K

- Platform: GeeksforGeeks
- Language: vector<int> list_less_than_k(vector<int> a,int n,int k) { // Your code here //Return a vector with elements less than k vector<int>::iterator it; for(it=a.begin();it!=a.end();it++){ if(*it>=k){ a.erase(it); it--; } } return a; }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, STL
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/elements-less-than-k/1
- Synced: 2026-07-12T11:03:51.896Z

## Problem Description

A vector arr[] and an element k are given to you.You need to return the list(vector) of elemeents less than k. The order of elements should be the same as that in the original array. Note: Incase, there is no element less than k then return an empty vector. Example : Input: arr[] = [5, 3, 6, 1, 3], k = 4 Output: 3 1 3 Explanation: Here k is 4. Elements less than 4 in the list are {3 1 3} Constraints: 1<= arr.size() <= 105 1<= arr[i] <= 105 1<= k <= 105

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> list_less_than_k(vector<int> a,int n,int k) { // Your code here //Return a vector with elements less than k vector<int>::iterator it; for(it=a.begin();it!=a.end();it++){ if(*it>=k){ a.erase(it); it--; } } return a; }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, STL. Review the synced source file for the implementation details.
