# Get Max from Stack

- Platform: GeeksforGeeks
- Language: class SpecialStack { public: stack<pair<int, int>> stk; SpecialStack() { // Define Stack } void push(int x) { // Push an element into the stack int max = -1; if(!stk.empty()){ max=stk.top().second > x?stk.top().second: x; }else{ max=x; } stk.push({x, max}); } void pop() { // Remove the top element from the Stack stk.pop(); } int peek() { // Returns the top element if(!stk.empty()){ return stk.top().first; } return -1; } bool isEmpty() { // Check if stack is empty return stk.size() == 0; } int getMax() { // Return maximum element of Stack if(!stk.empty()){ return stk.top().second; } return -1; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/get-max-from-stack/1
- Synced: 2026-08-21T09:12:14.095Z

## Problem Description

Implement a class SpecialStack that supports following operations: push(x) – Insert an integer x onto the stack. pop() – Remove the top element from the stack. peek() – Return the top element from the stack. If the stack is empty, return -1. getMax() – Retrieve the maximum element from the stack in O(1) time. If the stack is empty, return -1. isEmpty() – Return true if stack is empty, else false There will be a sequence of queries queries[][]. The queries are represented in numeric form: 1 x : Call push(x) 2: Call pop() 3: Call peek() 4: Call getMax() 5: Call isEmpty() The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), getMax(), isEmpty() operations. You only need to implement the above five functions. Examples: Input: q = 7, queries[][] = [[1, 2], [1, 3], [3], [2], [4], [1, 1], [4]] Output: [3, 2, 2] Explanation: Queries on stack are as follows: push(2) into the Stack push(3) into the Stack return top of the stack, i.e 3 remove the element 3 from the top of the stack return maximum element from the stack i.e 2 push(1) into the stack return maximum element from the stack i.e 2 Input: q = 5, queries[][] = [[1, 4], [1, 2], [4], [3], [5]] Output: [4, 2, false] Explanation: Queries on stack are as follows: push(4) into the Stack push(2) into the Stack return maximum element from the stack i.e 4 return top of the stack, i.e 2 stack is non-empty, i.e. return false. Constraints: 1 ≤ queries.size() ≤ 105 0 ≤ values on the stack ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class SpecialStack { public: stack<pair<int, int>> stk; SpecialStack() { // Define Stack } void push(int x) { // Push an element into the stack int max = -1; if(!stk.empty()){ max=stk.top().second > x?stk.top().second: x; }else{ max=x; } stk.push({x, max}); } void pop() { // Remove the top element from the Stack stk.pop(); } int peek() { // Returns the top element if(!stk.empty()){ return stk.top().first; } return -1; } bool isEmpty() { // Check if stack is empty return stk.size() == 0; } int getMax() { // Return maximum element of Stack if(!stk.empty()){ return stk.top().second; } return -1; } };. The detected topics are Expected Complexities, Topic Tags, Stack, Related Articles. Review the synced source file for the implementation details.
