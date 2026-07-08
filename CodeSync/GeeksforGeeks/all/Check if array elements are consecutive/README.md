# Check if array elements are consecutive

- Platform: GeeksforGeeks
- Language: // C++ program to check if array elements are consecutive #include <bits/stdc++.h> using namespace std; // Function to Check if array // elements are consecutive bool areConsecutives(vector<int> &arr) { int n = arr.size(); // Sort the array sort(arr.begin(), arr.end()); // checking the adjacent elements for (int i = 1; i < n; i++) { if (arr[i] != arr[i - 1] + 1) { return false; } } return true; } int main() { vector<int> arr = { 5, 2, 3, 1, 4 }; if (areConsecutives(arr)) { cout << "Yes" << endl; } else { cout << "No" << endl; } return 0; }
- Difficulty: Unknown
- Topics: Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/check-if-array-elements-are-consecutive/
- Synced: 2026-07-08T12:23:16.665Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using // C++ program to check if array elements are consecutive #include <bits/stdc++.h> using namespace std; // Function to Check if array // elements are consecutive bool areConsecutives(vector<int> &arr) { int n = arr.size(); // Sort the array sort(arr.begin(), arr.end()); // checking the adjacent elements for (int i = 1; i < n; i++) { if (arr[i] != arr[i - 1] + 1) { return false; } } return true; } int main() { vector<int> arr = { 5, 2, 3, 1, 4 }; if (areConsecutives(arr)) { cout << "Yes" << endl; } else { cout << "No" << endl; } return 0; }. The detected topics are Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
