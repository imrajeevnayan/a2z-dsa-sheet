class Solution {
    public long wonderfulSubstrings(String word) {
        // Since we have only 10 characters ('a' to 'j'), max mask value is 2^10 = 1024
        long[] count = new long[1024];
        
        // Initial state: empty string has all even frequencies (mask 0)
        count[0] = 1;
        
        int mask = 0;
        long result = 0;
        
        for (char c : word.toCharArray()) {
            // Toggle the bit corresponding to the current character
            int charIndex = c - 'a';
            mask ^= (1 << charIndex);
            
            // Case 1: Substring with ALL characters having even frequency
            // If same mask appeared before, the substring between them has even counts for all chars
            result += count[mask];
            
            // Case 2: Substring with EXACTLY ONE character having odd frequency
            // Try flipping each of the 10 bits one by one
            for (int i = 0; i < 10; i++) {
                int targetMask = mask ^ (1 << i);
                result += count[targetMask];
            }
            
            // Update the count for the current mask
            count[mask]++;
        }
        
        return result;
    }
}