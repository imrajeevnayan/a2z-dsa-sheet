class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        int[] lengths = new int[n];
        
        // Step 1: Har word ka bitmask aur length store karo
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                // Bit ko set karo: 1 << (character - 'a')
                mask |= (1 << (c - 'a'));
            }
            masks[i] = mask;
            lengths[i] = words[i].length();
        }
        
        int maxProd = 0;
        
        // Step 2: Sabhi pairs ko check karo
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Agar AND 0 hai, toh koi common letter nahi hai
                if ((masks[i] & masks[j]) == 0) {
                    maxProd = Math.max(maxProd, lengths[i] * lengths[j]);
                }
            }
        }
        
        return maxProd;
    }
}