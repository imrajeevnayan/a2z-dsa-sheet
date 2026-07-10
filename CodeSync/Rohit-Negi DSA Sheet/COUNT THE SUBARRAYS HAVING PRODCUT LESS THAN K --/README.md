# COUNT THE SUBARRAYS HAVING PRODCUT LESS THAN K ????‍????????‍????

- Platform: GeeksforGeeks
- Language: int countSubArrayProductLessThanK(const vector<int>& a, int n, long long k) { long long i=0,j=0,cnt=0,pro=1,ans=0; for(i=0;i<n;i++){ pro=1,cnt=0,j=i; while(j<n && pro*a[j]<k){ cnt++; pro*=a[j]; j++; } ans+=cnt; } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Goldman Sachs, Facebook, Walmart, Yatra.com, Amazon, Linkedin
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1
- Synced: 2026-07-10T12:00:42.122Z

## Problem Description

Given an integer array arr[] of positive numbers, the task is to find the number of possible contiguous subarrays having product less than k. Examples: Input : k = 10, arr[] = [1, 2, 3, 4] Output : 7 Explanation: The contiguous subarrays whose product is less than 10 are [1], [2], [3], [4], [1, 2], [2, 3], and [1, 2, 3]. Therefore, the total number of valid contiguous subarrays is 7. Input: k = 100, arr[] = [1, 9, 2, 8, 6, 4, 3] Output: 16 Explanation: There are 16 contiguous subarrays whose product of elements is strictly less than 100. Constraints: 1 ≤ n ≤ 105 1 ≤ k ≤ 105 1 ≤ arr[i] ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using int countSubArrayProductLessThanK(const vector<int>& a, int n, long long k) { long long i=0,j=0,cnt=0,pro=1,ans=0; for(i=0;i<n;i++){ pro=1,cnt=0,j=i; while(j<n && pro*a[j]<k){ cnt++; pro*=a[j]; j++; } ans+=cnt; } return ans; }. The detected topics are Expected Complexities, Company Tags, Goldman Sachs, Facebook, Walmart, Yatra.com, Amazon, Linkedin. Review the synced source file for the implementation details.
