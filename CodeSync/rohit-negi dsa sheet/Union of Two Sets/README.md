# Union of Two Sets

- Platform: GeeksforGeeks
- Language: a = set([int(x) for x in input().strip().split()]) b = set([int(x) for x in input().strip().split()]) ########### Write your code below ############### st = a|b # Union of a and b ########### Write your code above ############### # Printing the size of the set which is the total number of elements in the set. print(len(st))
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoRockstand, Company Tags, Zoho, Rockstand, Topic Tags, Hash, Mathematical
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/union-of-two-arrays3538--171343/1
- Synced: 2026-08-12T11:33:05.327Z

## Problem Description

Given two sets a and b, the task is to find the number of elements in the union between these two sets. The Union of the two sets can be defined as the set containing distinct elements from both sets. If there are repetitions, then only one element occurrence should be there in the union. Note: Elements are not necessarily distinct. Examples Input: a = [1, 2, 3, 4, 5], b = [1, 2, 3] Output: 5 Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union of both sets. So count is 5. Input: a = [85, 25, 1, 32, 54, 6], b = [85, 2] Output: 7 Explanation: 85, 25, 1, 32, 54, 6, and 2 are the elements which comes in the union of both sets. So count is 7. Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] Output: 2 Explanation: We need to consider only distinct. So count is 2. Constraints: 1 ≤ a.size(), b.size() ≤ 106 0 ≤ a[i], b[i] < 105

## Explanation

This solution was accepted on GeeksforGeeks using a = set([int(x) for x in input().strip().split()]) b = set([int(x) for x in input().strip().split()]) ########### Write your code below ############### st = a|b # Union of a and b ########### Write your code above ############### # Printing the size of the set which is the total number of elements in the set. print(len(st)). The detected topics are Expected Complexities, Company Tags ZohoRockstand, Company Tags, Zoho, Rockstand, Topic Tags, Hash, Mathematical. Review the synced source file for the implementation details.
