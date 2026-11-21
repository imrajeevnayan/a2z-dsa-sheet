class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int ans = -1;

        for (int len = 1; len <= n; len++) {
            int[] freq = new int[26];

            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                }

                int groupLen = j - i;

                if (groupLen >= len) {
                    freq[s.charAt(i) - 'a'] += groupLen - len + 1;
                }

                i = j;
            }

            for (int count : freq) {
                if (count >= 3) {
                    ans = len;
                    break;
                }
            }
        }

        return ans;
    }
}