# Make All Zero

- Platform: GeeksforGeeks
- Language: class Solution { public boolean makeZero(int arr[]) { // Code here int x=0; int l=arr.length; for(int i=0;i<l;i++){ x=x^arr[i]; } if(x==0){ return false; }else if(l%2==1){ return true; }else{ return false; } } }
- Difficulty: Unknown
- Topics: Expected Complexities
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/make-all-zero--150104/1
- Synced: 2026-07-07T15:28:41.272Z

## Problem Description

Two players are playing a game involving energy stacks. Each stack contains a certain number of energy crystals represented as integers in an array arr[]. Players take turns. On each turn, a player must remove one entire stack (i.e., remove one element from the array). However, there's a special rule: If the bitwise XOR of the entire array is 0 before a player's turn, then that player instantly wins. If it's not zero, they must remove one stack. The game continues until someone wins either due to the XOR rule or because the other player cannot move. Both players play optimally. You need to determine who will win for each initial array of stacks. Return true if Player second wins. Examples: Input: arr[] = [1, 2, 3] Output: false Explanation: Since XOR of the entire array is 0 before player 1's turn, player 1 wins. Input: arr[] = [1, 2, 4] Output: true Explanation: Player1 removes 1 from arr[] on his turn, then player2 removes 2 from arr[], then player1 removes 4 which makes Bitwise XOR of arr[] as 0. Hence player2 wins. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public boolean makeZero(int arr[]) { // Code here int x=0; int l=arr.length; for(int i=0;i<l;i++){ x=x^arr[i]; } if(x==0){ return false; }else if(l%2==1){ return true; }else{ return false; } } }. The detected topics are Expected Complexities. Review the synced source file for the implementation details.
