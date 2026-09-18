# Container With Most Water

- Platform: GeeksforGeeks
- Language: long long maxArea(long long A[], int len) { int lef=0; int rite=len-1; long long final=0; long long watt=0; while(lef<=rite){ watt=min(A[lef],A[rite])*(rite-lef); cout<<watt; final=max(final,watt); cout<<final; A[lef]<A[rite]?lef++:rite--; } return final; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FlipkartAmazonGoogle, Company Tags, Flipkart, Amazon, Google, Topic Tags, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/container-with-most-water0535/1
- Synced: 2026-09-17T18:26:35.160Z

## Problem Description

Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis. Note: In the case of a single vertical line it will not be able to hold water. Examples: Input: arr[] = [1, 5, 4, 3] Output: 6 Explanation: 5 and 3 are 2 distance apart. So the size of the base is 2. Height of container = min(5, 3) = 3. So, total area to hold water = 3 * 2 = 6. Input: arr[] = [3, 1, 2, 4, 5] Output: 12 Explanation: 5 and 3 are 4 distance apart. So the size of the base is 4. Height of container = min(5, 3) = 3. So, total area to hold water = 4 * 3 = 12. Input: arr[] = [2, 1, 8, 6, 4, 6, 5, 5] Output: 25 Explanation: 8 and 5 are 5 distance apart. So the size of the base is 5. Height of container = min(8, 5) = 5. So, the total area to hold water = 5 * 5 = 25. Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using long long maxArea(long long A[], int len) { int lef=0; int rite=len-1; long long final=0; long long watt=0; while(lef<=rite){ watt=min(A[lef],A[rite])*(rite-lef); cout<<watt; final=max(final,watt); cout<<final; A[lef]<A[rite]?lef++:rite--; } return final; }. The detected topics are Expected Complexities, Company Tags FlipkartAmazonGoogle, Company Tags, Flipkart, Amazon, Google, Topic Tags, Arrays. Review the synced source file for the implementation details.
