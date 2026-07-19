# JAVA CODE :-

- Platform: GeeksforGeeks
- Language: static boolean isAnagram(char[] a,char[] b) { Arrays.sort(a); Arrays.sort(b); if(String.valueOf(a).equals(String.valueOf(b))) return true; return false; } static Node append(char[]arr) { Node head = null; for(int i=0;i<arr.length;i++) { Node node = new Node(arr[i]); if(head==null) head=node; else { Node temp = head; while(temp.next!=null) temp=temp.next; temp.next=node; } } return head; } public static ArrayList<Node> findAnagrams(Node head, String s) { ArrayList<Node>al=new ArrayList<>(); Node fast=head; int n = s.length(); int i = 1; StringBuffer sb = new StringBuffer(); sb.append(fast.data); while(fast!=null && i<s.length()){ fast=fast.next; sb.append(fast.data); i++; } int prevAdd = 0; while(fast!=null) { if(i>prevAdd+n-1 && isAnagram(String.valueOf(sb).toCharArray(),s.toCharArray())){ prevAdd = i; al.add(append(String.valueOf(sb).toCharArray())); } i++; sb.delete(0,1); fast=fast.next; if(fast==null) break; sb.append(fast.data); } return al; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, sliding-window, Related Articles, Find Anagrams In Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-anagrams-in-linked-list--170647/1
- Synced: 2026-07-19T05:32:22.504Z

## Problem Description

Given the head of a character linked list and a string str, return all non-overlapping anagrams of str present in the linked list. If multiple anagrams overlap, choose the leftmost one. Return an empty array if no anagram exists. Examples: Input: head: a -> b -> c -> a -> d -> b -> c -> a, str = bac Output: [a -> b -> c, b -> c -> a] Explanation: In the given linked list, there are three anagrams: But in 1 and 2, a -> b -> c and b -> c-> a are ovelapping. So we take a -> b -> c as it comes first from left.So the output is: [a -> b -> c, b -> c -> a] Input: Linked list: a -> b -> d -> c -> a, str = bac Output: -1 Explanation: There is no anagrams, so the output is -1 Constraints: 1 ≤ size of linked list ≤ 106 'a' ≤ node->data ≤ 'z'

## Explanation

This solution was accepted on GeeksforGeeks using static boolean isAnagram(char[] a,char[] b) { Arrays.sort(a); Arrays.sort(b); if(String.valueOf(a).equals(String.valueOf(b))) return true; return false; } static Node append(char[]arr) { Node head = null; for(int i=0;i<arr.length;i++) { Node node = new Node(arr[i]); if(head==null) head=node; else { Node temp = head; while(temp.next!=null) temp=temp.next; temp.next=node; } } return head; } public static ArrayList<Node> findAnagrams(Node head, String s) { ArrayList<Node>al=new ArrayList<>(); Node fast=head; int n = s.length(); int i = 1; StringBuffer sb = new StringBuffer(); sb.append(fast.data); while(fast!=null && i<s.length()){ fast=fast.next; sb.append(fast.data); i++; } int prevAdd = 0; while(fast!=null) { if(i>prevAdd+n-1 && isAnagram(String.valueOf(sb).toCharArray(),s.toCharArray())){ prevAdd = i; al.add(append(String.valueOf(sb).toCharArray())); } i++; sb.delete(0,1); fast=fast.next; if(fast==null) break; sb.append(fast.data); } return al; }. The detected topics are Expected Complexities, Topic Tags, Linked List, sliding-window, Related Articles, Find Anagrams In Linked List. Review the synced source file for the implementation details.
