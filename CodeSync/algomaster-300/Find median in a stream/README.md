# Find median in a stream

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Amazon, Microsoft, Samsung, D-E-Shaw
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/find-median-in-a-stream-1587115620
- Synced: 2026-06-15T11:32:30.999Z

## Problem Description

Given a data stream arr[] where integers are read sequentially, the task is to determine the median of the elements encountered so far after each new integer is read. The median is defined as follows: 1. Odd number of elements: The median is the middle element when the current set of numbers is sorted. 2. Even number of elements: The median is the arithmetic mean (average) of the two middle elements when the current set of numbers is sorted. Examples: Input: arr[] = [5, 15, 1, 3, 2, 8] Output: [5.0, 10.0, 5.0, 4.0, 3.0, 4.0] Explanation: After reading 1st element of stream – 5 -> median = 5.0 After reading 2nd element of stream – 5, 15 -> median = (5+15)/2 = 10.0 After reading 3rd element of stream – 5, 15, 1 -> median = 5.0 After reading 4th element of stream – 5, 15, 1, 3 -> median = (3+5)/2 = 4.0 After reading 5th element of stream – 5, 15, 1, 3, 2 -> median = 3.0 After reading 6th element of stream – 5, 15, 1, 3, 2, 8 -> median = (3+5)/2 = 4.0 Input: arr[] = [2, 2, 2, 2] Output: [2.0, 2.0, 2.0, 2.0] Explanation: After reading 1st element of stream – 2 -> median = 2.0 After reading 2nd element of stream – 2, 2 -> median = (2+2)/2 = 2.0 After reading 3rd element of stream – 2, 2, 2 -> median = 2.0 After reading 4th element of stream – 2, 2, 2, 2 -> median = (2+2)/2 = 2.0 Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Amazon, Microsoft, Samsung, D-E-Shaw. Review the synced source file for the implementation details.
