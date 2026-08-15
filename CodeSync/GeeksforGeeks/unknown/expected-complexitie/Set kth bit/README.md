# Set kth bit

- Platform: GeeksforGeeks
- Language: class Solution: def setKthBit(self, n, k): # code here return n | (1 << k)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags CiscoQualcomm, Company Tags, Cisco, Qualcomm, Topic Tags, Bit Magic, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/set-kth-bit3724/1
- Synced: 2026-08-15T08:53:41.645Z

## Problem Description

Given a number n and a value k. From the right, set the kth bit in the binary representation of n. The position of the Least Significant Bit(or last bit) is 0, the second last bit is 1 and so on. Examples: Input: n = 10, k = 2 Output: 14 Explanation: Binary representation of the given number 10 is: 1 0 1 0, number of bits in the binary reprsentation is 4. Thus 2nd bit from right is 0. The number after changing this bit to 1 is: 14(1 1 1 0). Input: n = 15, k = 3 Output: 15 Explanation: The binary representation of the given number 15 is: 1 1 1 1, number of bits in the binary representation is 4. Thus 3rd bit from the right is 1. The number after changing this bit to 1 is 15(1 1 1 1). Constraints: 1 ≤ n ≤ 109 0 ≤ k < x, where x is the number of bits in the binary representation of n.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def setKthBit(self, n, k): # code here return n | (1 << k). The detected topics are Expected Complexities, Company Tags CiscoQualcomm, Company Tags, Cisco, Qualcomm, Topic Tags, Bit Magic, Related Articles. Review the synced source file for the implementation details.
