class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        // Root ke liye parent aur grandparent null honge
        return dfs(root, null, null);
    }
    private int dfs(TreeNode node, TreeNode parent, TreeNode grandparent) {
        if (node == null) return 0;
        int sum = 0;
        
        // Agar grandparent exists karta hai aur uski value even hai
        if (grandparent != null && grandparent.val % 2 == 0) {
            sum += node.val;
        }
        
        // Left child ke liye recurse karo:
        // Parent -> Node ban jayega
        // Node -> Parent ban jayega
        sum += dfs(node.left, node, parent);
        
        // Right child ke liye recurse karo
        sum += dfs(node.right, node, parent);
        
        return sum;
    }
}