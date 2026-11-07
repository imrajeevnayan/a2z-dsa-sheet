class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                st.push(count);
                ans.add(count);
            } 
            else if (ch == ')') {
                ans.add(st.peek());
                st.pop();
            }
        }

        return ans;
    }
}