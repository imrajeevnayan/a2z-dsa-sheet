class Solution {
    public String reverseWords(String s) {
        // Step 1: String ko words mein todo
        String[] words = s.split(" ");
        
        // Step 2: Pehle word ke vowels count karo
        int targetVowels = countVowels(words[0]);
        
        // Step 3: Baaki words ko check karo
        for (int i = 1; i < words.length; i++) {
            // Agar is word mein bhi utne hi vowels hain, toh reverse kar do
            if (countVowels(words[i]) == targetVowels) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        
        // Step 4: Wapas join karke return karo
        return String.join(" ", words);
    }
    
    // Helper function: Vowels count karne ke liye
    private int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}