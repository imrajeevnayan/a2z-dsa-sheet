# class Solution: def lcmAndGcd(self, a : int, b : int) -> List[int]: # code here L1,T2=a,b while b>0: r=a%b a=b b=r gcd=a lcm=int((L1*T2)/gcd) return lcm,gcd

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags SAP Labs, Company Tags, SAP Labs, Topic Tags, Mathematical, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
- Synced: 2026-07-15T05:00:13.593Z

## Problem Description

Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD. Examples: Input: a = 5 , b = 10 Output: [10, 5] Explanation: LCM of 5 and 10 is 10, while their GCD is 5. Input: a = 14 , b = 8 Output: [56, 2] Explanation: LCM of 14 and 8 is 56, while their GCD is 2. Input: a = 1 , b = 1 Output: [1, 1] Explanation: LCM of 1 and 1 is 1, while their GCD is 1. Constraints: 1 ≤ a, b ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags SAP Labs, Company Tags, SAP Labs, Topic Tags, Mathematical, Algorithms, Related Articles. Review the synced source file for the implementation details.
