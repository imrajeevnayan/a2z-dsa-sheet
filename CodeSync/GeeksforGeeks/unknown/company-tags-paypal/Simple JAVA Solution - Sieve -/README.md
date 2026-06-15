# Simple JAVA Solution ( Sieve )

- Platform: GeeksforGeeks
- Language: public int unvisitedLeaves(int N, int leaves, int frogs[]) { // Code here // Create a BitSet with a size of `leaves+1` BitSet visited = new BitSet(leaves + 1); // Loop through the frogs array for (int frog : frogs) { // If the frog is within the range of leaves and has not been visited yet if (frog <= leaves && !visited.get(frog)) { // Loop through every multiple of the frog and mark it as visited for (int j = frog; j <= leaves; j += frog) { visited.set(j); } } } // Count the number of unvisited leaves int unvisited = leaves- visited.cardinality(); // Return the number of unvisited leaves return unvisited; }
- Difficulty: Unknown
- Topics: Company Tags PayPal, Company Tags, PayPal, Topic Tags, Arrays, sieve, Data Structures, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/frogs-and-jumps--170647/1
- Synced: 2026-06-15T11:52:31.481Z

## Problem Description

N frogs are positioned at one end of the pond. All frogs want to reach the other end of the pond as soon as possible. The pond has some leaves arranged in a straight line. Each frog has the strength to jump exactly K leaves. For example, a frog having strength 2 will visit the leaves 2, 4, 6, ... etc. while crossing the pond. Given the strength of each frog and the number of leaves, your task is to find the number of leaves that not be visited by any of the frogs when all frogs have reached the other end of the pond. Example 1: Input: N = 3 leaves = 4 frogs[] = {3, 2, 4} Output: 1 Explanation: Leaf 1 will not be visited by any frog. Example 2: Input: N = 3 leaves = 6 frogs[] = {1, 3, 5} Output: 0 Explanation: First frog will visit all the leaves so no leaf is left unvisited. Your Task: Complete the function unvisitedLeaves() which takes the integers N, leaves and the array frogs as the input parameters, and returns the number of unvisited leaves. Expected Time Complexity: O(N*log(leaves)) Expected Auxiliary Space: O(leaves) Constraints: 1 ≤ N, leaves, frogs[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using public int unvisitedLeaves(int N, int leaves, int frogs[]) { // Code here // Create a BitSet with a size of `leaves+1` BitSet visited = new BitSet(leaves + 1); // Loop through the frogs array for (int frog : frogs) { // If the frog is within the range of leaves and has not been visited yet if (frog <= leaves && !visited.get(frog)) { // Loop through every multiple of the frog and mark it as visited for (int j = frog; j <= leaves; j += frog) { visited.set(j); } } } // Count the number of unvisited leaves int unvisited = leaves- visited.cardinality(); // Return the number of unvisited leaves return unvisited; }. The detected topics are Company Tags PayPal, Company Tags, PayPal, Topic Tags, Arrays, sieve, Data Structures, Algorithms. Review the synced source file for the implementation details.
