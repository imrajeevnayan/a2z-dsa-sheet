class Solution {
    private boolean isMirror(Node left, Node right) {
        
        // Base Case: Dono null hain -> Mirror hai
        if (left == null && right == null) return true;

        // Ek null hai ya values match nahi kar rahi -> Mirror nahi hai
        if (left == null || right == null || left.data != right.data) return false;

        // Cross Comparison:
        // 1. Left ka left == Right ka right (Outer)
        // 2. Left ka right == Right ka left (Inner)
        return isMirror(left.left, right.right) 
            && isMirror(left.right, right.left);
    }

    public boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
}