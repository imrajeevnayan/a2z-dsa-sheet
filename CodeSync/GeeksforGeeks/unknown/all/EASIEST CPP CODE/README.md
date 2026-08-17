# EASIEST CPP CODE

- Platform: GeeksforGeeks
- Language: vector<Node*> alternatingSplitList(struct Node* head) { // Your code here Node* a1=new Node(-1); Node* a2=new Node(-1); Node* tav1=a1; Node* tav2=a2; bool counter=true; while(head) { Node* temp=new Node(head->data); if(counter) tav1->next=temp,tav1=tav1->next; else tav2->next=temp,tav2=tav2->next; counter=!counter; head=head->next; } return {a1->next,a2->next}; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Related Articles, Alternating Split Of A Given Singly Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1
- Synced: 2026-08-17T09:23:40.865Z

## Problem Description

Given the head of a singly linked list, split the list into two sub-linked lists by placing alternating nodes into each list. The first node should go to the first list, the second node to the second list, the third node to the first list, and so on. Preserve the relative order of nodes in both sub-linked lists and return them as an array of two linked lists. Examples: Input: LinkedList = 0->1->0->1->0->1 Output: 0->0->0 , 1->1->1 Explanation: After forming two sublists of the given list as required, we have two lists as: 0->0->0 and 1->1->1. Input: LinkedList = 2->5->8->9->6 Output: 2->8->6 , 5->9 Explanation: After forming two sublists of the given list as required, we have two lists as: 2->8->6 and 5->9.

## Explanation

This solution was accepted on GeeksforGeeks using vector<Node*> alternatingSplitList(struct Node* head) { // Your code here Node* a1=new Node(-1); Node* a2=new Node(-1); Node* tav1=a1; Node* tav2=a2; bool counter=true; while(head) { Node* temp=new Node(head->data); if(counter) tav1->next=temp,tav1=tav1->next; else tav2->next=temp,tav2=tav2->next; counter=!counter; head=head->next; } return {a1->next,a2->next}; }. The detected topics are Expected Complexities, Topic Tags, Linked List, Related Articles, Alternating Split Of A Given Singly Linked List. Review the synced source file for the implementation details.
