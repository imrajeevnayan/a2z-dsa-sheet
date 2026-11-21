class Solution {
    public boolean isValid(String s) {
        // Agar length odd hai, toh valid hona impossible hai.
        // Kyunki har bracket ka pair hona zaroori hai.
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Opening brackets ko stack mein push karo
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                // Closing bracket mila
                // Agar stack khali hai, toh koi matching opening bracket nahi hai
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                // Check karo ki pair match kar raha hai ya nahi
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        // End mein stack khali hona chahiye tabhi string valid hai
        return stack.isEmpty();
    }
}