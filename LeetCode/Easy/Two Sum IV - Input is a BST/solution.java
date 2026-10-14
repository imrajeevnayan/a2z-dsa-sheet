class Solution {
    Set<Integer> seen = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        
        // Check karo ki complement (k - val) pehle se exist karta hai?
        if (seen.contains(k - root.val)) {
            return true;
        }
        // Current value ko set mein add karo
        seen.add(root.val);
        
        // Left aur Right subtree mein dhundo
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}