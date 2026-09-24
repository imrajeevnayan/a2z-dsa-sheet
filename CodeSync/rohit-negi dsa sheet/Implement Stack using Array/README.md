# Implement Stack using Array

- Platform: GeeksforGeeks
- Language: class myStack { int top; vector<int> arr; int size; public: myStack(int n) { top = -1; size = n; arr.resize(n); } bool isEmpty() { return top == -1; } bool isFull() { return top == size - 1; } void push(int x) { if (isFull()) return; arr[++top] = x; } void pop() { if (isEmpty()) return; top--; } int peek() { if (isEmpty()) return -1; return arr[top]; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, FactSet, Visa, Goldman Sachs, Qualcomm, Kritikal Solutions, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/implement-stack-using-array/1
- Synced: 2026-09-24T09:04:39.752Z

## Problem Description

Implement a Stack using an Array, where the size of the array, n is given. The Stack must support the following operations: (i) push(x): Insert an element x at the top of the stack. (ii) pop(): Remove the element from the top of the stack. (iii) peek(): Return the top element if not empty, else -1. (iv) isEmpty(): Return true if the stack is empty else return false. (v) isFull(): Return true if the stack is full else return false. There will be a sequence of queries queries[][]. The queries are represented in numeric form: 1 x : Call push(x) 2 : Call pop() 3 : Call peek() 4 : Call isEmpty() 5 : Call isFull() You just have to implement the functions push, pop, peek, isEmpty, and isFull. The driver code will handle the output. Note: All the queries are valid. Examples: Input: n = 3, q = 6, queries[][] = [[1, 5], [1, 3], [3], [2], [4], [5]] Output: [3, false, false] Explanation: Queries on stack are as follows: push(5) : Insert 5 at the top of the stack. push(3) : Insert 3 at the top of the stack. peek() : Return the top element i.e. 3. pop() : Remove the top element i.e. 3. isEmpty() : return false as the stack is not empty. isFull() : return false as the stack is not full. Capacity = 3. Input: n = 1, q = 5, queries[][] = [[2], [3], [4], [1, 9], [5]] Output: [-1, -1, true, true] Explanation: Queries on stack are as follows: pop(): Since stack is empty, nothing is popped. peek(): Return the top element. Since the stack is empty, return -1. isEmpty(): Return true as the stack is empty. push(9): Insert 9 at the top of the stack. The stack will be [9]. isFull(): Return true as the stack is full. Capacity = 1. Constraints: 1 ≤ n ≤ 103 1 ≤ q ≤ 103 0 ≤ x ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class myStack { int top; vector<int> arr; int size; public: myStack(int n) { top = -1; size = n; arr.resize(n); } bool isEmpty() { return top == -1; } bool isFull() { return top == size - 1; } void push(int x) { if (isFull()) return; arr[++top] = x; } void pop() { if (isEmpty()) return; top--; } int peek() { if (isEmpty()) return -1; return arr[top]; } };. The detected topics are Expected Complexities, Company Tags, FactSet, Visa, Goldman Sachs, Qualcomm, Kritikal Solutions, Topic Tags. Review the synced source file for the implementation details.
