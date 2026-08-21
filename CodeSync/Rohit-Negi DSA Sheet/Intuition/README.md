# Intuition

- Platform: GeeksforGeeks
- Language: nextSmallerEle(arr) { // code here let stk=[] let ans=[]; let lastIndex=arr.length-1; for(let k=arr.length-1;k>=0;k--){ while(stk.length>0 && stk[stk.length-1]>=arr[k]){ stk.pop() } if(stk.length>0){ ans[lastIndex--]=stk[stk.length-1] } stk.push(arr[k]) } return ans }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FlipkartAmazon, Company Tags, Flipkart, Amazon, Topic Tags, Arrays, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
- Synced: 2026-08-21T08:15:22.393Z

## Problem Description

You are given an integer array arr[ ]. For every element in the array, your task is to determine its Next Smaller Element (NSE). The Next Smaller Element (NSE) of an element x is the first element that appears to the right of x in the array and is strictly smaller than x. If no such element exists, assign -1 as the NSE for that position. Examples: Input: arr[] = [4, 8, 5, 2, 25] Output: [2, 5, 2, -1, -1] Explanation: The first element smaller than 4 having index > 0 is 2. The first element smaller than 8 having index > 1 is 5. The first element smaller than 5 having index > 2 is 2. There are no elements smaller than 4 having index > 3. There are no elements smaller than 4 having index > 4. Input: arr[] = [13, 7, 6, 12] Output: [7, 6, -1, -1] Explanation: The first element smaller than 13 having index > 0 is 7. The first element smaller than 7 having index > 1 is 6. There are no elements smaller than 6 having index > 2. There are no elements smaller than 12 having index > 3. Input: arr[] = [4, 1] Output: [1, -1] Explanation: 4 will be updated to 1 and 1 will be updated to -1. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using nextSmallerEle(arr) { // code here let stk=[] let ans=[]; let lastIndex=arr.length-1; for(let k=arr.length-1;k>=0;k--){ while(stk.length>0 && stk[stk.length-1]>=arr[k]){ stk.pop() } if(stk.length>0){ ans[lastIndex--]=stk[stk.length-1] } stk.push(arr[k]) } return ans }. The detected topics are Expected Complexities, Company Tags FlipkartAmazon, Company Tags, Flipkart, Amazon, Topic Tags, Arrays, Stack. Review the synced source file for the implementation details.
