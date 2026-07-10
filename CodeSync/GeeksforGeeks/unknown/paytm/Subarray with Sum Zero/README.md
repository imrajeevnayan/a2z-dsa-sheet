# Subarray with Sum Zero

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <vector> using namespace std; bool subArrayExists(vector<int>& arr) { for (int i = 0; i < arr.size(); i++) { // starting point of the sub arrray and // sum is initialized with first element of subarray // a[i] int sum = arr[i]; if (sum == 0) return true; for (int j = i + 1; j < arr.size(); j++) { // we are finding the sum till jth index // starting from ith index sum += arr[j]; if (sum == 0) return true; } } return false; } int main() { vector<int> arr = { -3, 2, 3, 1, 6 }; if (subArrayExists(arr)) cout << "true"; else cout << "false"; return 0; }
- Difficulty: Unknown
- Topics: Paytm, MakeMyTrip, prefix-sum, STL, subarray, Hash, cpp-unordered_set, subarray-sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/find-if-there-is-a-subarray-with-0-sum/
- Synced: 2026-07-10T09:54:26.849Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <vector> using namespace std; bool subArrayExists(vector<int>& arr) { for (int i = 0; i < arr.size(); i++) { // starting point of the sub arrray and // sum is initialized with first element of subarray // a[i] int sum = arr[i]; if (sum == 0) return true; for (int j = i + 1; j < arr.size(); j++) { // we are finding the sum till jth index // starting from ith index sum += arr[j]; if (sum == 0) return true; } } return false; } int main() { vector<int> arr = { -3, 2, 3, 1, 6 }; if (subArrayExists(arr)) cout << "true"; else cout << "false"; return 0; }. The detected topics are Paytm, MakeMyTrip, prefix-sum, STL, subarray, Hash, cpp-unordered_set, subarray-sum. Review the synced source file for the implementation details.
