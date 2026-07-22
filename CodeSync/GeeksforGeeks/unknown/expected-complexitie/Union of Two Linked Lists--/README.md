# Union of Two Linked Lists✅✅

- Platform: GeeksforGeeks
- Language: function merge(List a, List b) { if( list a is null ) return list b if(list b is null ) return list a List ans = null if(a.data<b.data) // add a node to answer { ans=a ans.next=merge(a.next,b) } else if(b.data<a.data) // add b node to answer { ans=b ans.next=merge(a,b.next) } else //This is important to handle duplicate elements { ans=b // you can write a or b(any) ans.next=merge(a.next,b.next) //move both pointers. } return ans }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, 24*7 Innovation Labs, Komli Media, Taxi4Sure
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/union-of-two-linked-list/1
- Synced: 2026-07-22T17:53:46.276Z

## Problem Description

Given two singly linked lists, create a new linked list that contains the union of elements present in both lists. Each element should appear only once in the resulting list (no duplicates allowed). The order of elements in the resulting list should be: First, include elements from the first list in the order they appear. Then include elements from the second list that were not already included, in their original order. Examples: Input: head1 = 9->6->4->2->3->8, head2 = 1->2->8->6->2 Output: 9 -> 6 -> 4 -> 3 -> 8 -> 1 -> 2 Explanation: All the distinct numbers from two lists. Input: head1 = 1->5->1->2->2->5, head2 = 4->5->6->7->1 Output: 1 -> 5 -> 2 -> 4 -> 6 -> 7 Explaination: All the distinct numbers from two lists. Constraints: 1 ≤ size of both linked lists ≤ 105 1 ≤ data of nodes ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using function merge(List a, List b) { if( list a is null ) return list b if(list b is null ) return list a List ans = null if(a.data<b.data) // add a node to answer { ans=a ans.next=merge(a.next,b) } else if(b.data<a.data) // add b node to answer { ans=b ans.next=merge(a,b.next) } else //This is important to handle duplicate elements { ans=b // you can write a or b(any) ans.next=merge(a.next,b.next) //move both pointers. } return ans }. The detected topics are Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, 24*7 Innovation Labs, Komli Media, Taxi4Sure. Review the synced source file for the implementation details.
