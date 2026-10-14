class Solution {
    int maxDiameter = 0; // Global variable to track max diameter

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxDiameter;
    }
    private int calculateHeight(TreeNode node) {
        if (node == null) return 0;
        
        // Left aur Right subtree ki height nikalo
        int leftH = calculateHeight(node.left);
        int rightH = calculateHeight(node.right);
        
        // Current node par diameter check karo (Left Height + Right Height)
        // Note: Edges count karne ke liye hum sirf heights add karte hain.
        maxDiameter = Math.max(maxDiameter, leftH + rightH);
        
        // Apne parent ko apni height batao (Max of children + 1)
        return Math.max(leftH, rightH) + 1;
    }
}