class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums.get(i - 1);
        }
        int ans = Integer.MAX_VALUE;
        for (int len = l; len <= r; len++) {
            for (int i = 1; i + len - 1 <= n; i++) {
                int sum = prefix[i + len - 1] - prefix[i - 1];

                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}