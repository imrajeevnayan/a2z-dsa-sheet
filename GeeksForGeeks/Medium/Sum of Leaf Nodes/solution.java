class Solution {
    public int leafSum(Node root) {
        // Base case: Agar node null hai toh 0 return karo
        if (root == null)  return 0;
        

        // Check karo ki kya ye LEAF node hai?
        // Leaf = Left child NULL AND Right child NULL
        if (root.left == null && root.right == null) return root.data;
        
        // Non-leaf node hai: Left + Right subtree ka sum return karo
        return leafSum(root.left) + leafSum(root.right);
    }
}