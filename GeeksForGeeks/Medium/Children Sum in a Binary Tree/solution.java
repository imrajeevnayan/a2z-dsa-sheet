class Solution {
    public boolean isSumProperty(Node root) {
        // Base case: null node ya leaf node → always valid
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        // Left aur right child ka sum nikalo
        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        // Current node check: data == children sum?
        if (root.data != leftData + rightData) {
            return false;
        }

        // Recursively dono subtrees bhi check karo
        return isSumProperty(root.left) && isSumProperty(root.right);
    }
}