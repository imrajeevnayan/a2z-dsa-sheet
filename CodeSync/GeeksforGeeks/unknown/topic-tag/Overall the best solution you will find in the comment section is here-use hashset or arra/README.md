# Overall the best solution you will find in the comment section is here!use hashset or arraylist as per you like!for bot that works : but the hashMap is a game changer!!Code solution!

- Platform: GeeksforGeeks
- Language: class Solution { public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) { // code here // ArrayList<Integer> list = new ArrayList<>(); // for ( int i : arr1 ) { // if ( !list.contains(i) ) list.add(i); // } // for ( int j : arr2 ) { // if ( !list.contains(j) ) list.add(j); // } HashSet<Integer> set = new HashSet<>(); for ( int i : arr1 ) set.add(i); for ( int j : arr2 ) set.add(j); ArrayList<Integer> list = new ArrayList<>(set); Collections.sort(list); return list; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Sorting, Merge Sort, Data Structures, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/merge-and-sort5821/1
- Synced: 2026-07-07T16:06:29.710Z

## Problem Description

Given two arrays arr1[] and arr2[], return the merged array in ascending order containing unique elements. Examples: Input: arr1[] = [11, 1, 8], arr2[] = [10, 11] Output: [1, 8, 10, 11] Explanation: The ouput array after merging both the arrays and removing duplicates is [1, 8, 10, 11] Input: arr1[] = [7, 1, 5, 3, 9], arr2[] = [8, 4, 3, 5, 2, 6] Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] Constraints: 1 ≤ arr1.size(), arr2.size() ≤ 104 0 ≤ arr1[i], arr2[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) { // code here // ArrayList<Integer> list = new ArrayList<>(); // for ( int i : arr1 ) { // if ( !list.contains(i) ) list.add(i); // } // for ( int j : arr2 ) { // if ( !list.contains(j) ) list.add(j); // } HashSet<Integer> set = new HashSet<>(); for ( int i : arr1 ) set.add(i); for ( int j : arr2 ) set.add(j); ArrayList<Integer> list = new ArrayList<>(set); Collections.sort(list); return list; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Sorting, Merge Sort, Data Structures, Algorithms, Related Articles. Review the synced source file for the implementation details.
