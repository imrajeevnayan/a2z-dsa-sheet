# Minimum Operations to Reach N

- Platform: GeeksforGeeks
- Language: class Solution: def minOperation(self, n): # Initialize a variable to keep track of the number of operations. operation_count = 0 # Continue the loop until n becomes zero. while n > 0: # If n is odd, subtract 1; otherwise, divide it by 2. if n % 2: n -= 1 else: n //= 2 # Increment the operation count for each step. operation_count += 1 # Return the total number of operations required to reach zero. return operation_count
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Dynamic Programming, Greedy, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-optimum-operation4504/1
- Synced: 2026-09-23T16:00:54.730Z

## Problem Description

Given a number n. Find the minimum number of operations required to reach n starting from 0. You have two operations available: Double the number Add one to the number Examples: Input: n = 8 Output: 4 Explanation: 0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8. Input: n = 7 Output: 5 Explanation: 0 + 1 = 1 --> 1 + 1 = 2 --> 1 + 2 = 3 --> 3 * 2 = 6 --> 6 + 1 = 7.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def minOperation(self, n): # Initialize a variable to keep track of the number of operations. operation_count = 0 # Continue the loop until n becomes zero. while n > 0: # If n is odd, subtract 1; otherwise, divide it by 2. if n % 2: n -= 1 else: n //= 2 # Increment the operation count for each step. operation_count += 1 # Return the total number of operations required to reach zero. return operation_count. The detected topics are Expected Complexities, Topic Tags, Dynamic Programming, Greedy, Related Articles. Review the synced source file for the implementation details.
