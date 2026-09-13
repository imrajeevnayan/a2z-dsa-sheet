# Is it Fibonacci ✅ | Daily GeeksForGeeks Challenge ????

- Platform: GeeksforGeeks
- Language: long long solve(int n, int k, vector<long long> arr) { // code here if(k>=n){ return arr[n-1]; } vector<long long> pfsum=arr; long long sum=0; for(auto x:arr){ sum+=x; } pfsum.push_back(sum); for(long long i=k+1;i<=n;i++){ sum+=pfsum[i-1]; sum-=pfsum[i-k-1]; pfsum.push_back(sum); } return pfsum[n-1]; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, sliding-window, Related Articles, Nth Geeky Number 1
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/is-it-fibonacci--170647/1
- Synced: 2026-09-13T21:39:45.239Z

## Problem Description

Geek has defined a sequence called Geeky Numbers. The initial k terms of the sequence are given in an array geekNum[] of length k. Every subsequent term is obtained by taking the sum of the previous k terms. The sequence uses 1-based indexing, so the first element of geekNum[] represents the 1st term of the sequence. Also given an integer n, return the nth term of the Geeky sequence. Examples: Input: n = 5, geekNum[] = [0, 1, 2] Output: 6 Explanation: The array geekNum[] contains 3 initial terms, so each subsequent term is the sum of the previous 3 terms. The sequence is: 0, 1, 2, (0 + 1 + 2), (1 + 2 + 3). Therefore, the sequence becomes 0, 1, 2, 3, 6 and the 5th term is 6.| Input: n = 6, geekNum[] = [4] Output: 4 Explanation: Since geekNum[] contains only one initial term, each subsequent term is the sum of the previous one term. Therefore, every term remains 4. Hence, the sequence is 4, 4, 4, 4, 4, 4, and the 6th term is 4.

## Explanation

This solution was accepted on GeeksforGeeks using long long solve(int n, int k, vector<long long> arr) { // code here if(k>=n){ return arr[n-1]; } vector<long long> pfsum=arr; long long sum=0; for(auto x:arr){ sum+=x; } pfsum.push_back(sum); for(long long i=k+1;i<=n;i++){ sum+=pfsum[i-1]; sum-=pfsum[i-k-1]; pfsum.push_back(sum); } return pfsum[n-1]; }. The detected topics are Expected Complexities, Topic Tags, Arrays, sliding-window, Related Articles, Nth Geeky Number 1. Review the synced source file for the implementation details.
