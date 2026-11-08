class Solution {
    int getCount(String s, int k) {
        int[] groups = new int[26];

        // Count groups
        groups[s.charAt(0) - 'a']++;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                groups[s.charAt(i) - 'a']++;
            }
        }

        int ans = 0;

        for (int cnt : groups) {
            if (cnt == k) {
                ans++;
            }
        }

        return ans;
    }
}