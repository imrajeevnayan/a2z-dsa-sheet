class Solution {
    public int getCandidate(int n, int k) {

        int ans = 1;

        while ((long) ans * k <= n) {
            ans *= k;
        }

        return ans;
    }
}