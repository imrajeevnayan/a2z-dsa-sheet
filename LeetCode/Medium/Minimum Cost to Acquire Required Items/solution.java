class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        long[] candidates = {
            0,
            Math.min(need1, need2),
            Math.max(need1, need2)
        };

        long ans = Long.MAX_VALUE;

        for (long x : candidates) {
            long cost =
                    x * costBoth
                    + (long)Math.max(0L, need1 - x) * cost1
                    + (long)Math.max(0L, need2 - x) * cost2;

            ans = Math.min(ans, cost);
        }

        return ans;
    }
}