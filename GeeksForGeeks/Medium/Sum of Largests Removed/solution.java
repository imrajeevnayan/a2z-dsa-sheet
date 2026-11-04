class Solution {
    public int maximizeSum(int[] arr) {
        int MAX = 20000;

        int[] freq = new int[MAX + 1];

        for (int x : arr) {
            freq[x]++;
        }

        for (int i = MAX; i >= 2; i--) {
            int matched = Math.min(freq[i], freq[i - 1]);
            freq[i - 1] -= matched;
        }

        long ans = 0;

        for (int i = 1; i <= MAX; i++) {
            ans += (long) i * freq[i];
        }

        return (int) ans;
    }
}