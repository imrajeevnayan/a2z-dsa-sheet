# Why are you even here ?to see the solution?if you are here to see the solution then its high time for you to go and code more !!!anyways heres the solution :

- Platform: GeeksforGeeks
- Language: class Solution { public static boolean isPerfect(int[] arr) { // code here int left = 0; int right = arr.length-1; while ( left < right ) { if ( arr[left] != arr[right] ) { return false; } left++; right--; } return true; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/perfect-arrays4645/1
- Synced: 2026-08-03T16:45:59.624Z

## Problem Description

Given an array arr[], the task is to find whether the arr is palindrome or not. If the arr is palindrome then return true else return false. Note: An array is said to be palindrome if its reverse array matches the original array. Examples: Input: arr = [1, 2, 3, 2, 1] Output: true Explanation: If we reverse, we get [1, 2, 3, 2, 1] which is the same as before. So, the answer is true. Input: arr = [1, 2, 3, 4, 5] Output: false Explanation: If we reverse it, we get [5, 4, 3, 2, 1] which is the not same as before. So, the answer false. Constraints: 1 ≤ arr.size ≤ 106 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static boolean isPerfect(int[] arr) { // code here int left = 0; int right = arr.length-1; while ( left < right ) { if ( arr[left] != arr[right] ) { return false; } left++; right--; } return true; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles. Review the synced source file for the implementation details.
