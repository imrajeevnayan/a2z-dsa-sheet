/*
 * Platform: LeetCode
 * Problem: 4
 * URL: https://leetcode.com/problems/cousins-in-binary-tree/submissions/2157790073/?envType=problem-list-v2&envId=djtxhcwd
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-30T06:30:14.930Z
 */

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            boolean foundX = false;
            boolean foundY = false;

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                // Check if x and y are siblings
                if (curr.left != null && curr.right != null) {
