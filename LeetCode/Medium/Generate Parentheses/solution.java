class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        // Base Case: Valid combination complete ho gayi
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }
        
        // Rule 1: '(' tabhi lagao jab count < n ho
        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1); // Backtrack (undo)
        }
        
        // Rule 2: ')' tabhi lagao jab close < open ho (balance maintain karne ke liye)
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1); // Backtrack (undo)
        }
    }
}