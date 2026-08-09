# C++ Solution

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AdobeAtlassian, Company Tags, Adobe, Atlassian, Topic Tags, Hash, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621--162858/1
- Synced: 2026-08-08T19:12:51.713Z

## Problem Description

Given a lowercase string array arr[]. Each element in the array represents a vote cast for a candidate. Return the name of the candidate who received the maximum number of votes and the count of votes he received. In case of a tie between two or more candidates, return the lexicographically smallest name. Note: Return an array of strings, the winning candidate name as the first element and the vote count as the second element (typecast the count to string). Examples : Input: arr[] = ["john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"] Output: ["john", "4"] Explanation: "john" has 4 votes casted for him, but so does "johnny". "john" is lexicographically smaller, so we print "john" and the votes he received. Input: n = 3 arr[] = ["andy", "blake", "clark"] Output: ["Andy", "1"] Explanation: All the candidates get 1 votes each. We print "andy" as it is lexicographically smaller. Constraints: 1 <= arr.size() <= 105 1 <= arr[i].size() <= 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags AdobeAtlassian, Company Tags, Adobe, Atlassian, Topic Tags, Hash, Strings. Review the synced source file for the implementation details.
