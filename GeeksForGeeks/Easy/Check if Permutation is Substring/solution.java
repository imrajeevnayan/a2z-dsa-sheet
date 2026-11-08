class Solution {
    boolean search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        if (m > n) return false;

        int[] p = new int[26];
        int[] w = new int[26];

        // Pattern frequency
        for (int i = 0; i < m; i++) {
            p[pat.charAt(i) - 'a']++;
            w[txt.charAt(i) - 'a']++;
        }

        if (isEqual(p, w)) return true;

        // Sliding window
        for (int i = m; i < n; i++) {
            w[txt.charAt(i) - 'a']++;
            w[txt.charAt(i - m) - 'a']--;

            if (isEqual(p, w)) return true;
        }

        return false;
    }

    private boolean isEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}