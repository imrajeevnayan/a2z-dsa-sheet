class Solution {
    public boolean evaluateTree(TreeNode root) {
        // Base Case: Leaf nodes (0 or 1)
        if (root.val == 0) return false;
        if (root.val == 1) return true;
        
        // Recursive Step: Evaluate left and right subtrees
        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);
        
        // Apply Operation based on node value
        if (root.val == 2) {
            return leftVal || rightVal; // OR
        } else {
            return leftVal && rightVal; // AND (val == 3)
        }
    }
}