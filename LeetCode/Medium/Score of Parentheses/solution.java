class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(0);
            else {
                int v = st.pop();
                int w = st.pop();
                st.push(w + Math.max(2 * v, 1));
            }
        }
        return st.pop();
    }
}