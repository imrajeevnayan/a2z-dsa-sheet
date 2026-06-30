# Convert a sentence into its equivalent mobile numeric keypad sequence

- Platform: GeeksforGeeks
- Language: // C++ implementation to convert a // sentence into its equivalent // mobile numeric keypad sequence #include <bits/stdc++.h> using namespace std; // Function which computes the sequence string printSequence(string arr[], string input) { string output = ""; // length of input string int n = input.length(); for (int i = 0; i < n; i++) { // Checking for space if (input[i] == ' ') output = output + "0"; else { // Calculating index for each // character int position = input[i] - 'A'; output = output + arr[position]; } } // Output sequence return output; } // Driver Code int main() { // storing the sequence in array string str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" }; string input = "GEEKSFORGEEKS"; cout << printSequence(str, input); return 0; }
- Difficulty: Unknown
- Topics: Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
- Synced: 2026-06-30T09:48:03.268Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using // C++ implementation to convert a // sentence into its equivalent // mobile numeric keypad sequence #include <bits/stdc++.h> using namespace std; // Function which computes the sequence string printSequence(string arr[], string input) { string output = ""; // length of input string int n = input.length(); for (int i = 0; i < n; i++) { // Checking for space if (input[i] == ' ') output = output + "0"; else { // Calculating index for each // character int position = input[i] - 'A'; output = output + arr[position]; } } // Output sequence return output; } // Driver Code int main() { // storing the sequence in array string str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" }; string input = "GEEKSFORGEEKS"; cout << printSequence(str, input); return 0; }. The detected topics are Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
