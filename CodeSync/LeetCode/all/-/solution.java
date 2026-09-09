/*
 * Platform: LeetCode
 * Problem: -
 * URL: https://leetcode.com/submissions/detail/2135459652/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 1 ms
 * Memory: 47.27 MB
 * Synced: 2026-09-09T06:45:25.457Z
 */

1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int provinces = 0;
6        for (int i = 0; i < n; i++) {
7
8            if (!visited[i]) {
9                provinces++;
10                bfs(i, isConnected, visited);
11            }
12        }
13        return provinces;
14    }
15    private void bfs(int start, int[][] isConnected, boolean[] visited) {
16        Queue<Integer> queue = new LinkedList<>();
17        queue.add(start);
18        visited[start] = true;
19        while (!queue.isEmpty()) {
20            int city = queue.poll();
21            // Current city ke saare possible connections check karo
22            for (int j = 0; j < isConnected.length; j++) {
23
24                if (isConnected[city][j] == 1 && !visited[j]) {
25                    visited[j] = true;
26                    queue.add(j);
27                }
28            }
29        }
30    }
31}
32
