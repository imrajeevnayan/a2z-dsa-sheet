class Solution {
    public int smallestSubstring(String s) {
        int n = s.length();
        int[] count = new int[3]; // '0', '1', '2' ki frequency track karne ke liye
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            // Current character ko count mein add karo
            count[s.charAt(right) - '0']++;

            // Jab tak window valid hai (teeno characters present hain)
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // Update minimum length
                minLen = Math.min(minLen, right - left + 1);

                // Window shrink karo (left pointer badhao)
                count[s.charAt(left) - '0']--;
                left++;
            }
        }

        // Agar minLen update nahi hua, toh -1 return karo
        return (minLen == Integer.MAX_VALUE) ? -1 : minLen;
    }
}