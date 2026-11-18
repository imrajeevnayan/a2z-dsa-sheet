class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0L, 1);

        return dfs(root, 0L, targetSum, prefixSum);
    }

    private int dfs(TreeNode node, long currSum, int targetSum,
                    Map<Long, Integer> prefixSum) {

        if (node == null) {
            return 0;
        }

        currSum += node.val;

        int count = prefixSum.getOrDefault(currSum - targetSum, 0);

        prefixSum.put(currSum,
                prefixSum.getOrDefault(currSum, 0) + 1);

        count += dfs(node.left, currSum, targetSum, prefixSum);
        count += dfs(node.right, currSum, targetSum, prefixSum);

        // Backtrack
        prefixSum.put(currSum, prefixSum.get(currSum) - 1);

        return count;
    }
}
