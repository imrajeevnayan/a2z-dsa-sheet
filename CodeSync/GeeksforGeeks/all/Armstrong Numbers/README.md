# Armstrong Numbers

- Platform: GeeksforGeeks
- Language: class Solution { static String armstrongNumber(int n) { int temp = n; //Step 1: Store the original number to compare later int res = 0; //Step 2: Variable to store the sum of the cubes of the digits while (n != 0) { //Step 3: Loop to process each digit of the number int digit = n % 10; //Step 4: Get the last digit of the number res += Math.pow(digit, 3); // Step 5: Add the cube of the digit to the result n /= 10; // Step 6: Remove the last digit from the number } // Step 7: Check if the sum of cubes (res) is equal to the original number or not if (res == temp) { return "true"; // The number is an Armstrong number } else { return "false"; // The number is not an Armstrong number } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags VMWareOracle, Company Tags, VMWare, Oracle, Topic Tags, Mathematical, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
- Synced: 2026-07-15T05:13:47.163Z

## Problem Description

You are given a 3-digit number n, Find whether it is an Armstrong number or not. An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. Examples: Input: n = 153 Output: true Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Input: n = 372 Output: false Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. Input: n = 100 Output: false Explanation: 100 is not an Armstrong number since 13 + 03 + 03 = 1. Constraints: 100 ≤ n <1000

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { static String armstrongNumber(int n) { int temp = n; //Step 1: Store the original number to compare later int res = 0; //Step 2: Variable to store the sum of the cubes of the digits while (n != 0) { //Step 3: Loop to process each digit of the number int digit = n % 10; //Step 4: Get the last digit of the number res += Math.pow(digit, 3); // Step 5: Add the cube of the digit to the result n /= 10; // Step 6: Remove the last digit from the number } // Step 7: Check if the sum of cubes (res) is equal to the original number or not if (res == temp) { return "true"; // The number is an Armstrong number } else { return "false"; // The number is not an Armstrong number } } }. The detected topics are Expected Complexities, Company Tags VMWareOracle, Company Tags, VMWare, Oracle, Topic Tags, Mathematical, Algorithms. Review the synced source file for the implementation details.
