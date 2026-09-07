# Print Pattern

- Platform: GeeksforGeeks
- Language: class Solution { ArrayList<Integer> ans = new ArrayList<>(); void peeche(int n) { ans.add(n); if(n <= 0) return; peeche(n - 5); } void aage(int n,int og) { if(n >= og) return; ans.add(n); aage(n + 5, og); } public ArrayList<Integer> pattern(int n) { // code here peeche(n); aage(ans.get(ans.size() - 1) + 5, n); if(ans.get(ans.size() - 1) != n) { ans.add(n); } return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, pattern-printing, Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-pattern3549/1
- Synced: 2026-09-07T05:25:33.083Z

## Problem Description

Given a number n, print a sequence of numbers starting from n. Each next number in the sequence is n - 5, and this continues recursively until the number becomes less than or equal to 0. After that, print the sequence in reverse order, adding 5 each time, until it reaches back to the original number n. Note: You must not use loops. Examples: Input: n = -16 Output: [-16] Explanation: Since -16 is less than zero so it will remain same. Input: n = 10 Output: [10, 5, 0, 5, 10] Explanation: The value decreases until it is greater or equal to 0. After that it increases and stops when it becomes 10 again. Constraints: -105 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { ArrayList<Integer> ans = new ArrayList<>(); void peeche(int n) { ans.add(n); if(n <= 0) return; peeche(n - 5); } void aage(int n,int og) { if(n >= og) return; ans.add(n); aage(n + 5, og); } public ArrayList<Integer> pattern(int n) { // code here peeche(n); aage(ans.get(ans.size() - 1) + 5, n); if(ans.get(ans.size() - 1) != n) { ans.add(n); } return ans; } }. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, pattern-printing, Recursion. Review the synced source file for the implementation details.
