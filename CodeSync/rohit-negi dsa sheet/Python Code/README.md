# Python Code

- Platform: GeeksforGeeks
- Language: class Solution: def countDistinct(self, arr, k): # Code here freq={} res=[] for i in range(k): freq[arr[i]]=freq.get(arr[i],0)+1 res.append(len(freq)) for i in range(k,len(arr)): out=arr[i-k] freq[out]-=1 if freq[out]==0: del freq[out] inc=arr[i] freq[inc]=freq.get(inc,0)+1 res.append(len(freq)) return res
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AccoliteAmazonMicrosoftNPCI, Company Tags, Accolite, Amazon, Microsoft, NPCI, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
- Synced: 2026-09-13T20:00:40.684Z

## Problem Description

Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array. Examples: Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4 Output: [3, 4, 4, 3] Explanation: First window is [1, 2, 1, 3], count of distinct numbers is 3. Second window is [2, 1, 3, 4] count of distinct numbers is 4. Third window is [1, 3, 4, 2] count of distinct numbers is 4. Fourth window is [3, 4, 2, 3] count of distinct numbers is 3. Input: arr[] = [4, 1, 1], k = 2 Output: [2, 1] Explanation: First window is [4, 1], count of distinct numbers is 2. Second window is [1, 1], count of distinct numbers is 1. Input: arr[] = [1, 1, 1, 1, 1], k = 3 Output: [1, 1, 1] Explanation: Every window of size 3 in the array [1, 1, 1, 1, 1], contains only the element 1, so the number of distinct elements in each window is 1.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def countDistinct(self, arr, k): # Code here freq={} res=[] for i in range(k): freq[arr[i]]=freq.get(arr[i],0)+1 res.append(len(freq)) for i in range(k,len(arr)): out=arr[i-k] freq[out]-=1 if freq[out]==0: del freq[out] inc=arr[i] freq[inc]=freq.get(inc,0)+1 res.append(len(freq)) return res. The detected topics are Expected Complexities, Company Tags AccoliteAmazonMicrosoftNPCI, Company Tags, Accolite, Amazon, Microsoft, NPCI, Topic Tags. Review the synced source file for the implementation details.
