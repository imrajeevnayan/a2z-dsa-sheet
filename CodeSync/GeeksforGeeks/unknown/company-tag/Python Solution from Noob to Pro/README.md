# Python Solution from Noob to Pro

- Platform: GeeksforGeeks
- Language: int isDivisible(string s){ //complete the function here int i,odd=0,eve=0,n=s.size(); for(i=0;i<n;i++){ if(s[i]=='1'){ if(i%2)odd++; else eve++; } } return (odd-eve)%3==0; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftAdobe, Company Tags, Amazon, Microsoft, Adobe, Topic Tags, Mathematical
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1
- Synced: 2026-07-07T19:29:15.872Z

## Problem Description

You are given a binary number as a string of characters ('0' and '1'). Your task is to determine whether this binary number is divisible by 3. Note: Try to accomplish this using a single traversal of the input binary string. Examples: Input: s = "100" Output: false Explanation: "100"'s decimal equivalent is 4, which is not divisible by 3. Input: s = "0011" Output: true Explanation: "0011" is 3, which is divisible by 3. Input: s = "110" Output: true Explanation: The decimal equivalent of "110" is 6, which is divisible by 3. Constraints: 1 ≤ s.size() ≤ 106 The string s contains only '0' and '1'.

## Explanation

This solution was accepted on GeeksforGeeks using int isDivisible(string s){ //complete the function here int i,odd=0,eve=0,n=s.size(); for(i=0;i<n;i++){ if(s[i]=='1'){ if(i%2)odd++; else eve++; } } return (odd-eve)%3==0; }. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftAdobe, Company Tags, Amazon, Microsoft, Adobe, Topic Tags, Mathematical. Review the synced source file for the implementation details.
