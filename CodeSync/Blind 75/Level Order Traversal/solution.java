/*
 * Platform: TakeUForward
 * Problem: Level Order Traversal
 * URL: https://takeuforward.org/practice/dsa/level-order-traversal
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T19:27:38.551Z
 */

List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.remove();
                list.add(curr.val);
            int n = q.size();

        while (!q.isEmpty()) {
        q.add(root);
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)  return ans;
        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
class Solution {
                if (curr.left != null)
                    q.add(curr.left);

                // Agar right child hai to next level ke liye queue me add karo
                if (curr.right != null)
                    q.add(curr.right);
            }

            // Current level complete ho gaya, answer me add kar do
            ans.add(list);
        }

        // Final level order traversal return karo
        return ans;
    }
}
