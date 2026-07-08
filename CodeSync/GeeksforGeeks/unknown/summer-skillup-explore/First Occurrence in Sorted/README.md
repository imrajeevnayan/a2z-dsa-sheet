# First Occurrence in Sorted

- Platform: GeeksforGeeks
- Language: #include <bits/stdc++.h> using namespace std; // Function to find the first occurrence of k in the array int firstSearch(vector<int> &arr, int k) { // Traverse the array from left to right for (int i = 0; i < arr.size(); i++) { // If current element matches k, return index if (arr[i] == k) { return i; // first occurrence found } } // If k is not present in the array, return -1 return -1; }; // Driver Code int main() { vector<int> arr = {1, 2, 3, 4, 5}; int k = 4; int result = firstSearch(arr, k); cout << "First Occurrence: " << result << endl; return 0; }
- Difficulty: Unknown
- Topics: Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/find-first-occurrence-in-sorted/
- Synced: 2026-07-08T07:11:59.350Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <bits/stdc++.h> using namespace std; // Function to find the first occurrence of k in the array int firstSearch(vector<int> &arr, int k) { // Traverse the array from left to right for (int i = 0; i < arr.size(); i++) { // If current element matches k, return index if (arr[i] == k) { return i; // first occurrence found } } // If k is not present in the array, return -1 return -1; }; // Driver Code int main() { vector<int> arr = {1, 2, 3, 4, 5}; int k = 4; int result = firstSearch(arr, k); cout << "First Occurrence: " << result << endl; return 0; }. The detected topics are Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
