/*
 * Platform: TakeUForward
 * Problem: Everything you need for Tech Interviews
 * URL: https://takeuforward.org/pricing
 * Language: Java
 * Difficulty: Medium
 * Topics: Instagram
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-08T18:15:12.657Z
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.data != q.data)  return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
