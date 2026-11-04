class Solution {
    public int findClosest(int[] a, int[] b, int[] c) {

        int i = 0, j = 0, k = 0;
        int ans = Integer.MAX_VALUE;

        while (i < a.length && j < b.length && k < c.length) {

            int mn = Math.min(a[i], Math.min(b[j], c[k]));
            int mx = Math.max(a[i], Math.max(b[j], c[k]));

            ans = Math.min(ans, mx - mn);

            if (mn == a[i]) {
                i++;
            } else if (mn == b[j]) {
                j++;
            } else {
                k++;
            }
        }

        return ans;
    }
}