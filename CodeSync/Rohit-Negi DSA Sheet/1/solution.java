/*
 * Platform: LeetCode
 * Problem: 1
 * URL: https://leetcode.com/problems/binary-tree-maximum-path-sum/submissions/2150859767/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-23T14:49:25.067Z
 */

class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    private int dfs(TreeNode node) {
        if (node == null) return 0;

        // Left aur Right se gain lao (negative ho toh 0 le lo)
        int leftGain = Math.max(dfs(node.left), 0);
        int rightGain = Math.max(dfs(node.right), 0);

        // Current node ko peak maankar total sum calculate karo
        // Ye global answer ko update karne ke
