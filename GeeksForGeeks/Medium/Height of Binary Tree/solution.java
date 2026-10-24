class Solution {
    int height(Node node) {
        // Base Case: Agar node null hai, toh height 0
        if (node == null)  return -1;
        
        // Recursively left aur right subtree ki height nikalo
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Current node ki height = 1 + max(left, right)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}