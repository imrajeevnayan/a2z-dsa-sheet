# Python: T.C: O(N) and A.S: O(1) -:

- Platform: GeeksforGeeks
- Language: class Solution { public: int stackMiddle(stack<int>& st) { // code here int n= st.size(); for(int i=0; i<n/2; i++){ st.pop(); } return st.top(); } };
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/middle-of-stack/1
- Synced: 2026-09-22T18:19:35.313Z

## Problem Description

Given a stack st[] of size n, find the middle element of the stack Note: In case of even elements, return the first middle from bottom. Examples: Input: st[] = [1, 2, 3, 4, 5] Output: 3 Explanation: The middle elements is 3. Input: st[] = [1, 2, 3, 4] Output: 2 Explanation: The two middle elements are 2 and 3. Since we need the middle element closer to the bottom, the answer is 2.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int stackMiddle(stack<int>& st) { // code here int n= st.size(); for(int i=0; i<n/2; i++){ st.pop(); } return st.top(); } };. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Stack. Review the synced source file for the implementation details.
