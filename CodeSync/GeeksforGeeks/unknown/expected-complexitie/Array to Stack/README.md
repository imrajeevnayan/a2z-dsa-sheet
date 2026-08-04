# Array to Stack

- Platform: GeeksforGeeks
- Language: import java.util.*; class Solution { public static Stack<Integer> push(int arr[]) { // Your code here Stack<Integer> st=new Stack<>(); for(int i=0;i<arr.length;i++){ st.push(arr[i]); } return st; } public static void pop(Stack<Integer> s) { while(!s.isEmpty()){ System.out.print(s.pop()+" "); } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, STL, Related Articles, Stack Data Structure
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/stack-designer/1
- Synced: 2026-08-04T16:36:15.529Z

## Problem Description

Given an integer array arr[], push the elements of the array into a stack and then print them while popping. Note: No need to print extra line after printing the stack elements. Examples: Input: arr = [1, 2, 3, 4, 5] Output: 5 4 3 2 1 Explanation: Elements are pushed and then popped from the top of the stack in the order 5, 4, 3, 2, 1. Input: arr = [1, 6, 43, 1, 2, 0, 5] Output: 5 0 2 1 43 6 1

## Explanation

This solution was accepted on GeeksforGeeks using import java.util.*; class Solution { public static Stack<Integer> push(int arr[]) { // Your code here Stack<Integer> st=new Stack<>(); for(int i=0;i<arr.length;i++){ st.push(arr[i]); } return st; } public static void pop(Stack<Integer> s) { while(!s.isEmpty()){ System.out.print(s.pop()+" "); } } }. The detected topics are Expected Complexities, Topic Tags, Stack, STL, Related Articles, Stack Data Structure. Review the synced source file for the implementation details.
