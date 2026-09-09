/*
 * Platform: LeetCode
 * Problem: 0
 * URL: https://leetcode.com/submissions/detail/2135070047/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 80 ms
 * Memory: 285.95 MB
 * Synced: 2026-09-08T17:31:22.053Z
 */

1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        List<List<Integer>>graph=new ArrayList<>();
4        for(int i=0;i<n;i++)graph.add(new ArrayList<>());
5        for(int []edge:edges){
6            int u=edge[0];
7            int v=edge[1];
8            graph.get(u).add(v);
9            graph.get(v).add(u);
10        }
11        boolean visited[]=new boolean[n];
12        Stack<Integer>st=new Stack<>();
13        st.add(source);
14        visited[source]=true;
15        while(!st.isEmpty()){
16            int node=st.pop();
17            if(node==destination) return true;
18            for(int next:graph.get(node)){
19                if(!visited[next]){
20                    visited[next]=true;
21                    st.add(next);
22                }
23            }
24        }
25        return false;
26        
27    }
28}
