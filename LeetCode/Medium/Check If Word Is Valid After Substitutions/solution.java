class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == 'c') {
                if (stack.size() < 2) return false;

                char b = stack.pop();
                char a = stack.pop();

                if (a != 'a' || b != 'b') return false;
                
            } 
            else  stack.push(ch); 
        }
        return stack.isEmpty();
    }
}