class Solution {
    public boolean hasMatch(String s, String p) {
        // Pattern ko '*' ke basis par split karo
        // Example: "ee*e" -> ["ee", "e"]
        String[] parts = p.split("\\*", -1); 
        String prefix = parts[0];
        String suffix = parts[1];
        
        int n = s.length();
        int preLen = prefix.length();
        int sufLen = suffix.length();
        
        // Edge case: Agar prefix aur suffix dono empty hain ("*")
        // Toh wo har string ka substring hai (empty string always exists)
        if (preLen == 0 && sufLen == 0) return true;
        
        // String 's' ke har possible starting index ko check karo
        for (int i = 0; i <= n - preLen; i++) {
            // Check karo ki kya current position par prefix match ho raha hai?
            if (s.startsWith(prefix, i)) {
                
                // Ab check karo ki kya iske baad kahin suffix bhi fit ho sakta hai?
                // Suffix kabhi bhi aa sakta hai, bas uski length available honi chahiye
                // Aur wo prefix ke turant baad ya uske baad kisi jagah aa sakta hai
                
                // Simple logic: Prefix match milne ke baad, 
                // remaining string mein suffix dhundo
                // Note: * zero or more chars allow karta hai, 
                // toh suffix prefix ke turant baad bhi ho sakta hai
                
                int minStartForSuffix = i + preLen;
                
                // Remaining string mein suffix dhoondna
                // startsWith/endWith ya indexOf use kar sakte hain
                if (s.indexOf(suffix, minStartForSuffix) != -1) {
                    // Bas itna ensure karo ki suffix puri tarah string ke andar fit ho
                    // indexOf already boundary handle kar leta hai
                    return true;
                }
            }
        }
        
        return false;
    }
}