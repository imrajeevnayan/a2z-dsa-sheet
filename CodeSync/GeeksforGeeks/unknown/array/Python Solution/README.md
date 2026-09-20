# Python Solution

- Platform: GeeksforGeeks
- Language: public List<List<Integer>> distinctPairs(int[] arr, int target) { // Your code here List<List<Integer>> ans = new ArrayList<>(); int n = arr.length; if(n<=1){ return ans; } Arrays.sort(arr); int left = 0; int right = n-1; while(left < right){ int sum = arr[left] + arr[right]; if(sum == target){ List<Integer> temp = new ArrayList<>(); temp.add(arr[left]); temp.add(arr[right]); ans.add(temp); int prev_left = arr[left]; int prev_right = arr[right]; while(arr[left] == prev_left){ left++; if(left >= right){ return ans; } } while(arr[right] == prev_right){ right--; if(left >= right){ return ans; } } } else if(sum < target){ left++; } else{ right--; } } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Print All Pairs With Given Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/all-distinct-pairs-with-given-sum/1
- Synced: 2026-09-20T11:35:13.072Z

## Problem Description

Given an array arr[] and an integer target. You have to find all distinct pairs in array arr[] which sums up to given target. Note: (a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered same. Return the list of pairs sorted lexicographically by the first element, and then by the second element if necessary. Examples: Input: arr[] = [1, 5, 7, -1, 5], target = 6 Output: [[1, 5], [-1, 7]] Explanation: Pairs with sum 6 are (1, 5) and (-1, 7). Input: arr[] = [1, 1, 1, 1], target = 2 Output: [[1, 1]] Explanation: Pairs with sum 2 are (1, 1). Input: arr[] = [10, 12, 10, 15, -1], target = 125 Output: []

## Explanation

This solution was accepted on GeeksforGeeks using public List<List<Integer>> distinctPairs(int[] arr, int target) { // Your code here List<List<Integer>> ans = new ArrayList<>(); int n = arr.length; if(n<=1){ return ans; } Arrays.sort(arr); int left = 0; int right = n-1; while(left < right){ int sum = arr[left] + arr[right]; if(sum == target){ List<Integer> temp = new ArrayList<>(); temp.add(arr[left]); temp.add(arr[right]); ans.add(temp); int prev_left = arr[left]; int prev_right = arr[right]; while(arr[left] == prev_left){ left++; if(left >= right){ return ans; } } while(arr[right] == prev_right){ right--; if(left >= right){ return ans; } } } else if(sum < target){ left++; } else{ right--; } } return ans; }. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Print All Pairs With Given Sum. Review the synced source file for the implementation details.
