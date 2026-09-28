/*
 * Platform: TakeUForward
 * Problem: Inorder Traversal
 * URL: https://takeuforward.org/practice/dsa/inorder-traversal
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: 0.780 ms
 * Memory: N/A
 * Synced: 2026-09-25T17:21:31.965Z
 */

return ans;
    }
    public void inorderTraversal(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        inorderTraversal(root.left, ans);
        ans.add(root.data);
        inorderTraversal(root.right, ans);
    }
}
