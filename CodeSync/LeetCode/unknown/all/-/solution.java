/*
 * Platform: LeetCode
 * Problem: -
 * URL: https://leetcode.com/submissions/detail/2136826351/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 10 ms
 * Memory: 48.53 MB
 * Synced: 2026-09-13T03:37:24.724Z
 */

1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        List<List<Integer>> result = new ArrayList<>();
4        Queue<List<Integer>> q = new LinkedList<>();
5
6        List<Integer> startPath = new ArrayList<>();
7        startPath.add(0);
8        q.offer(startPath);
9
10        int target = graph.length - 1;
11
12        while (!q.isEmpty()) {
13            List<Integer> path = q.poll();
14
15            int node = path.get(path.size() - 1);
16
17            // Target reached
18            if (node == target) {
19                result.add(path);
20                continue;
21            }
22
23            // Add all neighbours
24            for (int next : graph[node]) {
25                List<Integer> newPath = new ArrayList<>(path);
26                newPath.add(next);
27
28                q.offer(newPath);
29            }
30        }
31
32        return result;
33    }
34}
35
