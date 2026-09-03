# 🚢 Capacity to Ship Packages Within D Days

- Platform: GeeksforGeeks
- Language: class Solution { public int leastWeightCapacity(ArrayList<Integer> weights, int days) { // code here int l=0,h=0,max=0,ans=0; for(int n:weights){ l=Math.max(l,n); h+=n; } while(l<=h){ int mid=l+(h-l)/2; int minDaysNeed=1; int load=0; for(int num:weights){ if(num+load>mid){ load=num; minDaysNeed++; }else{ load+=num; } } if(minDaysNeed<=days){ ans=mid; h=mid-1; }else{ l=mid+1; } } return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonD-E-Shaw, Company Tags, Amazon, D-E-Shaw, Topic Tags, Arrays, Binary Search
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
- Synced: 2026-09-03T09:02:20.617Z

## Problem Description

Given arr[] of weights, find the minimum boat capacity to ship all weights within d days. The items are loaded in the same order as their appearance. The total weight should not exceed the computed capacity on any day. Examples: Input: arr[] = [1, 2, 1], d = 2 Output: 3 Explanation: We can ship with boat capacity 3 in 2 days. Day 1- 1, 2 Day 2- 1 Input: arr[] = [9, 8, 10], d = 3 Output: 10 Explanation: We can ship with boat capacity 10 in 3 days. Day 1- 9 Day 2- 8 Day 3- 10

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int leastWeightCapacity(ArrayList<Integer> weights, int days) { // code here int l=0,h=0,max=0,ans=0; for(int n:weights){ l=Math.max(l,n); h+=n; } while(l<=h){ int mid=l+(h-l)/2; int minDaysNeed=1; int load=0; for(int num:weights){ if(num+load>mid){ load=num; minDaysNeed++; }else{ load+=num; } } if(minDaysNeed<=days){ ans=mid; h=mid-1; }else{ l=mid+1; } } return ans; } }. The detected topics are Expected Complexities, Company Tags AmazonD-E-Shaw, Company Tags, Amazon, D-E-Shaw, Topic Tags, Arrays, Binary Search. Review the synced source file for the implementation details.
