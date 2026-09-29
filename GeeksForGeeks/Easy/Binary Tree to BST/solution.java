class Solution {
    // Helper list to store node values
    ArrayList<Integer> nodesList = new ArrayList<>();
    int index = 0; // To track position in sorted list during replacement

    Node binaryTreeToBST(Node root) {
        if (root == null) return null;

        // Step 1: Store inorder traversal in a list
        storeInorder(root);

        // Step 2: Sort the list
        Collections.sort(nodesList);

        // Step 3: Replace nodes' data with sorted values using inorder traversal
        replaceInorder(root);

        return root;
    }

    private void storeInorder(Node node) {
        if (node == null) return;
        storeInorder(node.left);
        nodesList.add(node.data);
        storeInorder(node.right);
    }

    private void replaceInorder(Node node) {
        if (node == null) return;
        replaceInorder(node.left);

        // Replace current node's data with the next smallest value from sorted list
        node.data = nodesList.get(index);
        index++;

        replaceInorder(node.right);
    }
}