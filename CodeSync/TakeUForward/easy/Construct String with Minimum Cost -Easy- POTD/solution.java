/*
 * Platform: TakeUForward
 * Problem: Construct String with Minimum Cost (Easy) POTD
 * URL: https://takeuforward.org/practice/dsa/construct-string-with-minimum-cost-easy
 * Language: Java
 * Difficulty: Easy
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-05T18:24:57.033Z
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.data != q.data)  return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
