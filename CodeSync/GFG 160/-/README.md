# }

- Platform: GeeksforGeeks
- Language: class Solution { public boolean search(int[] arr, int key) { //Search the pivot index int low = 0, high = arr.length - 1; //Initializing pivot to zero. If pivot remains zero, array is not rotated int pivot = 0; while(low <= high) { int mid = low + (high - low) / 2; //When the element in the right becomes smaller than in the left in a sorted array, the array is rotated if(mid < high && arr[mid] > arr[mid + 1]) { pivot = mid + 1; break; } //When the element in the left becomes larger than in the right in a sorted array, the array is rotated if(mid > low && arr[mid] < arr[mid - 1]) { pivot = mid; break; } if(arr[mid] >= arr[low]) low = mid + 1; else high = mid - 1; } //Select the range to find key low = 0; high = arr.length - 1; if(key >= arr[pivot] && key <= arr[high]) low = pivot; else high = pivot - 1; //Search the key while(low <= high) { int mid = low + (high - low) / 2; if(arr[mid] == key) return true; else if(arr[mid] > key) high = mid - 1; else low = mid + 1; } return false; } } //This code is contributed by Soumyadip Banerjee
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AdobeBloombergYahooUber, Company Tags, Adobe, Bloomberg, Yahoo, Uber, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/search-in-rotated-array-2/1
- Synced: 2026-07-28T09:46:36.933Z

## Problem Description

Given a sorted and rotated array arr[] and a target key. Check whether the key is present in the array or not. Note: The array may contains duplicate elements. Examples: Input: arr[] = [3, 3, 3, 1, 2, 3], key = 3 Output: true Explanation: 3 is present in the array. Input: arr[] = [4, 5, 8, 1, 1, 1, 2], key = 6 Output: false Explanation: 6 is not present in the array. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i], key ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public boolean search(int[] arr, int key) { //Search the pivot index int low = 0, high = arr.length - 1; //Initializing pivot to zero. If pivot remains zero, array is not rotated int pivot = 0; while(low <= high) { int mid = low + (high - low) / 2; //When the element in the right becomes smaller than in the left in a sorted array, the array is rotated if(mid < high && arr[mid] > arr[mid + 1]) { pivot = mid + 1; break; } //When the element in the left becomes larger than in the right in a sorted array, the array is rotated if(mid > low && arr[mid] < arr[mid - 1]) { pivot = mid; break; } if(arr[mid] >= arr[low]) low = mid + 1; else high = mid - 1; } //Select the range to find key low = 0; high = arr.length - 1; if(key >= arr[pivot] && key <= arr[high]) low = pivot; else high = pivot - 1; //Search the key while(low <= high) { int mid = low + (high - low) / 2; if(arr[mid] == key) return true; else if(arr[mid] > key) high = mid - 1; else low = mid + 1; } return false; } } //This code is contributed by Soumyadip Banerjee. The detected topics are Expected Complexities, Company Tags AdobeBloombergYahooUber, Company Tags, Adobe, Bloomberg, Yahoo, Uber, Topic Tags. Review the synced source file for the implementation details.
