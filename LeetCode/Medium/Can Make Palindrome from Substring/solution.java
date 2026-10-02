class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        
        // prefix[i] = XOR mask of s[0..i-1]
        // Bit j is 1 iff char ('a'+j) appears odd times in s[0..i-1]
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ (1 << (s.charAt(i) - 'a'));
        }
        
        List<Boolean> result = new ArrayList<>();
        for (int[] q : queries) {
            int left = q[0], right = q[1], k = q[2];
            
            // XOR gives parity mask for substring s[left..right]
            int xorMask = prefix[right + 1] ^ prefix[left];
            
            // Count how many chars have odd frequency
            int oddCount = Integer.bitCount(xorMask);
            
            // Each replacement fixes 2 odd-count chars (make one even, another even)
            // So we need oddCount/2 replacements at minimum
            result.add(oddCount / 2 <= k);
        }
        
        return result;
    }
}