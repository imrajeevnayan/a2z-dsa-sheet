/*
 * Platform: TakeUForward
 * Problem: Postorder Traversal
 * URL: https://takeuforward.org/practice/dsa/postorder-traversal
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T19:05:58.388Z
 */

class Solution {
    public List<Integer> postorder(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        postorderTraversal(root,ans);
        return ans;
    public void postorderTraversal(TreeNode root,List<Integer>ans){
        if(root==null) return;
    }
    }
        postorderTraversal(root.left,ans);
        postorderTraversal(root.right,ans);
        ans.add(root.data);
