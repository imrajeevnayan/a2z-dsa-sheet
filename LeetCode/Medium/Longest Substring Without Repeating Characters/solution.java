class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] freq = new int[128]; // ASCII
        int left = 0,maxLen = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq[c]++;

            // Agar frequency > 1 ho gayi → invalid
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
        
    }
}