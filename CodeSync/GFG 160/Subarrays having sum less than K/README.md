# Subarrays having sum less than K

- Platform: GeeksforGeeks
- Language: #include <vector> using namespace std; // Function to count subarrays having sum less than k int countsubarray(vector<int> &arr, int k) { int n = arr.size(); int count = 0; // Pick starting point for (int i = 0; i < n; i++) { int sum = 0; // Pick ending point for (int j = i; j < n; j++) { // If sum is less than k, update sum and count if (sum + arr[j] < k) { sum += arr[j]; count++; } else { break; } } } return count; } int main() { vector<int> arr = {1, 11, 2, 3, 15}; int k = 10; cout << countsubarray(arr, k); return 0; }
- Difficulty: Unknown
- Topics: sliding-window, Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/number-subarrays-sum-less-k/
- Synced: 2026-07-10T16:39:17.060Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <vector> using namespace std; // Function to count subarrays having sum less than k int countsubarray(vector<int> &arr, int k) { int n = arr.size(); int count = 0; // Pick starting point for (int i = 0; i < n; i++) { int sum = 0; // Pick ending point for (int j = i; j < n; j++) { // If sum is less than k, update sum and count if (sum + arr[j] < k) { sum += arr[j]; count++; } else { break; } } } return count; } int main() { vector<int> arr = {1, 11, 2, 3, 15}; int k = 10; cout << countsubarray(arr, k); return 0; }. The detected topics are sliding-window, Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
