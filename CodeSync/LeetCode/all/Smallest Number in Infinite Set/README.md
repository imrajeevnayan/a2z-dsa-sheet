# Smallest Number in Infinite Set

- Platform: LeetCode
- Language: LeetCode 75
- Difficulty: Medium
- Topics: Hash Table, Design, Heap (Priority Queue), Ordered Set
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/smallest-number-in-infinite-set/description/?envType=study-plan-v2&envId=leetcode-75
- Synced: 2026-07-29T08:49:23.342Z

## Problem Description

You have a set which contains all positive integers [1, 2, 3, 4, 5, ...]. Implement the SmallestInfiniteSet class: SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers. int popSmallest() Removes and returns the smallest integer contained in the infinite set. void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set. Example 1: Input ["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"] [[], [2], [], [], [], [1], [], [], []] Output [null, null, 1, 2, 3, null, 1, 4, 5] Explanation SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet(); smallestInfiniteSet.addBack(2); // 2 is already in the set, so no change is made. smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set. smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set. smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set. smallestInfiniteSet.addBack(1); // 1 is added back to the set. smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and // is the smallest number, and remove it from the set. smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set. smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set. Constraints: 1 <= num <= 1000 At most 1000 calls will be made in total to popSmallest and addBack.

## Explanation

This solution was accepted on LeetCode using LeetCode 75. The detected topics are Hash Table, Design, Heap (Priority Queue), Ordered Set. Review the synced source file for the implementation details.
