# JAVA CODE Time : 2.29 second

- Platform: GeeksforGeeks
- Language: #User function Template for python3 import heapq class Solution: def kSmallestElements(self, arr, k): # code here hp = [] heapq.heapify(hp) for ind, num in enumerate(arr): heapq.heappush(hp, (num,ind)) res = [] while hp and k: item = heapq.heappop(hp) res.append(item) k-=1 res.sort(key = lambda item:item[1]) return [num for num, item in res]
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Find N Smallest Element Given Array Order Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-k-smallest-elements-in-their-original-order5407/1
- Synced: 2026-08-09T17:16:01.571Z

## Problem Description

Given an array, the task is to print k smallest elements from the array but they must be in the same order as they are in a given array. Examples: Input: arr[] = [1, 2, 2, 3, 1], k = 3 Output: 1 2 1 Explanation: After sorting the array, we get [1, 1, 2, 2, 3]. The 3 smallest elements are 1, 1, and 2. Now, we traverse the original array and pick these elements while preserving their original order. Thus, the result is [1, 2, 1]. Input : arr[] = [9, 4, 3, 3, 5, 5], k = 1 Output : 3 Explanation: The smallest element in the array is 3. Since k = 1, we only need the smallest element, so the answer is [3]. Constraints: 1 ≤ k ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using #User function Template for python3 import heapq class Solution: def kSmallestElements(self, arr, k): # code here hp = [] heapq.heapify(hp) for ind, num in enumerate(arr): heapq.heappush(hp, (num,ind)) res = [] while hp and k: item = heapq.heappop(hp) res.append(item) k-=1 res.sort(key = lambda item:item[1]) return [num for num, item in res]. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Find N Smallest Element Given Array Order Array. Review the synced source file for the implementation details.
