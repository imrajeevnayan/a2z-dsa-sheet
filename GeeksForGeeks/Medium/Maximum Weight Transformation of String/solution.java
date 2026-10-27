class Solution {
    public int getMaxWeight(String s) {
        int n = s.length();

        int[] dp = new int[n + 2];

        for (int i = n - 2; i >= 0; i--) {
            int profit = (s.charAt(i) != s.charAt(i + 1)) ? 2 : 1;

            dp[i] = Math.max( dp[i + 1], profit + dp[i + 2] );
        }

        return n + dp[0];
    }
}