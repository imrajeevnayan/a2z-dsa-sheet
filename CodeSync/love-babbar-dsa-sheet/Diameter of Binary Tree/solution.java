/*
 * Platform: TakeUForward
 * Problem: Diameter of Binary Tree
 * URL: https://takeuforward.org/practice/dsa/diameter-of-binary-tree
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: 0.794 ms
 * Memory: N/A
 * Synced: 2026-09-25T06:21:13.939Z
 */

class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    private int height(TreeNode root) {
        // Base case
        if (root == null) return 0;
        // Left subtree ki height
        int left = height(root.left);

        // Right subtree ki height
        int right = height(root.right);

        // Is node ke through diameter
        diameter = Math.max(diameter, left + right);

        // Current node ki height
        return 1 + Math.max(left, right);
    }
}
