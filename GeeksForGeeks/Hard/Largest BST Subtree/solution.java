class Solution {

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    int ans = 0;

    private Info solve(Node root) {

        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = solve(root.left);
        Info right = solve(root.right);

        if (left.isBST && right.isBST &&
            root.data > left.max &&
            root.data < right.min) {

            int size = left.size + right.size + 1;

            ans = Math.max(ans, size);

            int mn = Math.min(root.data, left.min);
            int mx = Math.max(root.data, right.max);

            return new Info(true, size, mn, mx);
        }

        return new Info(false, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int largestBst(Node root) {
        ans = 0;
        solve(root);
        return ans;
    }
}