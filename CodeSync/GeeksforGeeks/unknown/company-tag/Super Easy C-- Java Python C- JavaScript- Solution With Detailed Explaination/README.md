# Super Easy C++ || Java || Python || C# || JavaScript, Solution With Detailed Explaination

- Platform: GeeksforGeeks
- Language: class Solution { public static int countNumberswith4(int n) { int count = 0; // Step 1: Initialize a counter to zero for (int i = 1; i <= n; i++) { // Step 2: Loop through each number from 1 to n String numStr = Integer.toString(i); // Step 3: Convert the current number to a string if (numStr.contains("4")) { // Step 4: Check if the string contains the character '4' count++; // Step 5: If it does, increment the counter } } return count; // Step 6: Return the counter after the loop ends } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Drishti-Soft, Company Tags, Drishti-Soft, Topic Tags, Dynamic Programming, Mathematical, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1
- Synced: 2026-07-07T11:52:13.976Z

## Problem Description

You are given a number n, Return the count of total numbers from 1 to n containing 4 as a digit. Examples: Input: n = 9 Output: 1 Explanation: 4 is the only number between 1 to 9 which contains 4 as a digit. Input: n = 44 Output: 9 Explanation: 4, 14, 24, 34, 40, 41, 42, 43 & 44, there are total 9 numbers containing 4 as a digit. Constraints: 1 <= n <= 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static int countNumberswith4(int n) { int count = 0; // Step 1: Initialize a counter to zero for (int i = 1; i <= n; i++) { // Step 2: Loop through each number from 1 to n String numStr = Integer.toString(i); // Step 3: Convert the current number to a string if (numStr.contains("4")) { // Step 4: Check if the string contains the character '4' count++; // Step 5: If it does, increment the counter } } return count; // Step 6: Return the counter after the loop ends } }. The detected topics are Expected Complexities, Company Tags Drishti-Soft, Company Tags, Drishti-Soft, Topic Tags, Dynamic Programming, Mathematical, Algorithms. Review the synced source file for the implementation details.
