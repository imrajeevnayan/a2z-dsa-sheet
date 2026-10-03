/*
 * Platform: LeetCode
 * Problem: 112. Path Sum
 * URL: https://leetcode.com/problems/path-sum/description/?envType=problem-list-v2&envId=tree
 * Language: Java
 * Difficulty: Easy
 * Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-03T06:29:06.628Z
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
    if(root==null) return false;
    if(root.left==null && root.right==null){
        return targetSum==root.val;
    }
    int rem=targetSum-root.val;
    return hasPathSum(root.left,rem) || hasPathSum(root.right,rem);   
    }
}
