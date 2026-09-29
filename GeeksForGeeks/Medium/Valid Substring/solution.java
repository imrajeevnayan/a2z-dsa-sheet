class Solution {
    public int maxLength(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Opening bracket: index push karo
                stack.push(i);
            } else {
                // Closing bracket: pop karo
                stack.pop();

                if (stack.isEmpty()) {
                    // Agar stack empty ho gaya, toh ye closing bracket invalid hai
                    // Isse naya base banao
                    stack.push(i);
                } else {
                    // Valid pair mila, length calculate karo
                    // Current index - top of stack (jo last invalid index ya start hai)
                    int len = i - stack.peek();
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
}