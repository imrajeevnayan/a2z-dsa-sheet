class Solution {

    static class DualHeap {
        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        long sumLeft = 0;
        long sumRight = 0;

        int sizeLeft = 0;
        int sizeRight = 0;

        private void addMap(TreeMap<Integer, Integer> map, int x) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        private void removeMap(TreeMap<Integer, Integer> map, int x) {
            int cnt = map.get(x);
            if (cnt == 1) {
                map.remove(x);
            } else {
                map.put(x, cnt - 1);
            }
        }

        public void add(int x) {
            if (sizeLeft == 0 || x <= left.lastKey()) {
                addMap(left, x);
                sizeLeft++;
                sumLeft += x;
            } else {
                addMap(right, x);
                sizeRight++;
                sumRight += x;
            }
            rebalance();
        }

        public void remove(int x) {
            if (left.containsKey(x)) {
                removeMap(left, x);
                sizeLeft--;
                sumLeft -= x;
            } else {
                removeMap(right, x);
                sizeRight--;
                sumRight -= x;
            }
            rebalance();
        }

        private void rebalance() {
            while (sizeLeft > sizeRight + 1) {
                int v = left.lastKey();

                removeMap(left, v);
                sizeLeft--;
                sumLeft -= v;

                addMap(right, v);
                sizeRight++;
                sumRight += v;
            }

            while (sizeLeft < sizeRight) {
                int v = right.firstKey();

                removeMap(right, v);
                sizeRight--;
                sumRight -= v;

                addMap(left, v);
                sizeLeft++;
                sumLeft += v;
            }
        }

        public long cost() {
            int median = left.lastKey();

            long leftCost = (long) median * sizeLeft - sumLeft;
            long rightCost = sumRight - (long) median * sizeRight;

            return leftCost + rightCost;
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        int m = n - x + 1;

        long[] windowCost = new long[m];

        DualHeap dh = new DualHeap();

        for (int i = 0; i < x; i++) {
            dh.add(nums[i]);
        }
        windowCost[0] = dh.cost();

        for (int i = x; i < n; i++) {
            dh.add(nums[i]);
            dh.remove(nums[i - x]);
            windowCost[i - x + 1] = dh.cost();
        }

        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[k + 1][m + x + 5];

        for (int t = 1; t <= k; t++) {
            Arrays.fill(dp[t], INF);
        }

        for (int i = m - 1; i >= 0; i--) {
            dp[0][i] = 0;
        }

        for (int t = 1; t <= k; t++) {
            for (int i = m - 1; i >= 0; i--) {

                long skip = dp[t][i + 1];

                long take = windowCost[i];
                int next = i + x;

                if (dp[t - 1][next] != INF) {
                    take += dp[t - 1][next];
                } else {
                    take = INF;
                }

                dp[t][i] = Math.min(skip, take);
            }
        }

        return dp[k][0];
    }
}