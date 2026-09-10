/*
 * Platform: LeetCode
 * Problem: -
 * URL: https://leetcode.com/submissions/detail/2136315728/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 19 ms
 * Memory: 47.28 MB
 * Synced: 2026-09-09T12:45:02.587Z
 */

1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3        int n = edges.length;
4        List<List<Integer>> graph = new ArrayList<>();
5
6        for (int i = 0; i <= n; i++) {
7            graph.add(new ArrayList<>());
8        }
9        for (int[] edge : edges) {
10
11            int u = edge[0];
12            int v = edge[1];
13
14            // Check whether u and v are already connected
15            if (hasPath(graph, u, v, n)) return edge;
16            
17            // No cycle, so add this edge
18            graph.get(u).add(v);
19            graph.get(v).add(u);
20        }
21
22        return new int[0];
23    }
24
25    private boolean hasPath(
26        List<List<Integer>> graph,
27        int source,
28        int destination,
29        int n
30    ) {
31
32        boolean[] visited = new boolean[n + 1];
33
34        Queue<Integer> queue = new ArrayDeque<>();
35
36        queue.offer(source);
37        visited[source] = true;
38
39        while (!queue.isEmpty()) {
40
41            int node = queue.poll();
42
43            if (node == destination) {
44                return true;
45            }
46
47            for (int neighbor : graph.get(node)) {
48
49                if (!visited[neighbor]) {
50
51                    visited[neighbor] = true;
52                    queue.offer(neighbor);
53                }
54            }
55        }
56
57        return false;
58    }
59}
60
