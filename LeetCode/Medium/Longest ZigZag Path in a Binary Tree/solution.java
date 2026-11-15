class Solution {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root.left, true, 1);   // started by moving left
        dfs(root.right, false, 1); // started by moving right
        return max;
    }

    private void dfs(TreeNode node, boolean cameFromLeft, int len) {
        if (node == null) return;

        max = Math.max(max, len);

        if (cameFromLeft) {
            // Continue ZigZag
            dfs(node.right, false, len + 1);

            // Start new ZigZag
            dfs(node.left, true, 1);
        } else {
            // Continue ZigZag
            dfs(node.left, true, len + 1);

            // Start new ZigZag
            dfs(node.right, false, 1);
        }
    }
}