class Solution {
    public int minDiff(int k, int[] arr) {
        int n = arr.length;

        int[] prefixMin = new int[n];
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        int[] suffixMax = new int[n];

        prefixMin[0] = prefixMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        suffixMin[n - 1] = suffixMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int start = 0; start <= n - k; start++) {
            int end = start + k - 1;

            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;

            // Left part
            if (start > 0) {
                mn = Math.min(mn, prefixMin[start - 1]);
                mx = Math.max(mx, prefixMax[start - 1]);
            }

            // Right part
            if (end < n - 1) {
                mn = Math.min(mn, suffixMin[end + 1]);
                mx = Math.max(mx, suffixMax[end + 1]);
            }

            ans = Math.min(ans, mx - mn);
        }

        return ans;
    }
}