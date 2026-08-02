# Java Very Easy Solution

- Platform: GeeksforGeeks
- Language: class Solution: def fizzBuzz(self, n : int): # code here res = []; for i in range(1, n+1): if i % 3 == 0 and i % 5 == 0: res.append('FizzBuzz'); elif i % 3 == 0: res.append('Fizz'); elif i % 5 == 0: res.append('Buzz'); else: res.append(str(i)); return res;
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Arrays, Related Articles, Fizz Buzz Implementation
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/fizz-buzz/1
- Synced: 2026-08-02T11:31:04.957Z

## Problem Description

Fizz Buzz Problem involves that given an integer n, for every integer 0 < i <= n, the task is to output, "FizzBuzz" if i is divisible by 3 and 5, "Fizz" if i is divisible by 3, "Buzz" if i is divisible by 5 "i" as a string, if none of the conditions are true. Return an array of strings. Examples : Input: n = 3 Output: ["1", "2", "Fizz"] Explanation: 1 and 2 are neither divisible by 3 nor 5, so we just output 1 and 2, and 3 is divisible by 3 so we output "Fizz". Input: n = 10 Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"] Input: n = 20 Output: [“1”, “2”, “Fizz”, “4”, “Buzz”, “Fizz”, “7”, “8”, “Fizz”, “Buzz”, “11”, “Fizz”, “13”, “14”, “FizzBuzz”, “16”, “17”, “Fizz”, “19”, “Buzz”] Constraints: 1 ≤ n ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def fizzBuzz(self, n : int): # code here res = []; for i in range(1, n+1): if i % 3 == 0 and i % 5 == 0: res.append('FizzBuzz'); elif i % 3 == 0: res.append('Fizz'); elif i % 5 == 0: res.append('Buzz'); else: res.append(str(i)); return res;. The detected topics are Expected Complexities, Topic Tags, Strings, Arrays, Related Articles, Fizz Buzz Implementation. Review the synced source file for the implementation details.
