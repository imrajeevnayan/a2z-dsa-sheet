class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = preorder.length;

        if (n == 1) {
            ans.add(preorder[0]);
            return ans;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;

            if (preorder[i] > preorder[i + 1]) {
                st.push(preorder[i]);
            } else {
                while (!st.isEmpty() && preorder[i + 1] > st.peek()) {
                    st.pop();
                    flag = true;
                }

                if (flag) {
                    ans.add(preorder[i]);
                }
            }
        }

        ans.add(preorder[n - 1]);
        return ans;
    }
}