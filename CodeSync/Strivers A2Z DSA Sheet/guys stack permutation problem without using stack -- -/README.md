# guys stack permutation problem without using stack 😂 :-

- Platform: GeeksforGeeks
- Language: class Solution { public: bool validateOp(vector<int>& a, vector<int>& b) { // code here int i=0,j=0; stack<int> stk; while(i<a.size() && j<b.size()){ while(!stk.empty() && stk.top() == b[j]){ stk.pop(); j++; } stk.push(a[i]); i++; } while(!stk.empty() && stk.top() == b[j]){ stk.pop(); j++; } return i==j; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, Arrays, Stack, implementation
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/stack-permutations/1
- Synced: 2026-08-03T17:14:22.994Z

## Problem Description

You have an empty stack and can perform push and pop operations in it. Given two arrays a[] and b[] of unique elements and both having the same length. a[] represents the order in which elements are pushed into a stack. b[] represents the order in which elements are expected to be popped from the stack. Determine whether the given push and pop sequences are valid. Note: The stack is empty initially and must also be empty after performing all the operations. Examples: Input: a[] = [1, 2, 3], b[] = [2, 1, 3] Output: true Explanation: Take 1 from a and push it into the stack, Take 2 from a and push it into the stack, Take 2 from b and pop it from the stack, Take 1 from b and pop it from the stack, Take 3 from a and push it into the stack, Take 3 from b and pop it from the stack So, all the push and pop sequences are valid. Input: a[] = [1, 2, 3], b[] = [3, 1, 2] Output: false Explanation: After pushing 1, 2, and 3, we can pop 3 as required. But the next element in b[] is 1, while the stack top is 2. Since 1 is blocked under 2, this order cannot be achieved.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool validateOp(vector<int>& a, vector<int>& b) { // code here int i=0,j=0; stack<int> stk; while(i<a.size() && j<b.size()){ while(!stk.empty() && stk.top() == b[j]){ stk.pop(); j++; } stk.push(a[i]); i++; } while(!stk.empty() && stk.top() == b[j]){ stk.pop(); j++; } return i==j; } };. The detected topics are Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, Arrays, Stack, implementation. Review the synced source file for the implementation details.
