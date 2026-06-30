# Pair with the given difference

- Platform: GeeksforGeeks
- Language: // C++ program to find a pair with the given difference #include <bits/stdc++.h> using namespace std; bool findPair(vector<int> &arr, int x) { int n = arr.size(); // Compare each element with every other element for (int i = 0; i < n; i++) { for (int j = i + 1; j < n; j++) { // Check if absolute difference matches target if (abs(arr[i] - arr[j]) == x) { return true; } } } return false; } int main() { vector<int> arr = {5, 20, 3, 2, 50, 80}; int x = 78; if (findPair(arr, x)) { cout << "true"; } else { cout << "false"; } return 0; }
- Difficulty: Unknown
- Topics: Amazon, Visa, Binary Search, two-pointer-algorithm, Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/find-a-pair-with-the-given-difference/
- Synced: 2026-06-30T09:09:18.839Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using // C++ program to find a pair with the given difference #include <bits/stdc++.h> using namespace std; bool findPair(vector<int> &arr, int x) { int n = arr.size(); // Compare each element with every other element for (int i = 0; i < n; i++) { for (int j = i + 1; j < n; j++) { // Check if absolute difference matches target if (abs(arr[i] - arr[j]) == x) { return true; } } } return false; } int main() { vector<int> arr = {5, 20, 3, 2, 50, 80}; int x = 78; if (findPair(arr, x)) { cout << "true"; } else { cout << "false"; } return 0; }. The detected topics are Amazon, Visa, Binary Search, two-pointer-algorithm, Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
