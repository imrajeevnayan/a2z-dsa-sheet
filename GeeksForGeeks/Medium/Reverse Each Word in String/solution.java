class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim + split by one or more spaces
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // Step 2: Har word ko reverse karo
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();

            // Step 3: Result mein add karo (space ke saath except first word)
            if (i > 0) result.append(" ");
             result.append(word);
        }

        return result.toString();
    }
}