class Solution {

    int countNodes(Node root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    boolean isCBT(Node root, int index, int total) {
        if (root == null) return true;

        if (index >= total) return false;

        return isCBT(root.left, 2 * index + 1, total)
            && isCBT(root.right, 2 * index + 2, total);
    }

    boolean isMaxHeap(Node root) {
        if (root == null) return true;

        // Leaf node
        if (root.left == null && root.right == null)
            return true;

        // Only left child
        if (root.right == null) {
            return root.data >= root.left.data
                && isMaxHeap(root.left);
        }

        // Both children
        return root.data >= root.left.data
            && root.data >= root.right.data
            && isMaxHeap(root.left)
            && isMaxHeap(root.right);
    }

    public boolean isHeap(Node root) {
        int total = countNodes(root);

        return isCBT(root, 0, total)
            && isMaxHeap(root);
    }
}