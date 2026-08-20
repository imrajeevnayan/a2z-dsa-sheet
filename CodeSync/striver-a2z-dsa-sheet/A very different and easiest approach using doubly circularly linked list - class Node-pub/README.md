# A very different and easiest approach using doubly circularly linked list :- class Node{public: int data; Node* next; Node* prev; Node(int s){ data = s; next = NULL; prev = NULL; }};class Solution {public: int josephus(int n, int k) { if(k == 1){ return n; } Node* temp = NULL; Node* curr = NULL; for(int i = 1;i<=n;i++){ if(i == 1){ temp = new Node(i); curr = temp; } else{ Node* newNode = new Node(i); temp->next = newNode; newNode->prev = temp; temp = newNode; } } temp->next = curr; curr->prev = temp; int cnt = 1; while(curr != NULL){ curr = curr->next; cnt++; if(cnt == k){ Node* some = curr->prev; Node* kuch = curr->next; if(some == kuch){ return some->data; } some->next = kuch; kuch->prev = some; curr->next = NULL; curr->prev = NULL; Node* kis = curr; delete kis; curr = kuch; cnt = 1; } } }};

- Platform: GeeksforGeeks
- Language: class Solution { public: int josephus(int n, int k) { // code here vector<int>arr(n+1,0); for(int i=1;i<=n;i++) arr[i]=1; int kills=0,i=1,st=1; while(kills<n-1){ if(arr[i] == 0) { i++; if(i>n) i = 1; continue; } if(st==k){ arr[i]=0; kills++; st=1; } else{ st++; } i++; if(i>n) i = 1; } for(int i=1;i<=n;i++){ if(arr[i]==1) return i; } return -1; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftWalmart, Company Tags, Amazon, Microsoft, Walmart, Topic Tags, Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/josephus-problem/1
- Synced: 2026-08-20T13:40:26.008Z

## Problem Description

You are playing a game with n people standing in a circle, numbered from 1 to n. Starting from person 1, every kth person is eliminated in a circular fashion. The process continues until only one person remains. Given integers n and k, return the position (1-based index) of the person who will survive. Examples : Input: n = 5, k = 2 Output: 3 Explanation: Firstly, the person at position 2 is killed, then the person at position 4 is killed, then the person at position 1 is killed. Finally, the person at position 5 is killed. So the person at position 3 survives. Input: n = 7, k = 3 Output: 4 Explanation: The elimination order is 3 → 6 → 2 → 7 → 5 → 1, and the person at position 4 survives.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int josephus(int n, int k) { // code here vector<int>arr(n+1,0); for(int i=1;i<=n;i++) arr[i]=1; int kills=0,i=1,st=1; while(kills<n-1){ if(arr[i] == 0) { i++; if(i>n) i = 1; continue; } if(st==k){ arr[i]=0; kills++; st=1; } else{ st++; } i++; if(i>n) i = 1; } for(int i=1;i<=n;i++){ if(arr[i]==1) return i; } return -1; } };. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftWalmart, Company Tags, Amazon, Microsoft, Walmart, Topic Tags, Recursion. Review the synced source file for the implementation details.
