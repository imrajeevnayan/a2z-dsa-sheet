# can someone explain why is it accepted???? in the comment section almost everyone is using (maxValue+1) but range of int value is exceeding in this....

- Platform: GeeksforGeeks
- Language: void rearrange(long long *arr, int n) { // Your code here int lastidx=n-1; int firstidx=0; int maxi=arr[n-1]+1; for(int i=0;i<n;i++) { if(i%2==0) { arr[i]+=(arr[lastidx]%maxi)*maxi; lastidx--; } else { arr[i]+=(arr[firstidx]%maxi)*maxi; firstidx++; } } for(int i=0;i<n;i++) arr[i]/=maxi; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, Arrays, Related Articles, Rearrange Array Maximum Minimum Form
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
- Synced: 2026-08-03T16:53:22.052Z

## Problem Description

Given an array of positive integers. Your task is to rearrange the array elements alternatively i.e. first element should be the max value, the second should be the min value, the third should be the second max, the fourth should be the second min, and so on. Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything. Examples: Input: arr[] = [1, 2, 3, 4, 5, 6] Output: [6, 1, 5, 2, 4, 3] Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... The modified array is: [6, 1, 5, 2, 4, 3] Input: arr[]= [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110] Output: [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60] Explanation: Max element = 110, min = 10, second max = 100, second min = 20, and so on... Modified array is : [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60] Input: arr[]= [1] Output: [1] Constraints: 1 ≤ arr.size ≤ 106 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using void rearrange(long long *arr, int n) { // Your code here int lastidx=n-1; int firstidx=0; int maxi=arr[n-1]+1; for(int i=0;i<n;i++) { if(i%2==0) { arr[i]+=(arr[lastidx]%maxi)*maxi; lastidx--; } else { arr[i]+=(arr[firstidx]%maxi)*maxi; firstidx++; } } for(int i=0;i<n;i++) arr[i]/=maxi; }. The detected topics are Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, Arrays, Related Articles, Rearrange Array Maximum Minimum Form. Review the synced source file for the implementation details.
