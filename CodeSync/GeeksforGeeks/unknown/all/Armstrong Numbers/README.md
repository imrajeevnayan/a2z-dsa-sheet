# Armstrong Numbers

- Platform: GeeksforGeeks
- Language: class Solution { static String armstrongNumber(int n) { int temp = n; //Step 1: Store the original number to compare later int res = 0; //Step 2: Variable to store the sum of the cubes of the digits while (n != 0) { //Step 3: Loop to process each digit of the number int digit = n % 10; //Step 4: Get the last digit of the number res += Math.pow(digit, 3); // Step 5: Add the cube of the digit to the result n /= 10; // Step 6: Remove the last digit from the number } // Step 7: Check if the sum of cubes (res) is equal to the original number or not if (res == temp) { return "true"; // The number is an Armstrong number } else { return "false"; // The number is not an Armstrong number } } }
- Difficulty: Unknown
- Topics: Comment of the Day, POTD, GeeksforGeeks, GFG-POTD-Solutions
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
- Synced: 2026-06-28T12:11:24.937Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { static String armstrongNumber(int n) { int temp = n; //Step 1: Store the original number to compare later int res = 0; //Step 2: Variable to store the sum of the cubes of the digits while (n != 0) { //Step 3: Loop to process each digit of the number int digit = n % 10; //Step 4: Get the last digit of the number res += Math.pow(digit, 3); // Step 5: Add the cube of the digit to the result n /= 10; // Step 6: Remove the last digit from the number } // Step 7: Check if the sum of cubes (res) is equal to the original number or not if (res == temp) { return "true"; // The number is an Armstrong number } else { return "false"; // The number is not an Armstrong number } } }. The detected topics are Comment of the Day, POTD, GeeksforGeeks, GFG-POTD-Solutions. Review the synced source file for the implementation details.
