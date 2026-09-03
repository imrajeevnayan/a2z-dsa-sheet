# 🚢 Capacity to Ship Packages Within D Days

- Platform: GeeksforGeeks
- Language: class Solution { public int leastWeightCapacity(ArrayList<Integer> weights, int days) { // code here int l=0,h=0,max=0,ans=0; for(int n:weights){ l=Math.max(l,n); h+=n; } while(l<=h){ int mid=l+(h-l)/2; int minDaysNeed=1; int load=0; for(int num:weights){ if(num+load>mid){ load=num; minDaysNeed++; }else{ load+=num; } } if(minDaysNeed<=days){ ans=mid; h=mid-1; }else{ l=mid+1; } } return ans; } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
- Synced: 2026-09-03T08:39:28.656Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int leastWeightCapacity(ArrayList<Integer> weights, int days) { // code here int l=0,h=0,max=0,ans=0; for(int n:weights){ l=Math.max(l,n); h+=n; } while(l<=h){ int mid=l+(h-l)/2; int minDaysNeed=1; int load=0; for(int num:weights){ if(num+load>mid){ load=num; minDaysNeed++; }else{ load+=num; } } if(minDaysNeed<=days){ ans=mid; h=mid-1; }else{ l=mid+1; } } return ans; } }. Review the synced source file for the implementation details.
