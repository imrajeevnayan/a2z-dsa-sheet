class Solution {
    public int minInsertions(String s) {
        int insertions = 0; // Total insertions count
        int need = 0;       // Kitne ')' ki abhi zaroorat hai
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Agar need odd hai, toh pichla bracket incomplete tha
                // Example: Need was 1, means we had one ')'. But we need pairs.
                // So we insert one ')' to make it a pair.
                if (need % 2 != 0) {
                    insertions++; // Ek ')' insert kiya
                    need--;       // Ab need puri ho gayi uske liye
                }
                // Naya '(' shuru hua, uske liye 2 ')' chahiye
                need += 2;
            } else {
                // ')' mila, toh need kam karo
                need--;
                
                // Agar need negative ho gayi, iska matlab ')' zyada hai bina '(' ke
                if (need < 0) {
                    insertions++; // Ek '(' insert karo
                    need += 2;    // Us '(' ke liye 2 ')' chahiye the, 
                                  // lekin current ')' use ho chuka hai, toh net need 1 bachti hai.
                                  // Logic: need was -1. Add 2 -> need becomes 1.
                }
            }
        }
        
        // End mein jo bhi need bachi hai, wo saare ')' insert karne padenge
        insertions += need;
        
        return insertions;
    }
}