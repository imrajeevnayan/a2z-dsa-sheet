# Print all the duplicate characters in a string

- Platform: GeeksforGeeks
- Language: // C++ Code to print duplicate characters // and their counts using Sorting #include <bits/stdc++.h> using namespace std; // Function to print duplicate characters with their count void printDuplicates(string s) { // Sort the string to group same characters together sort(s.begin(), s.end()); // Traverse the sorted string to count duplicates for (int i = 0; i < s.length();) { int count = 1; // Count occurrences of current character while (i + count < s.length() && s[i] == s[i + count]) { count++; } // If count > 1, print the character and its count if (count > 1) { cout << "['" << s[i] << "', " << count << "], "; } // Move to the next different character i += count; } } int main() { string s = "geeksforgeeks"; printDuplicates(s); return 0; }
- Difficulty: Unknown
- Topics: String Duplicates, Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/print-all-the-duplicates-in-the-input-string/
- Synced: 2026-06-30T09:48:58.452Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using // C++ Code to print duplicate characters // and their counts using Sorting #include <bits/stdc++.h> using namespace std; // Function to print duplicate characters with their count void printDuplicates(string s) { // Sort the string to group same characters together sort(s.begin(), s.end()); // Traverse the sorted string to count duplicates for (int i = 0; i < s.length();) { int count = 1; // Count occurrences of current character while (i + count < s.length() && s[i] == s[i + count]) { count++; } // If count > 1, print the character and its count if (count > 1) { cout << "['" << s[i] << "', " << count << "], "; } // Move to the next different character i += count; } } int main() { string s = "geeksforgeeks"; printDuplicates(s); return 0; }. The detected topics are String Duplicates, Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
