# Koko Eating Bananas

- Platform: GeeksforGeeks
- Language: class Solution { public: bool isFeasible(vector<int>& arr, int k, int s){ int cnt = 0; for(int i = 0;i<arr.size();i++){ cnt += ceil((1.0*arr[i])/s); if(cnt>k)return false; } return true; } int kokoEat(vector<int>& arr, int k) { int l = 1, r = 1e6+1, ans = -1; while(l<=r){ int m = l+(r-l)/2; if(isFeasible(arr, k, m)){ ans = m; r = m-1; } else{ l = m+1; } } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Bloomberg, Amazon, Microsoft, Walmart, Adobe, Arcesium
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/koko-eating-bananas/1
- Synced: 2026-09-02T18:26:29.654Z

## Problem Description

Koko is given an array arr[], where each element represents a pile of bananas. She has exactly k hours to eat all the bananas. Each hour, Koko can choose one pile and eat up to s bananas from it. If the pile has atleast s bananas, she eats exactly s bananas. If the pile has fewer than s bananas, she eats the entire pile in that hour. Koko can only eat from one pile per hour. Your task is to find the minimum value of s (bananas per hour) such that Koko can finish all the piles within k hours. Examples: Input: arr[] = [5, 10, 3], k = 4 Output: 5 Explanation: If Koko eats at the rate of 5 bananas per hour: First pile of 5 bananas will be finished in 1 hour. Second pile of 10 bananas will be finished in 2 hours. Third pile of 3 bananas will be finished in 1 hours. Therefore, Koko can finish all piles of bananas in 1 + 2 + 1 = 4 hours. Input: arr[] = [5, 10, 15, 20], k = 7 Output: 10 Explanation: If Koko eats at the rate of 10 bananas per hour, it will take 6 hours to finish all the piles. Constraint: 1 ≤ arr.size() ≤ k ≤ 106 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool isFeasible(vector<int>& arr, int k, int s){ int cnt = 0; for(int i = 0;i<arr.size();i++){ cnt += ceil((1.0*arr[i])/s); if(cnt>k)return false; } return true; } int kokoEat(vector<int>& arr, int k) { int l = 1, r = 1e6+1, ans = -1; while(l<=r){ int m = l+(r-l)/2; if(isFeasible(arr, k, m)){ ans = m; r = m-1; } else{ l = m+1; } } return ans; } };. The detected topics are Expected Complexities, Company Tags, Bloomberg, Amazon, Microsoft, Walmart, Adobe, Arcesium. Review the synced source file for the implementation details.
