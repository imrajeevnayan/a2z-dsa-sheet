class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        
        // Root ka value reference ke liye store karo
        return check(root, root.val);
    }
    private boolean check(TreeNode node, int val) {
        // Base case: Agar node null hai, toh wo valid hai
        if (node == null) return true;
        
        // Agar current node ka value match nahi kar raha, toh false return karo
        if (node.val != val) return false;
        
        // Left aur Right subtree mein recursively check karo
        // Dono side true honi chahiye tabhi final answer true hoga
        return check(node.left, val) && check(node.right, val);
    }
}