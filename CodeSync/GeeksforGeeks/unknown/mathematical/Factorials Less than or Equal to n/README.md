# Factorials Less than or Equal to n

- Platform: GeeksforGeeks
- Language: public static ArrayList<Long> arr = new ArrayList<>(); static void getFact(long fact,long n,long limit){ fact *= n; if(fact>limit) { return; } arr.add(fact); getFact(fact,++n,limit); return; } static ArrayList<Long> factorialNumbers(long n) { arr.clear(); getFact(1,1,n); return arr; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Find Factorial Numbers Less Equal N
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/1
- Synced: 2026-07-15T05:49:24.738Z

## Problem Description

A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120, Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n. Examples: Input: n = 3 Output: 1 2 Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2. Input: n = 6 Output: 1 2 6 Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers. Constraints: 1<=n<=1018

## Explanation

This solution was accepted on GeeksforGeeks using public static ArrayList<Long> arr = new ArrayList<>(); static void getFact(long fact,long n,long limit){ fact *= n; if(fact>limit) { return; } arr.add(fact); getFact(fact,++n,limit); return; } static ArrayList<Long> factorialNumbers(long n) { arr.clear(); getFact(1,1,n); return arr; }. The detected topics are Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Find Factorial Numbers Less Equal N. Review the synced source file for the implementation details.
