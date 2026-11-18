class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;
            if (root.val == val) return root;
        
        // Chhoti value left subtree mein hogi
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        // Badi value right subtree mein hogi
        return searchBST(root.right, val);
    }
}