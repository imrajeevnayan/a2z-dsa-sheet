class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        // Agar depth 1 hai, naya node root ke upar lagega
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        addRow(root, val, depth, 1);
        return root;
    }

    private void addRow(TreeNode node, int val, int depth, int currentDepth) {
        
        if (node == null) {
            return;
        }

        // Humein depth - 1 tak jaana hai
        if (currentDepth == depth - 1) {

            // Left side
            TreeNode newLeft = new TreeNode(val);
            newLeft.left = node.left;
            node.left = newLeft;

            // Right side
            TreeNode newRight = new TreeNode(val);
            newRight.right = node.right;
            node.right = newRight;

            return;
        }

        addRow(node.left, val, depth, currentDepth + 1);
        addRow(node.right, val, depth, currentDepth + 1);
    }
}
