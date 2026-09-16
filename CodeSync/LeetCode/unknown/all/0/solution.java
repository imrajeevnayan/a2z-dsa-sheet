/*
 * Platform: LeetCode
 * Problem: 0
 * URL: https://leetcode.com/submissions/detail/2144104522/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 1 ms
 * Memory: 46.53 MB
 * Synced: 2026-09-16T20:37:31.581Z
 */

1class Solution {
2    public int kthSmallest(TreeNode root, int k) {
3
4        Stack<TreeNode> stack = new Stack<>();
5        TreeNode curr = root;
6
7        while (true) {
8
9            // Left side ke nodes stack mein daalo
10            while (curr != null) {
11                stack.push(curr);
12                curr = curr.left;
13            }
14
15            // Smallest remaining node
16            curr = stack.pop();
17            k--;
18
19            // kth smallest mil gaya
20            if (k == 0) {
21                return curr.val;
22            }
23
24            // Ab right subtree explore karo
25            curr = curr.right;
26        }
27    }
28}
