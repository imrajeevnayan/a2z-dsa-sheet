# Subarrays Covering All Distinct

- Platform: GeeksforGeeks
- Language: int countDistinctSubarray(int arr[], int n) { unordered_map<int, int> store; unordered_map<int, int> mp; for(int i=0;i<n;i++){ store[arr[i]]++; } int mapSize = store.size(); int i = 0; int j = 0; int ans =0; while(j<n){ mp[arr[j]]++; if(mp.size()< mapSize){ j++; } else if(mp.size() == mapSize){ while(mp.size()== mapSize){ ans = ans +(n-j); mp[arr[i]]--; if(mp[arr[i]]==0){ mp.erase(arr[i]); } i++; } j++; } } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, sliding-window, two-pointer-algorithm, Arrays, Hash, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1
- Synced: 2026-09-13T21:12:16.064Z

## Problem Description

You are given an integer array arr[]. Count the number of subarrays whose count of distinct is exactly the same as the count of distinct in the entire array. Examples: Input: arr[] = [2, 1, 3, 2, 3] Output: 5 Explanation: The entire array contains 3 distinct elements: [1, 2, 3]. The subarrays that also contain all 3 distinct elements are: arr[0..2] = [2, 1, 3] arr[0..3] = [2, 1, 3, 2] arr[0..4] = [2, 1, 3, 2, 3] arr[1..3] = [1, 3, 2] arr[1..4] = [1, 3, 2, 3] Hence, the total number of such subarrays is 5. Input: arr[] = [2, 4, 4, 2, 4] Output: 9 Explanation: The entire array contains 2 distinct elements: [2, 4]. Therefore, we need to count all subarrays that contain both 2 and 4. The valid subarrays are: arr[0..1] = [2, 4] arr[0..2] = [2, 4, 4] arr[0..3] = [2, 4, 4, 2] arr[0..4] = [2, 4, 4, 2, 4] arr[1..3] = [4, 4, 2] arr[1..4] = [4, 4, 2, 4] arr[2..3] = [4, 2] arr[2..4] = [4, 2, 4] arr[3..4] = [2, 4] Hence, the total number of such subarrays is 9. Constraints: 1 ≤ n ≤ 104, where n is the size of array 1 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using int countDistinctSubarray(int arr[], int n) { unordered_map<int, int> store; unordered_map<int, int> mp; for(int i=0;i<n;i++){ store[arr[i]]++; } int mapSize = store.size(); int i = 0; int j = 0; int ans =0; while(j<n){ mp[arr[j]]++; if(mp.size()< mapSize){ j++; } else if(mp.size() == mapSize){ while(mp.size()== mapSize){ ans = ans +(n-j); mp[arr[i]]--; if(mp[arr[i]]==0){ mp.erase(arr[i]); } i++; } j++; } } return ans; }. The detected topics are Expected Complexities, Topic Tags, sliding-window, two-pointer-algorithm, Arrays, Hash, Related Articles. Review the synced source file for the implementation details.
