# Make Array Beautiful

- Platform: GeeksforGeeks
- Language: from typing import List class Solution: def makeBeautiful(self, arr: List[int]) -> List[int]: # code here stack = [] i = 0 while(i<len(arr)): if(len(stack)>0 and ((stack[-1]>=0 and arr[i]<0) or (stack[-1]<0 and arr[i]>=0))): stack.pop(-1) else: stack.append(arr[i]) i+=1 return stack
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Stack, Related Articles, Make The Array Beautiful 1
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/make-the-array-beautiful--170647/1
- Synced: 2026-09-24T11:04:32.720Z

## Problem Description

Given an array of negative and non-negative integers. You need to make the array beautiful. An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or positive. You can do the following operation any number of times until the array becomes beautiful. If two adjacent are different i.e. one of them is negative and other is positive, remove them. Return the beautiful array after performing the above operation. An empty array is also a beautiful array. There can be multiple beautiful output arrays. For consistencty with the test cases, scan the array from left to right for removing two adjacent. Note: 0 is considered a positive number in this context. Examples: Input: arr[] = [4, 2,-2, 1] Output: [4, 1] Explanation: As at indices 1 and 2 , 2 and -2 have different sign, they are removed. And the the final array is: [4, 1]. Input: arr[] = [2,-2, -1, 1] Output: [] Explanation: As at indices 0 and 1, 2 and -2 have different sign, so they are removed. Now the array is 1 -1.Now 1 and -1 are also removed as they have different sign. So the final array is empty.

## Explanation

This solution was accepted on GeeksforGeeks using from typing import List class Solution: def makeBeautiful(self, arr: List[int]) -> List[int]: # code here stack = [] i = 0 while(i<len(arr)): if(len(stack)>0 and ((stack[-1]>=0 and arr[i]<0) or (stack[-1]<0 and arr[i]>=0))): stack.pop(-1) else: stack.append(arr[i]) i+=1 return stack. The detected topics are Expected Complexities, Topic Tags, Arrays, Stack, Related Articles, Make The Array Beautiful 1. Review the synced source file for the implementation details.
