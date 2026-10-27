class Solution {
    public int solve(int[] arr) {

        int MOD = 1000000007;
        int MAX = 1000;

        long[] freq = new long[MAX + 1];

        for (int x : arr) {
            freq[x]++;
        }

        long ans = 0;

        for (int x = 1; x <= MAX; x++) {
            if (freq[x] == 0) continue;

            long greater = 0;

            for (int y = x + 1; y <= MAX; y++) {
                greater += freq[y];
            }

            ans = (ans + freq[x] * greater) % MOD;
        }

        return (int) ans;
    }
}