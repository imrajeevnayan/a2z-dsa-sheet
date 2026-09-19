# Triplets in Sorted Linked List

- Platform: GeeksforGeeks
- Language: int countTriplets(struct Node* head, int x) { unordered_map<int, bool> mp; Node* curr = head; int count = 0; // Store all elements of the linked list in the hashmap while (curr != NULL) { mp[curr->data] = true; curr = curr->next; } // Iterate through pairs in the list for (Node* first = head; first != NULL; first = first->next) { for (Node* second = first->next; second != NULL; second = second->next) { int num = x - (first->data + second->data); // Check if the third element exists and is positioned after 'second' if (mp.find(num) != mp.end()) { // Ensure num is not part of first and second Node* third = second->next; while (third != NULL) { if (third->data == num) { count++; break; // Found a valid triplet, move to the next pair } third = third->next; } } } } return count; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Mathematics, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-triplets--141631/1
- Synced: 2026-09-19T05:41:13.198Z

## Problem Description

Given a linked list sorted in descending order with distinct nodes, and an integer x, count the number of distinct triplets whose sum is equal to x. Examples: Input: head: 9 -> 8 -> 6 -> 5 -> 4 -> 2 -> 1, x = 17 Output: 2 Explanation: Distinct triplets are (2, 6, 9) and (4, 5, 8) which have sum equal to x i.e 17. Input: head: 9 -> 8 -> 6 -> 5 -> 4 -> 2 -> 1, x = 15 Output: 5 Explanation: (1, 5, 9), (1, 6, 8), (2, 4, 9), (2, 5, 8), (4, 5, 6) are the distinct triplets

## Explanation

This solution was accepted on GeeksforGeeks using int countTriplets(struct Node* head, int x) { unordered_map<int, bool> mp; Node* curr = head; int count = 0; // Store all elements of the linked list in the hashmap while (curr != NULL) { mp[curr->data] = true; curr = curr->next; } // Iterate through pairs in the list for (Node* first = head; first != NULL; first = first->next) { for (Node* second = first->next; second != NULL; second = second->next) { int num = x - (first->data + second->data); // Check if the third element exists and is positioned after 'second' if (mp.find(num) != mp.end()) { // Ensure num is not part of first and second Node* third = second->next; while (third != NULL) { if (third->data == num) { count++; break; // Found a valid triplet, move to the next pair } third = third->next; } } } } return count; }. The detected topics are Expected Complexities, Topic Tags, Linked List, Mathematics, Related Articles. Review the synced source file for the implementation details.
