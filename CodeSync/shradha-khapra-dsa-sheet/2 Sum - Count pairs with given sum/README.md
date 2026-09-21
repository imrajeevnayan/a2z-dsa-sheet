# 2 Sum - Count pairs with given sum

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <vector> using namespace std; int countPairs(vector<int> &arr, int target) { int n = arr.size(); int cnt = 0; // Iterate through each element in the array for (int i = 0; i < n; i++) { // For each element arr[i], check every // other element arr[j] that comes after it for (int j = i + 1; j < n; j++) { // Check if the sum of the current pair // equals the target if (arr[i] + arr[j] == target) { cnt++; } } } return cnt; } int main() { vector<int> arr = {1, 5, 7, -1, 5}; int target = 6; cout << countPairs(arr, target) << endl; return 0; }
- Difficulty: Unknown
- Topics: Placement 360 Course Explore, Placement 360 Course, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/count-pairs-with-given-sum/
- Synced: 2026-09-20T17:26:55.468Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <vector> using namespace std; int countPairs(vector<int> &arr, int target) { int n = arr.size(); int cnt = 0; // Iterate through each element in the array for (int i = 0; i < n; i++) { // For each element arr[i], check every // other element arr[j] that comes after it for (int j = i + 1; j < n; j++) { // Check if the sum of the current pair // equals the target if (arr[i] + arr[j] == target) { cnt++; } } } return cnt; } int main() { vector<int> arr = {1, 5, 7, -1, 5}; int target = 6; cout << countPairs(arr, target) << endl; return 0; }. The detected topics are Placement 360 Course Explore, Placement 360 Course, Explore. Review the synced source file for the implementation details.
