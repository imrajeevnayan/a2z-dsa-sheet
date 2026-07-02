# Minimum number of Coins

- Platform: GeeksforGeeks
- Language: class Solution: def findMin(self, n): # code here count=0 mul_10=n/10 count+=mul_10 rem=n%10 if(rem==1 or rem==2 or rem==5 ): count+=1 elif(rem==3 or rem==4 or rem==6): count+=2 elif(rem==8): count+=3 elif(rem==7): count+=2 # print(int(count)) elif(rem==9): count+=3 # print(int(count)) return int(count)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Visa, Company Tags, Visa, Topic Tags, Dynamic Programming, Greedy, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
- Synced: 2026-07-02T18:25:30.250Z

## Problem Description

Given an infinite supply of each denomination of Indian currency { 1, 2, 5, 10 } and a target value n. Find the minimum number of coins and/or notes needed to make the change for Rs n. Examples: Input: n = 39 Output: 6 Explaination: 39 can be formed using 3 coins of 10 rupees, 1 coin of 5 rupees and 2 coins of 2 rupees so minimum coins required are 6. Input: n = 121 Output: 13 Explaination: 121 can be formed using 12 coins of 10 rupees and 1 coin of 1 rupees. Constraints: 1 ≤ n ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def findMin(self, n): # code here count=0 mul_10=n/10 count+=mul_10 rem=n%10 if(rem==1 or rem==2 or rem==5 ): count+=1 elif(rem==3 or rem==4 or rem==6): count+=2 elif(rem==8): count+=3 elif(rem==7): count+=2 # print(int(count)) elif(rem==9): count+=3 # print(int(count)) return int(count). The detected topics are Expected Complexities, Company Tags Visa, Company Tags, Visa, Topic Tags, Dynamic Programming, Greedy, Algorithms. Review the synced source file for the implementation details.
