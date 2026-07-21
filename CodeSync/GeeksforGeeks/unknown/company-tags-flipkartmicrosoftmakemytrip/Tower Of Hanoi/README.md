# Tower Of Hanoi

- Platform: GeeksforGeeks
- Language: Text
- Difficulty: Unknown
- Topics: Company Tags FlipkartMicrosoftMakeMyTrip, Company Tags, Flipkart, Microsoft, MakeMyTrip, Topic Tags, Recursion, Related Interview Experiences
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
- Synced: 2026-07-21T16:13:28.781Z

## Problem Description

You are given n disks placed on a starting rod (from), with the smallest disk on top and the largest at the bottom. There are three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux). You have to calculate the minimum number of moves required to transfer all n disks from the starting rod to the target rod, following these rules: 1. Only one disk can be moved at a time. 2. A disk can only be placed on top of a larger disk or on an empty rod. Return the minimum number of moves needed to complete the task. Examples: Input: n = 2 Output: 3 Explanation: For n = 2, total 3 steps will be taken. Steps are as follows - move disk 1 from rod 1 to rod 2 move disk 2 from rod 1 to rod 3 move disk 1 from rod 2 to rod 3 Input: n = 3 Output: 7 Explanation: For n = 3, total 7 steps will be taken.Steps are as follows - move disk 1 from rod 1 to rod 3 move disk 2 from rod 1 to rod 2 move disk 1 from rod 3 to rod 2 move disk 3 from rod 1 to rod 3 move disk 1 from rod 2 to rod 1 move disk 2 from rod 2 to rod 3 move disk 1 from rod 1 to rod 3 Input: n = 0 Output: 0 Explanation: Total 0 steps will be taken. Constraints: 0 ≤ n ≤ 20

## Explanation

This solution was accepted on GeeksforGeeks using Text. The detected topics are Company Tags FlipkartMicrosoftMakeMyTrip, Company Tags, Flipkart, Microsoft, MakeMyTrip, Topic Tags, Recursion, Related Interview Experiences. Review the synced source file for the implementation details.
