# Print Hollow Rectangle

- Platform: GeeksforGeeks
- Language: #include <stdio.h> int main(){ int n; printf("Enter Height: "); scanf("%d", &n); int m; printf("Enter Width: "); scanf("%d", &m); for(int i = 1; i <= n; i++){ for(int j = 1; j <= m; j++){ ((j == 1 || j == m) || (i == 1 || i == n)) ? printf("*") : printf(" "); } printf("\n"); } return 0; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, pattern-printing, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/hollow-rectangle-or-square/1
- Synced: 2026-07-07T12:09:58.602Z

## Problem Description

Given two integers n and m, print a hollow rectangle pattern consisting of n rows and m columns. Examples: Input: n = 3, m = 5 Output: ***** * * ***** Input: n = 4, m = 3 Output: *** * * * * *** Constraints: 1 ≤ n ≤ 100 1 ≤ m ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using #include <stdio.h> int main(){ int n; printf("Enter Height: "); scanf("%d", &n); int m; printf("Enter Width: "); scanf("%d", &m); for(int i = 1; i <= n; i++){ for(int j = 1; j <= m; j++){ ((j == 1 || j == m) || (i == 1 || i == n)) ? printf("*") : printf(" "); } printf("\n"); } return 0; }. The detected topics are Expected Complexities, Topic Tags, pattern-printing, Algorithms, Related Articles. Review the synced source file for the implementation details.
