class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        // Map to store frequency of valid substrings
        Map<String, Integer> freqMap = new HashMap<>();
        
        // Sliding window of fixed size = minSize
        for (int i = 0; i <= s.length() - minSize; i++) {
            String sub = s.substring(i, i + minSize);
            
            // Check if this substring satisfies the unique char constraint
            if (isValid(sub, maxLetters)) {
                freqMap.put(sub, freqMap.getOrDefault(sub, 0) + 1);
            }
        }
        
        // Find maximum frequency among all valid substrings
        int maxOccurrence = 0;
        for (int count : freqMap.values()) {
            maxOccurrence = Math.max(maxOccurrence, count);
        }
        
        return maxOccurrence;
    }
    
    private boolean isValid(String sub, int maxLetters) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : sub.toCharArray()) {
            uniqueChars.add(c);
            // Early exit: agar already maxLetters cross ho gaye, 
            // baaki chars check karne ki zaroorat nahi
            if (uniqueChars.size() > maxLetters) return false;
        }
        return true;
    }
}