# space comp : o(n)

- Platform: GeeksforGeeks
- Language: vector<int> primeOccurences(vector<int>& arr, int k) { // code here map<int,int> hash1; for(int i = 0 ;i<arr.size(); i++){ hash1[arr[i]]++; } arr.clear(); for(auto n : hash1){ // if(hash1[i]>k) arr.push_back(k); // cout<<n.second; if(n.second>=k && n.second!=1){ bool isprime=false; for(int j = 2; j<=n.second/2 ; j++){ if(n.second%j==0){ isprime = true; break; } } if(!isprime) arr.push_back(n.first); } } return arr; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Numbers Prime Frequencies Greater Equal K
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/numbers-with-prime-frequencies-greater-than-or-equal-to-k5823/1
- Synced: 2026-08-12T11:36:40.215Z

## Problem Description

Given an array arr[]. Return all elements in sorted order that appear a prime number of times in the array with minimum k frequency. Examples: Input: arr[] = [11, 11, 11, 23, 11, 37, 51, 37, 37, 51, 51, 51, 51], k = 2 Output: [37, 51] Explanation: 11's count is 4, 23 count 1, 37 count 3, 51 count 5. 37 and 51 are two number that appear prime number of time and frequencies greater than or equal to k = 2. Input: arr[] = [11, 22, 33] Output: [] Explanation: Counts of elements are: 11 (1 time), 22 (1 time), 33 (1 time). None of these counts are prime numbers, so the output is an empty list. Constraints: 1 ≤ n ≤ 104 where n is the size of the array. 1 ≤ arr[i] ≤ 106 1 ≤ k ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> primeOccurences(vector<int>& arr, int k) { // code here map<int,int> hash1; for(int i = 0 ;i<arr.size(); i++){ hash1[arr[i]]++; } arr.clear(); for(auto n : hash1){ // if(hash1[i]>k) arr.push_back(k); // cout<<n.second; if(n.second>=k && n.second!=1){ bool isprime=false; for(int j = 2; j<=n.second/2 ; j++){ if(n.second%j==0){ isprime = true; break; } } if(!isprime) arr.push_back(n.first); } } return arr; }. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Numbers Prime Frequencies Greater Equal K. Review the synced source file for the implementation details.
