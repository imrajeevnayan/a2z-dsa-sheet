# C++ CODE:

- Platform: GeeksforGeeks
- Language: vector<vector<int>> separateChaining(int hashSize,int arr[],int n) { //Your code here vector<vector<int>> v1(hashSize); vector<int> v2; for(int i = 0; i < n; i++) { int index = arr[i]% hashSize; v2.push_back(arr[i]); if(!v1[index].empty()){ v1[index].push_back(arr[i]); } else{ v1[index] = v2; } v2.clear(); } return v1; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Hash, Linked List, Arrays, Related Articles, C Program Hashing Chaining
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/separate-chaining-in-hashing-1587115621/1
- Synced: 2026-08-08T19:15:09.775Z

## Problem Description

Given an integer m representing the size of a hash table and an array arr[] of distinct integers, insert all the elements of the array into the hash table using the Separate Chaining technique. Return a 2D array, where each index of the outer array represents a slot in the hash table, and the corresponding inner array contains all the elements stored in that slot, in the order they were inserted. Note: In the Separate Chaining technique, each slot of the hash table is implemented as a linked list. If multiple elements map to the same slot (i.e., a collision occurs), they are stored in the linked list for that slot in the order they are inserted. Examples : Input: arr[] = [6, 4, 10, 13, 5], m = 4 Output: [[4], [13, 5], [6, 10], []] Explanation: 6 % 4 = 2, so 6 is inserted into slot 2. 4 % 4 = 0, so 4 is inserted into slot 0. 10 % 4 = 2, so it is appended to the linked list at slot 2 after 6. 13 % 4 = 1, so it is inserted into slot 1. 5 % 4 = 1, so it is appended to the linked list at slot 1 after 13. Input: arr[] = [12, 45, 36, 86, 10], m = 3 Output: [[12, 45, 36], [10], [86]] Explanation: 12 % 3 = 0, so 12 is inserted into slot 0. 45 % 3 = 0, so it is appended to the linked list at slot 0. 36 % 3 = 0, so it is appended after 45 in slot 0. 86 % 3 = 2, so it is inserted into slot 2. 10 % 3 = 1, so it is inserted into slot 1.

## Explanation

This solution was accepted on GeeksforGeeks using vector<vector<int>> separateChaining(int hashSize,int arr[],int n) { //Your code here vector<vector<int>> v1(hashSize); vector<int> v2; for(int i = 0; i < n; i++) { int index = arr[i]% hashSize; v2.push_back(arr[i]); if(!v1[index].empty()){ v1[index].push_back(arr[i]); } else{ v1[index] = v2; } v2.clear(); } return v1; }. The detected topics are Expected Complexities, Topic Tags, Hash, Linked List, Arrays, Related Articles, C Program Hashing Chaining. Review the synced source file for the implementation details.
