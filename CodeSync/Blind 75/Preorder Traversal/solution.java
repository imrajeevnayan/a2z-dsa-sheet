/*
 * Platform: TakeUForward
 * Problem: Preorder Traversal
 * URL: https://takeuforward.org/practice/dsa/preorder-traversal
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: 0.791 ms
 * Memory: N/A
 * Synced: 2026-09-25T19:12:31.852Z
 */

class Solution {
    public List<Integer> preorder(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        preorderTraversal(root,ans);
        return ans;
    public void preorderTraversal(TreeNode root,List<Integer>ans){
        if(root==null) return;
    }
    }
        ans.add(root.data);
        preorderTraversal(root.left,ans);
        preorderTraversal(root.right,ans);
