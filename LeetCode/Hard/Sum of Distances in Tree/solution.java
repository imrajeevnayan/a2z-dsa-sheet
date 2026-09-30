class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] count = new int[n];
        int[] ans = new int[n];

        // First DFS
        dfs1(0, -1, graph, count, ans);

        // Second DFS
        dfs2(0, -1, graph, count, ans, n);

        return ans;
    }

    private void dfs1(int node, int parent,List<Integer>[] graph,int[] count,int[] ans) {

        count[node] = 1;

        for (int child : graph[node]) {
            if (child == parent) {
                continue;
            }
            dfs1(child, node, graph, count, ans);

            count[node] += count[child];

            ans[node] += ans[child] + count[child];
        }
    }
    private void dfs2(int node, int parent,List<Integer>[] graph, int[] count, int[] ans,int n) {

        for (int child : graph[node]) {

            if (child == parent) {
                continue;
            }
            ans[child] = ans[node] + n - 2 * count[child];

            dfs2(child, node, graph, count, ans, n);
        }
    }
}
