# As far as I know this is the easiest solution that you will find!!check this guys! =)

- Platform: GeeksforGeeks
- Language: // User function Template for Java class Solution { public ArrayList<Integer> customSort(int[] arr) { // your code ArrayList<Integer> list = new ArrayList<>(); int mid = arr.length/2; int start = 0; int end = arr.length-1; Arrays.sort(arr, 0, mid); Arrays.sort(arr, mid, arr.length); while( start < mid ) list.add(arr[start++]); while ( end >= mid ) list.add(arr[end--]); return list; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sort-first-half-in-ascending-and-second-half-in-descending1714/1
- Synced: 2026-07-07T16:08:48.710Z

## Problem Description

Given an array arr of even size, sort the first half of the array in ascending order and the second half in descending order. Examples : Input: arr[] = [10, 20, 30, 40] Output: [10, 20, 40, 30] Explanation: The array is divided into two equal halves: [10, 20] and [30, 40]. The first half is already in ascending order, so it remains [10, 20]. The second half is sorted in descending order, changing [30, 40] to [40, 30]. Thus, the final array becomes [10, 20, 40, 30]. Input: arr[] = [5, 4, 6, 2, 3, 8, 9, 7] Output: [2, 4, 5, 6, 9, 8, 7, 3] Explanation: The array is divided into two equal halves: [5, 4, 6, 2] and [3, 8, 9, 7]. Sorting the first half in ascending order gives [2, 4, 5, 6]. Sorting the second half in descending order gives [9, 8, 7, 3]. Combining both halves, the final array becomes [2, 4, 5, 6, 9, 8, 7, 3]. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for Java class Solution { public ArrayList<Integer> customSort(int[] arr) { // your code ArrayList<Integer> list = new ArrayList<>(); int mid = arr.length/2; int start = 0; int end = arr.length-1; Arrays.sort(arr, 0, mid); Arrays.sort(arr, mid, arr.length); while( start < mid ) list.add(arr[start++]); while ( end >= mid ) list.add(arr[end--]); return list; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles. Review the synced source file for the implementation details.
