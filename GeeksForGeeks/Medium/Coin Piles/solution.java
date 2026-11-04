class Solution {
    public int minimumCoins(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int limit = arr[i] + k;

            // First index having value > limit
            int idx = upperBound(arr, limit);

            long removeLeft = prefix[i];

            long removeRight =
                    (prefix[n] - prefix[idx])
                    - (long)(n - idx) * limit;

            ans = Math.min(ans, removeLeft + removeRight);
        }

        return (int) ans;
    }

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }

        return l;
    }
}
