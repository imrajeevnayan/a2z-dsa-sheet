class Solution {
    public String findRollOut(String s, int[] roll) {
        int n = s.length();
        int[] freq = new int[n + 1]; // Difference array

        // Step 1: Mark the ranges using Difference Array technique
        for (int k : roll) {
            // First k characters means indices 0 to k-1
            if (k > 0) {
                freq[0]++;
                if (k < n) {
                    freq[k]--;
                }
            }
        }

        // Step 2: Calculate Prefix Sum to get total shifts for each index
        StringBuilder sb = new StringBuilder();
        int currentShift = 0;

        for (int i = 0; i < n; i++) {
            currentShift += freq[i];

            // Original character
            char c = s.charAt(i);

            // Calculate new character with wrapping
            // (c - 'a' + shift) % 26 gives the new position
            int newPos = (c - 'a' + currentShift) % 26;

            // Handle negative modulo if any (though shift is positive here)
            if (newPos < 0) newPos += 26;

            sb.append((char)('a' + newPos));
        }

        return sb.toString();
    }
}