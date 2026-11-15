class Solution {

    int count = 0;
    HashMap<Long, Integer> map = new HashMap<>();

    public int countAllPaths(Node root, int k) {

        dfs(root, 0L, k);
        return count;
    }

    private void dfs(Node node, long currSum, int k) {

        if (node == null)
            return;

        currSum += node.data;

        // Path starting from root
        if (currSum == k)
            count++;

        // Paths ending at current node
        count += map.getOrDefault(currSum - k, 0);

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        dfs(node.left, currSum, k);
        dfs(node.right, currSum, k);

        // Backtracking
        map.put(currSum, map.get(currSum) - 1);

        if (map.get(currSum) == 0)
            map.remove(currSum);
    }
}