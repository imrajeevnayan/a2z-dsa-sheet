# Reorder List

- Platform: GeeksforGeeks
- Language: class Solution{ public: void reorderList(Node* head) { // base condition for a list containing 1 or 2 nodes if(head->next==NULL || head->next->next==NULL) return ; Node * slow=head, *fast=head; // Fast and slow pointer to find mid of the list while(fast->next!=NULL && fast->next->next!=NULL){ slow=slow->next; fast=fast->next->next; } // if no of nodes are even then this is required to get the correct node // as mid node if(fast->next!=NULL) { slow=slow->next; fast=fast->next; } // reversing the half linked list if(slow->next!=NULL) fast=slow->next; slow->next=NULL; while(1) { if(fast->next==NULL) { fast->next=slow; break; } else { Node*temp=fast->next; fast->next=slow; slow=fast; fast=temp; } } //Final adjusments in the list. slow=head; // 2 additional pointers for manipulation Node *temp1, *temp2; while(fast->next!=NULL) { temp1=slow->next; slow->next=fast; temp2=fast->next; fast->next=temp1; slow=temp1; fast=temp2; } } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftOYO RoomsIntuit, Company Tags, Amazon, Microsoft, OYO Rooms, Intuit, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reorder-list/1
- Synced: 2026-09-05T18:47:46.630Z

## Problem Description

Given a singly linked list: A0 →A1 →...→An-2 →An-1 , reorder it to A0 →An-1 →A1 →An-2 →A2 →An-3 →... For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3. Note: Try to solve without using any auxiliary space. Examples: Input: LinkedList: 1->2->3 Output: 1->3->2 Explanation: Here n=3, so the correct order is A0 → A2 → A1 Input: LinkedList: 1->7->3->4 Output: 1->4->7->3 Explanation: Here n=4, so the correct order is A0 → A3 → A1 → A2 Constraints: 1 <= no. of nodes <= 106 0 <= node->data <= 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution{ public: void reorderList(Node* head) { // base condition for a list containing 1 or 2 nodes if(head->next==NULL || head->next->next==NULL) return ; Node * slow=head, *fast=head; // Fast and slow pointer to find mid of the list while(fast->next!=NULL && fast->next->next!=NULL){ slow=slow->next; fast=fast->next->next; } // if no of nodes are even then this is required to get the correct node // as mid node if(fast->next!=NULL) { slow=slow->next; fast=fast->next; } // reversing the half linked list if(slow->next!=NULL) fast=slow->next; slow->next=NULL; while(1) { if(fast->next==NULL) { fast->next=slow; break; } else { Node*temp=fast->next; fast->next=slow; slow=fast; fast=temp; } } //Final adjusments in the list. slow=head; // 2 additional pointers for manipulation Node *temp1, *temp2; while(fast->next!=NULL) { temp1=slow->next; slow->next=fast; temp2=fast->next; fast->next=temp1; slow=temp1; fast=temp2; } } };. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftOYO RoomsIntuit, Company Tags, Amazon, Microsoft, OYO Rooms, Intuit, Topic Tags. Review the synced source file for the implementation details.
