# Maximum and minimum of an array using minimum number of comparisons

- Platform: GeeksforGeeks
- Language: #include <vector> #include <algorithm> #include <iostream> using namespace std; vector<int> findMinMax(vector<int>& arr) { vector<int> sortedArr = arr; // Sort array sort(sortedArr.begin(), sortedArr.end()); return {sortedArr[0], sortedArr[sortedArr.size()-1]}; } int main() { vector<int> arr = {3, 5, 4, 1, 9}; vector<int> result = findMinMax(arr); cout << result[0] << " " << result[1] << endl; return 0; }
- Difficulty: Unknown
- Topics: Arrays, Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/maximum-and-minimum-in-an-array/
- Synced: 2026-06-14T05:28:05.485Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <vector> #include <algorithm> #include <iostream> using namespace std; vector<int> findMinMax(vector<int>& arr) { vector<int> sortedArr = arr; // Sort array sort(sortedArr.begin(), sortedArr.end()); return {sortedArr[0], sortedArr[sortedArr.size()-1]}; } int main() { vector<int> arr = {3, 5, 4, 1, 9}; vector<int> result = findMinMax(arr); cout << result[0] << " " << result[1] << endl; return 0; }. The detected topics are Arrays, Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
