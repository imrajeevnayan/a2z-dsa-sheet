# 🔢 Extract All Distinct Digits from Array - Smart Frequency Approach

- Platform: GeeksforGeeks
- Language: vector<int> common_digits(vector<int> nums) { unordered_set<int> st; for(int num : nums) { if(num == 0) st.insert(0); else { while(num > 0) { st.insert(num%10); num = num/10; } } } vector<int> ans(st.begin(), st.end()); sort(ans.begin(), ans.end()); return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoAmazonMakeMyTrip, Company Tags, Zoho, Amazon, MakeMyTrip, Topic Tags, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/make-a-distinct-digit-array2007/1
- Synced: 2026-07-07T16:03:58.141Z

## Problem Description

Given an array arr[] of positive integers, find all the distinct digits that appear in the elements of the array. Return the digits in sorted order. Examples : Input: arr[] = [131, 11, 48] Output: [1, 3, 4, 8] Explanation: 1, 3, 4, and 8 are only distinct digits that can be extracted from the numbers of the array. Input: arr[] = [111, 222, 333, 4444, 666] Output: [1, 2, 3, 4, 6] Explanation: 1, 2, 3, 4, and 6 are only distinct digits that can be extracted from the numbers of the array. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> common_digits(vector<int> nums) { unordered_set<int> st; for(int num : nums) { if(num == 0) st.insert(0); else { while(num > 0) { st.insert(num%10); num = num/10; } } } vector<int> ans(st.begin(), st.end()); sort(ans.begin(), ans.end()); return ans; }. The detected topics are Expected Complexities, Company Tags ZohoAmazonMakeMyTrip, Company Tags, Zoho, Amazon, MakeMyTrip, Topic Tags, Arrays. Review the synced source file for the implementation details.
