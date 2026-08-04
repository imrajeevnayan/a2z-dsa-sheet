# Special Stack

- Platform: GeeksforGeeks
- Language: /*Complete the function(s) below*/ class GfG { Stack<Long> st=new Stack<Long>(); Long mini; public void push(int a, Stack<Integer> s) { s.push(a); // add code here. } public int pop(Stack<Integer> s) { // add code here. if(s.isEmpty())return -1; return s.pop(); } public int min(Stack<Integer> s) { if (s.isEmpty()) return -1; // agar stack empty hai int min = s.peek(); Stack<Integer> t = new Stack<>(); while (!s.isEmpty()) { // ✅ yehi sahi hai min = Math.min(min, s.peek()); t.push(s.pop()); } while (!t.isEmpty()) { // original stack wapas restore karna s.push(t.pop()); } return min; } public boolean isFull(Stack<Integer> s, int n) { // add code return s.size()==n; } public boolean isEmpty(Stack<Integer> s) { return s.isEmpty(); // add code here. } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, VMWare, Flipkart, Amazon, Microsoft, FactSet
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/special-stack/1
- Synced: 2026-08-04T16:41:26.692Z

## Problem Description

Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return the minimum element from the SpecialStack. Your task is to complete all the functions, using a stack data structure. Note: The output of the code will be the value returned by getMin() function. Examples: Input: stack: 18 19 29 15 16 Output: 15 Explanation: The minimum element of the stack is 15. Input: stack: 34 335 1814 86 Output: 34 Explanation: The minimum element of the stack is 34. Constraints: 1 ≤ ele ≤ 105 1 ≤ stack.size() ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using /*Complete the function(s) below*/ class GfG { Stack<Long> st=new Stack<Long>(); Long mini; public void push(int a, Stack<Integer> s) { s.push(a); // add code here. } public int pop(Stack<Integer> s) { // add code here. if(s.isEmpty())return -1; return s.pop(); } public int min(Stack<Integer> s) { if (s.isEmpty()) return -1; // agar stack empty hai int min = s.peek(); Stack<Integer> t = new Stack<>(); while (!s.isEmpty()) { // ✅ yehi sahi hai min = Math.min(min, s.peek()); t.push(s.pop()); } while (!t.isEmpty()) { // original stack wapas restore karna s.push(t.pop()); } return min; } public boolean isFull(Stack<Integer> s, int n) { // add code return s.size()==n; } public boolean isEmpty(Stack<Integer> s) { return s.isEmpty(); // add code here. } }. The detected topics are Expected Complexities, Company Tags, Paytm, VMWare, Flipkart, Amazon, Microsoft, FactSet. Review the synced source file for the implementation details.
