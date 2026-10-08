/*
 * Platform: TakeUForward
 * Problem: Check if a Large Number is Divisible by 9 POTD
 * URL: https://takeuforward.org/practice/dsa/check-if-a-large-number-is-divisible-by-9
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-08T18:17:49.712Z
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.data != q.data)  return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
