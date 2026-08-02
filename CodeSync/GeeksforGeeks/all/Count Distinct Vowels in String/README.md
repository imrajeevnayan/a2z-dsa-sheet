# Count Distinct Vowels in String

- Platform: GeeksforGeeks
- Language: def countVowels(self,s): #code here vowel=['a','e','i','o','u'] dic={} for i in range(len(s)): if s[i] in dic: dic[s[i]]+=1 else: dic[s[i]]=1 count=0 for x,y in dic.items(): if x in vowel: count+=1 return count
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-distinct-vowels-in-string/1
- Synced: 2026-08-02T11:08:20.264Z

## Problem Description

Given a string s, count the total distinct vowels in the string. The string s contains lowercase letters only. Examples: Input: s = geeksforgeeks Output: 1 Explanation: String "geeksforgeeks" has 2 distinct vowel "e" and "o". Input: s = world Output: 1 Explanation: It has only 1 distinct vowel "o". Constraints: 1 ≤ |s| ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using def countVowels(self,s): #code here vowel=['a','e','i','o','u'] dic={} for i in range(len(s)): if s[i] in dic: dic[s[i]]+=1 else: dic[s[i]]=1 count=0 for x,y in dic.items(): if x in vowel: count+=1 return count. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings. Review the synced source file for the implementation details.
