# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 12/75)

- Platform: GeeksforGeeks
- Language: from typing import List class Solution: def printGraph(self, num_vertices: int, edge_list: List[List[int]]) -> List[List[int]]: # Step 1: Initialize an empty adjacency list with num_vertices lists. adjacency_list = [[] for _ in range(num_vertices)] # Step 2: Iterate through the edge_list and add edges to the adjacency list. for src, dest in edge_list: adjacency_list[src].append(dest) adjacency_list[dest].append(src) # For an undirected graph, we add both ways. # Step 3: Return the adjacency list. return adjacency_list
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Graph, Related Articles, Print Adjacency List For A Directed Graph
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1
- Synced: 2026-09-08T13:05:30.962Z

## Problem Description

Given an undirected graph with V nodes and E edges, create and return an adjacency list of the graph. 0-based indexing is followed everywhere. Example 1: Input: V = 5, E = 7 edges = [[0,1], [0,4], [4,1], [4,3], [1,3], [1,2], [3,2]] Output: [[1,4], [0,2,3,4], [1,3], [1,2,4], [0,1,3]] Explanation: Node 0 is connected to 1 and 4. Node 1 is connected to 0,2,3 and 4. Node 2 is connected to 1 and 3. Node 3 is connected to 1,2 and 4. Node 4 is connected to 0,1 and 3. Example 2: Input: V = 4, E = 3 edges = [[0,3], [0,2], [2,1]] Output: [[2,3], [2], [0,1], [0]] Explanation: Node 0 is connected to 2 and 3. Node 1 is only connected to 2. Node 2 is connected to 0 and 1. Node 3 is only connected to 0. Constraints: 1 ≤ V, E ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using from typing import List class Solution: def printGraph(self, num_vertices: int, edge_list: List[List[int]]) -> List[List[int]]: # Step 1: Initialize an empty adjacency list with num_vertices lists. adjacency_list = [[] for _ in range(num_vertices)] # Step 2: Iterate through the edge_list and add edges to the adjacency list. for src, dest in edge_list: adjacency_list[src].append(dest) adjacency_list[dest].append(src) # For an undirected graph, we add both ways. # Step 3: Return the adjacency list. return adjacency_list. The detected topics are Expected Complexities, Topic Tags, Graph, Related Articles, Print Adjacency List For A Directed Graph. Review the synced source file for the implementation details.
