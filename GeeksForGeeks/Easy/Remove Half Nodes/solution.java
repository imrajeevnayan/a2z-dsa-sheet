class Solution {
    public Node removeHalfNodes(Node root) {
        // Base case: null node return as is
        if (root == null) return null;

        // Step 1: Pehle left aur right subtree recursively process karo
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);

        // Step 2: Ab check karo ki current node half node hai ya nahi
        // Half node = exactly ONE child (left XOR right)
        if (root.left == null && root.right != null) {
            // Sirf right child hai → right child ko promote karo
            return root.right;
        }

        if (root.left != null && root.right == null) {
            // Sirf left child hai → left child ko promote karo
            return root.left;
        }

        // Step 3: Agar dono children hain ya koi nahi hai (leaf/full node)
        // Toh current node ko waise hi return karo
        return root;
    }
}