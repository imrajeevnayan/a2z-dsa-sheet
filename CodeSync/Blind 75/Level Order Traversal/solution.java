/*
 * Platform: TakeUForward
 * Problem: Level Order Traversal
 * URL: https://takeuforward.org/practice/dsa/level-order-traversal
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T19:27:06.075Z
 */

// Current level ki values store karne ke liye
            List<Integer> list = new ArrayList<>();

            // Sirf current level ke nodes process karo
            for (int i = 0; i < n; i++) {

                // Queue se front node nikalo
                TreeNode curr = q.remove();

                // Current node ki value level list me add karo
                list.add(curr.val);

                // Agar left child hai to next level ke liye queue me add karo
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
