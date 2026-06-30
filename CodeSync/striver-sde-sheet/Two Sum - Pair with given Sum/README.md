# Two Sum - Pair with given Sum

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <vector> using namespace std; bool twoSum(vector<int> &arr, int target) { int n = arr.size(); for (int i = 0; i < n; i++) { // For each element arr[i], check every // other element arr[j] that comes after it for (int j = i + 1; j < n; j++) { // Check if the sum of the current pair // equals the target if (arr[i] + arr[j] == target) { return true; } } } // If no pair is found after checking // all possibilities return false; } int main() { vector<int> arr = {0, -1, 2, -3, 1}; int target = -2; if(twoSum(arr, target)) cout << "true"; else cout << "false"; return 0; }
- Difficulty: Unknown
- Topics: Microsoft, Amazon, Morgan Stanley, Flipkart, Accolite, Zoho, Hike, SAP Labs
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/check-if-pair-with-given-sum-exists-in-array/
- Synced: 2026-06-30T09:10:46.091Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <vector> using namespace std; bool twoSum(vector<int> &arr, int target) { int n = arr.size(); for (int i = 0; i < n; i++) { // For each element arr[i], check every // other element arr[j] that comes after it for (int j = i + 1; j < n; j++) { // Check if the sum of the current pair // equals the target if (arr[i] + arr[j] == target) { return true; } } } // If no pair is found after checking // all possibilities return false; } int main() { vector<int> arr = {0, -1, 2, -3, 1}; int target = -2; if(twoSum(arr, target)) cout << "true"; else cout << "false"; return 0; }. The detected topics are Microsoft, Amazon, Morgan Stanley, Flipkart, Accolite, Zoho, Hike, SAP Labs. Review the synced source file for the implementation details.
