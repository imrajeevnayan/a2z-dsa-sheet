class Solution {
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            // If count goes negative, it means extra ')' appeared
            if (count < 0) return false;
        }
        // At the end, count should be 0 for balanced parentheses
        return count == 0;
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;

        Set<String> visited = new HashSet<>(); // Duplicates avoid karne ke liye
        Queue<String> queue = new LinkedList<>();
        
        // Step 1: Start with original string
        queue.add(s);
        visited.add(s);
        
        boolean found = false; // Flag to stop after finding minimum removals level
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            
            // Step 2: Check if current string is valid
            if (isValid(current)) {
                result.add(current);
                found = true; // We found answers at this level (min removals)
            }
            
            // If we already found answers at this level, no need to go deeper (next level)
            // Because next level means more removals, which we don't want.
            if (found) continue;
            
            // Step 3: Generate next level strings by removing one bracket at a time
            for (int i = 0; i < current.length(); i++) {
                // Only consider removing '(' or ')'
                if (current.charAt(i) != '(' && current.charAt(i) != ')') continue;
                
                // Remove character at index i
                String nextStr = current.substring(0, i) + current.substring(i + 1);
                
                // If we haven't processed this string before, add to queue
                if (!visited.contains(nextStr)) {
                    queue.add(nextStr);
                    visited.add(nextStr);
                }
            }
        }
        
        return result;
    }
}