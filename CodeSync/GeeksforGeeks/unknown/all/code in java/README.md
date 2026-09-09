# code in java

- Platform: GeeksforGeeks
- Language: class Solution { public int countEdges(ArrayList<ArrayList<Integer>> adj) { int v=adj.size(); int sum=0; for(int i=0;i<v;i++) { sum=sum+adj.get(i).size(); } return sum/2; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Graph, Related Articles, Count Number Edges Undirected Graph
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-number-of-edges-in-an-undirected-graph/1
- Synced: 2026-09-08T13:30:40.991Z

## Problem Description

Given an undirected graph containing V vertices from 0 to V-1, represented by a 2D adjacency list adj[][], where each adj[i] represents the list of vertices connected to vertex i. Your task is to count the total number of edges present in the graph. Examples : Input: adj[][] = [[1, 2], [0, 2], [0, 1, 3], [2]] Output: 4 Explanation: The edges in the graph are: (0-1), (0-2), (2-3), (1-2). Hence, total number of edges = 4. Input: adj[][] = [[1], [0, 2], [1, 3], [2]] Output: 3 Explanation: The edges in the graph are: (0-1), (1-2), (2-3). Hence, total number of edges = 3. Constraints: 1 ≤ V = adj.size() ≤ 104 0 ≤ adj[i][j] < V

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int countEdges(ArrayList<ArrayList<Integer>> adj) { int v=adj.size(); int sum=0; for(int i=0;i<v;i++) { sum=sum+adj.get(i).size(); } return sum/2; } }. The detected topics are Expected Complexities, Topic Tags, Graph, Related Articles, Count Number Edges Undirected Graph. Review the synced source file for the implementation details.
