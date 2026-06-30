# Remove Consecutive Characters | String as Stack (One Pass)

- Platform: GeeksforGeeks
- Language: class Solution { public: string removeDuplicates(string& s) { // code here. stack<char> stk; string res=""; for(int i=0; i<s.length(); i++){ if(!stk.empty() && stk.top() == s[i]){ continue; } stk.push(s[i]); } while(!stk.empty()){ res+=stk.top(); stk.pop(); } reverse(res.begin(), res.end()); return res; } };
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/consecutive-elements2306/1
- Synced: 2026-06-30T09:46:01.035Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: string removeDuplicates(string& s) { // code here. stack<char> stk; string res=""; for(int i=0; i<s.length(); i++){ if(!stk.empty() && stk.top() == s[i]){ continue; } stk.push(s[i]); } while(!stk.empty()){ res+=stk.top(); stk.pop(); } reverse(res.begin(), res.end()); return res; } };. Review the synced source file for the implementation details.
