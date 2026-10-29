class Solution {
    public static int sumSubstrings(String s) {
        int n = s.length();

        long[] dp = new long[n];
        dp[0] = s.charAt(0) - '0';

        long ans = dp[0];

        for (int i = 1; i < n; i++) {
            int digit = s.charAt(i) - '0';

            dp[i] = (long) (i + 1) * digit + 10L * dp[i - 1];
            ans += dp[i];
        }

        return (int) ans;
    }
}