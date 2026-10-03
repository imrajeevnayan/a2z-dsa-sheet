class Solution {
    public int maxLevelSum(Node root) {
        if (root == null)  return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                levelSum += curr.data;

                if (curr.left != null) q.add(curr.left);

                if (curr.right != null) q.add(curr.right);
                
            }
            maxSum = Math.max(maxSum, levelSum);
        }
        return maxSum;
    }
}
