# Justified Text

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Google, Company Tags, Google, Topic Tags, Arrays, Strings, implementation
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/justified-text/1
- Synced: 2026-08-03T17:13:20.104Z

## Problem Description

Given an array of words words[] and a line width l, format the words such that each line has exactly l characters and is fully justified (both left and right). Pack as many words as possible into each line greedily. Distribute extra spaces as evenly as possible between words on each line. If spaces cannot be distributed evenly, the left gaps get one more space than the right. The last line is left-justified, with single spaces between words and any remaining spaces added at the end. Return a list of strings where each string represents one formatted line. Examples: Input: words[] = ["geeksforgeeks", "is", "the", "best", "computer", "science", "portal", "for", "geeks"], l = 16 Output: ["geeksforgeeks is", "the best", "computer science", "portal for geeks"] Explanation: "geeksforgeeks is": contains 13 and 2 characters separated by 1 space. "the best": contains two words and 9 extra spaces. "computer science": contains 8 and 7 characters and 1 extra space. "portal for geeks": is left-justified with single spaces. Input: words[] = ["geeks", "for", "geeks"], l = 8 Output: ["geeks ", "for ", "geeks "] Explanation: Each line contains a single word, so the remaining positions are filled with trailing spaces. Constraints: 1 ≤ words.size() ≤ 103 1 ≤ length of each word ≤ 20 minimum word length ≤ l ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags Google, Company Tags, Google, Topic Tags, Arrays, Strings, implementation. Review the synced source file for the implementation details.
