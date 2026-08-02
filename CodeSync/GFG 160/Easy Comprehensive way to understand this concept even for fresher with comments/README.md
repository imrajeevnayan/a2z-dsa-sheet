# Easy Comprehensive way to understand this concept even for fresher with comments.

- Platform: GeeksforGeeks
- Language: class Solution { public: string reverseWords(string &s) { // code here stack<char> st; string result = ""; for(int i=0; i<s.length(); i++){ if(s[i] != ' '){ st.push(s[i]); }else{ if(!st.empty()){ while(!st.empty()){ result+=st.top(); st.pop(); } result+=" "; } } } while(!st.empty()){ result+=st.top(); st.pop(); } if(!result.empty() && result.back() == ' '){ result.pop_back(); } return result; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Zoho, Flipkart, Amazon, Microsoft, Payu
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/1
- Synced: 2026-08-02T11:42:26.568Z

## Problem Description

You are given a string s. You need to reverse each word in it where the words are separated by spaces and return the modified string. Note: The string may contain leading or trailing spaces, or multiple spaces between two words. The returned string should only have a single space separating the words, and no extra spaces should be included. Examples: Input: s = " i like this program very much " Output: "i ekil siht margorp yrev hcum" Explanation: The words are reversed as follows: "i" -> "i","like"->"ekil", "this"->"siht","program" -> "margorp", "very" -> "yrev","much" -> "hcum". Input: s = " pqr mno " Output: "rqp onm" Explanation: The words are reversed as follows: "pqr" -> "rqp" , "mno" -> "onm" Input: s = "pqr" Output: "rqp" Explanation: The words are reversed as follows: "pqr" -> "rqp" Constraints: 1 <= s.size() <= 105 string s contains only lowercase English alphabets and spaces

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: string reverseWords(string &s) { // code here stack<char> st; string result = ""; for(int i=0; i<s.length(); i++){ if(s[i] != ' '){ st.push(s[i]); }else{ if(!st.empty()){ while(!st.empty()){ result+=st.top(); st.pop(); } result+=" "; } } } while(!st.empty()){ result+=st.top(); st.pop(); } if(!result.empty() && result.back() == ' '){ result.pop_back(); } return result; } };. The detected topics are Expected Complexities, Company Tags, Paytm, Zoho, Flipkart, Amazon, Microsoft, Payu. Review the synced source file for the implementation details.
