# Pairwise Consecutive Elements

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <stack> #include <cmath> // for abs() using namespace std; bool pairWiseConsecutive(stack<int> st) { if (st.empty()) return true; bool res = true; stack<int> temp; // If odd number of elements, remove the top one if (st.size() % 2 != 0) { st.pop(); } while (!st.empty()) { int first = st.top(); st.pop(); int second = st.top(); st.pop(); if (abs(first - second) != 1) { res = false; } // store for restoring later temp.push(second); temp.push(first); } // restore stack while (!temp.empty()) { st.push(temp.top()); temp.pop(); } return res; }
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Stack, Related Articles, Check If Stack Elements Are Pairwise Consecutive, Stack In Cpp Stl
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/pairwise-consecutive-elements/1
- Synced: 2026-08-04T16:37:15.665Z

## Problem Description

Given a stack of integers of size N, your task is to complete the function pairWiseConsecutive(), that checks whether numbers in the stack are pairwise consecutive or not. The pairs can be increasing or decreasing, and if the stack has an odd number of elements, the element at the top is left out of a pair. The function should retain the original stack content. Only following standard operations are allowed on stack. push(X): Enter a element X on top of stack. pop(): Removes top element of the stack. empty(): To check if stack is empty. Input Format: The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains n denoting the number of elements to be inserted into the stack. The second line contains the elements to be inserted into the stack. Output Format: For each testcase, in a new line, print "Yes"(without quote) if the elements of the stack is pairwise consecutive, else print "No". Your Task: This is a function problem. You only need to complete the function pairWiseConsecutive that takes a stack as an argument and returns true if the stack is found to be pairwise consecutive, else it returns false. The printing is done by the driver code. Constraints: 1 < =T <= 100 1 < =N <= 103 Example: Input: 2 6 1 2 3 4 5 6 5 1 5 3 9 7 Output: Yes No Explanation: Testcase1: The number of elements are even and they are pairwise consecutive so we print Yes. Testcase2: The number of elements are odd so we remove the top element and check for pairwise consecutive. It is not so we print No.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <stack> #include <cmath> // for abs() using namespace std; bool pairWiseConsecutive(stack<int> st) { if (st.empty()) return true; bool res = true; stack<int> temp; // If odd number of elements, remove the top one if (st.size() % 2 != 0) { st.pop(); } while (!st.empty()) { int first = st.top(); st.pop(); int second = st.top(); st.pop(); if (abs(first - second) != 1) { res = false; } // store for restoring later temp.push(second); temp.push(first); } // restore stack while (!temp.empty()) { st.push(temp.top()); temp.pop(); } return res; }. The detected topics are Topic Tags Related Articles, Topic Tags, Stack, Related Articles, Check If Stack Elements Are Pairwise Consecutive, Stack In Cpp Stl. Review the synced source file for the implementation details.
