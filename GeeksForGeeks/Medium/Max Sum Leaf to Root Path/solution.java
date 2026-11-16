class Solution {
    public static int maxPathSum(Node root) {
        if (root == null) return 0;
        return solve(root);
    }

    private static int solve(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        if (root.left == null && root.right == null)
            return root.data;

        return root.data + Math.max(
                solve(root.left),
                solve(root.right)
        );
    }
}