class Solution {
    private String ans = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }
    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) return;
        path.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            String curr = path.reverse().toString();
            path.reverse(); // restore

            if (ans == null || curr.compareTo(ans) < 0) {
                ans = curr;
            }
        }

        dfs(node.left, path);
        dfs(node.right, path);

        path.deleteCharAt(path.length() - 1); // backtrack
    }
}