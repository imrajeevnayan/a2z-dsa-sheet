class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) ->
            (a[1] - a[0]) - (b[1] - b[0])
        );

        int n = costs.length / 2;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += costs[i][1];      // send first n to B
        }

        for (int i = n; i < costs.length; i++) {
            total += costs[i][0];      // send remaining to A
        }

        return total;
    }
}