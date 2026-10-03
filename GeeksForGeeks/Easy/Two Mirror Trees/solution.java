class Solution {
    public boolean areMirror(Node a, Node b) {
        // Both are empty
        if (a == null && b == null) return true;
    
        // Only one is empty
        if (a == null || b == null)  return false;
    

        // Values must match, and subtrees must be mirrors
        return a.data == b.data
            && areMirror(a.left, b.right)
            && areMirror(a.right, b.left);
    }
}
