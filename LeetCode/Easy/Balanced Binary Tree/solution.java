class Solution {
    public boolean isBalanced(TreeNode root) {
        // Agar checkHeight -1 return kare, toh tree balanced nahi hai
        return checkHeight(root) != -1;
    }
    
    private int checkHeight(TreeNode node) {
        // Base case: Null node ki height 0 hoti hai
        if (node == null) return 0;
        
        // Left subtree ki height check karo
        int leftH = checkHeight(node.left);
        if (leftH == -1) return -1; // Agar left already unbalanced hai, toh ruk jao
        
        // Right subtree ki height check karo
        int rightH = checkHeight(node.right);
        if (rightH == -1) return -1; // Agar right already unbalanced hai, toh ruk jao
        
        // Current node par balance check karo
        if (Math.abs(leftH - rightH) > 1) {
            return -1; // Unbalanced hai
        }
        
        // Agar balanced hai, toh apni height return karo
        return Math.max(leftH, rightH) + 1;
    }
}