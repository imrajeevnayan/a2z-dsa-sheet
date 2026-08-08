# Design HashMap

- Platform: GeeksforGeeks
- Language: class MyHashMap { public: vector<int> mp; MyHashMap() { mp.resize(10e5 , -1); } void put(int key, int value) { mp[key] = value; } int get(int key) { return mp[key] ; } void remove(int key) { mp[key] = -1; } };
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Hash, Map, Design-Pattern, Related Articles, Designing A Hashmap Without Built In Libraries
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/design-hashmap/1
- Synced: 2026-08-08T16:33:32.797Z

## Problem Description

Design a HashMap without using any built-in hash table libraries. To be specific, your design should include these functions: put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value. get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key. remove(key) : Remove the mapping for the value key if this map contains the mapping for the key. Example 1: Input: n = 8 put(1,1) put(2,2) get(1) get(3) put(2,1) get(2) remove(2) get(2) Output: 1 -1 1 -1 Explanation: MyHashMap hashMap = new MyHashMap(); hashMap.put(1, 1);// Now the value of key 1 is 1. hashMap.put(2, 2);// Now the value of key 2 is 2. hashMap.get(1);// returns 1 hashMap.get(3);// returns -1 (not found) hashMap.put(2, 1);// update the existing value of key 2 to 1. hashMap.get(2);// returns 1 hashMap.remove(2);// remove the mapping for 2. hashMap.get(2);// returns -1 (not found) Example 2: Input: n = 3 put(1,1) put(2 2) get(2) Output: 2 Explanation: hashMap.put(1,1)// Now the value of key 1 is 1. hashMap.put(2,2)// Now the value of key 2 is 2. hashMap.get(2)// Returns 2. Your Task: You only need to complete the provided function put(), remove(), get(). Expected Time Complexity: O(1) for put(), remove(), get(). Expected Auxiliary Space: O(n) for put(), remove(), get(). Constraints: 1 <= q <= 104 1 <= key <= 104

## Explanation

This solution was accepted on GeeksforGeeks using class MyHashMap { public: vector<int> mp; MyHashMap() { mp.resize(10e5 , -1); } void put(int key, int value) { mp[key] = value; } int get(int key) { return mp[key] ; } void remove(int key) { mp[key] = -1; } };. The detected topics are Topic Tags Related Articles, Topic Tags, Hash, Map, Design-Pattern, Related Articles, Designing A Hashmap Without Built In Libraries. Review the synced source file for the implementation details.
