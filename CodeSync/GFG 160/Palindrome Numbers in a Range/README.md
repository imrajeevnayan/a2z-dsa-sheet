# Palindrome Numbers in a Range

- Platform: GeeksforGeeks
- Language: Easy C++ vector<int> printPalindromes(int m, int n) { vector<int> v ; string s1 , s2 ; for(int i = m ; i <= n ; i++){ s1 = to_string(i); s2 = s1; reverse(s2.begin() , s2.end()); if(s1 == s2){ v.push_back(i) ; } } return v ; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Strings, Data Structures, Related Interview Experiences
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-all-palindromes-in-the-given-range/1
- Synced: 2026-07-12T10:58:46.751Z

## Problem Description

Given two integers m and n, find all palindrome numbers between m and n (inclusive). Examples: Input: m = 10, n = 115 Output: [11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111] Explanation: The palindrome numbers in the range [10, 115] are 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, and 111. Input: m = 2, n = 5 Output: [2, 3, 4, 5] Explanation: All numbers in the range [2, 5] are palindrome numbers. Constraints: 1 ≤ m ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using Easy C++ vector<int> printPalindromes(int m, int n) { vector<int> v ; string s1 , s2 ; for(int i = m ; i <= n ; i++){ s1 = to_string(i); s2 = s1; reverse(s2.begin() , s2.end()); if(s1 == s2){ v.push_back(i) ; } } return v ; }. The detected topics are Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Strings, Data Structures, Related Interview Experiences. Review the synced source file for the implementation details.
