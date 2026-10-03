class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Tree empty hai
        if (root == null) return false;
        
        // Current node ko target se minus kar do
        targetSum = targetSum - root.val;

        // Agar leaf node hai
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // Left ya right mein valid path mil gaya?
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
