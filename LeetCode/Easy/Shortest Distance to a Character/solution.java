class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int prev = -n;

        // Left to Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        prev = 2 * n;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}