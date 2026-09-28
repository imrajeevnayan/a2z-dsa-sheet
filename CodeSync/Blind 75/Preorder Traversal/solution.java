/*
 * Platform: TakeUForward
 * Problem: Preorder Traversal
 * URL: https://takeuforward.org/practice/dsa/preorder-traversal
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T19:10:59.351Z
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
