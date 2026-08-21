# void clonestack(Stack<Integer> st, Stack<Integer> cloned) { //if stack is empty then return it if(st.isEmpty()){ return; } //pop the element from stack st int temp=st.peek(); st.pop(); //recursively call the remaining elements clonestack(st,cloned); //pushing the popped elements into the cloned stack cloned.push(temp); }

- Platform: GeeksforGeeks
- Language: class Solution: def clonestack(self, st, cloned): # code here for item in st: cloned.append(item)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Stack, Related Interview Experiences, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/clone-a-stack-without-usinig-extra-space/1
- Synced: 2026-08-21T09:09:54.263Z

## Problem Description

Given a stack st[] of size n, return a clone of the stack without using any extra data structure for storage. You may not use the stack's built-in copy constructor, assignment operator, or any other direct copy/clone method. Note: The driver code will print "true" if the returned stack is a valid clone; otherwise, it will print "false". Example: Input: st[] = [1, 2, 3, 4, 5, 6, 7] Output: true Explanation: The stack st is successfully cloned into another stack with the same elements in the same order. Input: st[] = [1, 1, 2, 2, 3, 3, 9] Output: true Explanation: The stack st is successfully cloned into another stack with the same elements in the same order. Constraints: 1 ≤ n ≤ 10^3 1 ≤ st[i] ≤ 10^5

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def clonestack(self, st, cloned): # code here for item in st: cloned.append(item). The detected topics are Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Stack, Related Interview Experiences, Related Articles. Review the synced source file for the implementation details.
