/*
 * Platform: LeetCode
 * Problem: 1
 * URL: https://leetcode.com/problems/search-in-a-binary-search-tree/submissions/2198926133/?envType=study-plan-v2&envId=leetcode-75
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-19T05:03:13.784Z
 */

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
