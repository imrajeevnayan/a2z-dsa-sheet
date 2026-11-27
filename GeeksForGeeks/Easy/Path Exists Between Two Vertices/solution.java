class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        int n = adj.size();
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.offer(u);
        visited[u] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            if (node == v) {
                return true;
            }

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }

        return false;
    }
}