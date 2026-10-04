class Solution {
    public Node deleteNode(Node root, int k) {
        if (root == null) return null;

        // Agar current node >= k hai (NOT just >)
        // Ye node + poora right subtree delete hoga
        // Sirf left subtree mein valid nodes ho sakte hain
        if (root.data >= k) {
            return deleteNode(root.left, k);
        }

        // Current node < k → safe hai
        // Right subtree mein kuch nodes >= k ho sakte hain → prune karo
        root.right = deleteNode(root.right, k);

        return root;
    }
}