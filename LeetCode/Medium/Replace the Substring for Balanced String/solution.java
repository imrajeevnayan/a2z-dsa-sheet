class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int target = n / 4;

        int[] count = new int[128];

        for (char ch : s.toCharArray()) {
            count[ch]++;
        }

        if (count['Q'] == target &&
            count['W'] == target &&
            count['E'] == target &&
            count['R'] == target) {
            return 0;
        }

        int left = 0;
        int ans = n;

        for (int right = 0; right < n; right++) {

            count[s.charAt(right)]--;

            while (left < n &&
                   count['Q'] <= target &&
                   count['W'] <= target &&
                   count['E'] <= target &&
                   count['R'] <= target) {

                ans = Math.min(ans, right - left + 1);

                count[s.charAt(left)]++;
                left++;
            }
        }

        return ans;
    }
}