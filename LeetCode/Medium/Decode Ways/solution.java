class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        int next = 1;      // dp[i+1]
        int nextNext = 0;  // dp[i+2]

        for (int i = n - 1; i >= 0; i--) {

            int curr = 0;

            if (s.charAt(i) != '0') {
                curr = next;

                if (i + 1 < n) {
                    int num = (s.charAt(i) - '0') * 10
                            + (s.charAt(i + 1) - '0');

                    if (num >= 10 && num <= 26) {
                        curr += (i + 2 <= n) ? nextNext : 0;
                    }
                }
            }

            nextNext = next;
            next = curr;
        }

        return next;
    }
}