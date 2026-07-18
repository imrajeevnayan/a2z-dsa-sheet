# All subsequences of a string

- Platform: GeeksforGeeks
- Language: #include <bits/stdc++.h> using namespace std; // Find all subsequences recursively void printSubRec(string s, string curr) { // Base Case : s is empty, print // current subsequence if (s.empty()) { cout << curr << endl; return; } // curr is passed with including // the first character of the string printSubRec(s.substr(1), curr + s[0]); // curr is passed without including // the first character of the string printSubRec(s.substr(1), curr); } // Wrapper method for printSubRec void printSubs(string s) { string curr = ""; printSubRec(s, curr); } // Driver code int main() { string s = "ab"; printSubs(s); return 0; }
- Difficulty: Unknown
- Topics: subsequence, Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/print-subsequences-string/
- Synced: 2026-07-18T12:00:49.713Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <bits/stdc++.h> using namespace std; // Find all subsequences recursively void printSubRec(string s, string curr) { // Base Case : s is empty, print // current subsequence if (s.empty()) { cout << curr << endl; return; } // curr is passed with including // the first character of the string printSubRec(s.substr(1), curr + s[0]); // curr is passed without including // the first character of the string printSubRec(s.substr(1), curr); } // Wrapper method for printSubRec void printSubs(string s) { string curr = ""; printSubRec(s, curr); } // Driver code int main() { string s = "ab"; printSubs(s); return 0; }. The detected topics are subsequence, Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
