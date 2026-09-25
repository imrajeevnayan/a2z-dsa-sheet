/*
 * Platform: TakeUForward
 * Problem: Diameter of Binary Tree
 * URL: https://takeuforward.org/practice/dsa/diameter-of-binary-tree
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T06:07:04.119Z
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
