class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        
        for (String query : queries) {
            result.add(isMatch(query, pattern));
        }
        return result;
    }
    private boolean isMatch(String query, String pattern) {
        int i = 0; // Pointer for query
        int j = 0; // Pointer for pattern
        
        while (i < query.length()) {
            // Agar pattern khatam ho gaya hai ya characters match kar rahe hain
            if (j < pattern.length() && query.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } 
            // Agar character match nahi hua, lekin wo lowercase hai
            else if (Character.isLowerCase(query.charAt(i))) {
                i++; // Ignore it, move forward in query
            } 
            // Agar character match nahi hua aur wo UPPERCASE hai
            else {
                return false; // Invalid match
            }
        }
        
        // Check karo ki pura pattern match hua ya nahi
        return j == pattern.length();
    }
}