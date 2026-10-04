class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int left = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            // Current window contains a, b and c
            while (count[0] > 0 &&
                   count[1] > 0 &&
                   count[2] > 0) {

                count[s.charAt(left) - 'a']--;
                left++;
            }
            // Number of valid substrings ending at right
            ans += left;
        }
        return ans;
    }
}
