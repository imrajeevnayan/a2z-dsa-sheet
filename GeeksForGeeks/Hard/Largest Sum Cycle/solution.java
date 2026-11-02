class Solution {
    public int largestSumCycle(int[] edge) {
        int n = edge.length;
        boolean[] visited = new boolean[n];
        long maxSum = -1;

        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            HashMap<Integer, Integer> pos = new HashMap<>();
            int curr = i;
            int step = 0;

            while (curr != -1 && !visited[curr]) {
                visited[curr] = true;
                pos.put(curr, step++);
                curr = edge[curr];
            }

            // cycle found inside current traversal
            if (curr != -1 && pos.containsKey(curr)) {
                long sum = 0;

                int start = curr;
                sum += start;

                int node = edge[start];
                while (node != start) {
                    sum += node;
                    node = edge[node];
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        return (int) maxSum;
    }
}