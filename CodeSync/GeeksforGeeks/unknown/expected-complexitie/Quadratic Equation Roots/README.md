# Quadratic Equation Roots

- Platform: GeeksforGeeks
- Language: vector < int > v; int det = (b * b - 4 * a * c); if (det > 0) { int rootA = floor((-b + sqrt(det)) / (2 * a)); int rootB = floor((-b - sqrt(det)) / (2 * a)); if (rootA > rootB) { v.push_back(rootA); v.push_back(rootB); } else { v.push_back(rootB); v.push_back(rootA); } else if (det == 0) { double rootA = (-b) / (2 * a); double rootB = rootA; v.push_back(rootA); v.push_back(rootB); } else { return { -1 }; } return v;
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Related Articles, Program To Find The Roots Of Quadratic Equation
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/quadratic-equation-roots/1
- Synced: 2026-08-03T15:10:44.186Z

## Problem Description

Given a quadratic equation ax2 + bx + c = 0, find its roots. If the equation has real roots, then return floor value of each root in decreasing order, If the roots are imaginary return -1, the driver code will print Imaginary. Examples: Input: a = 1, b = -2, c = 1 Output: [1, 1] Explanation: Roots of equation x2-2x+1 are 1 and 1. Input: a = 1, b = -7, c = 12 Output: [4, 3] Explanation: Roots of equation x2 - 7x + 12 are 4 and 3. Constraints: -103 ≤ a, b, c ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using vector < int > v; int det = (b * b - 4 * a * c); if (det > 0) { int rootA = floor((-b + sqrt(det)) / (2 * a)); int rootB = floor((-b - sqrt(det)) / (2 * a)); if (rootA > rootB) { v.push_back(rootA); v.push_back(rootB); } else { v.push_back(rootB); v.push_back(rootA); } else if (det == 0) { double rootA = (-b) / (2 * a); double rootB = rootA; v.push_back(rootA); v.push_back(rootB); } else { return { -1 }; } return v;. The detected topics are Expected Complexities, Topic Tags, Mathematical, Related Articles, Program To Find The Roots Of Quadratic Equation. Review the synced source file for the implementation details.
