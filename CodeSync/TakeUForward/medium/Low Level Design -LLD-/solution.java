/*
 * Platform: TakeUForward
 * Problem: Low Level Design (LLD)
 * URL: https://takeuforward.org/prep-hub/low-level-design
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-08T18:15:27.615Z
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.data != q.data)  return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
