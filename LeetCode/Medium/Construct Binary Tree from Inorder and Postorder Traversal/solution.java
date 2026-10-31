class Solution {

    private int postIndex;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int n = inorder.length;

        postIndex = n - 1;

        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return construct(inorder, postorder, 0, n - 1);
    }

    private TreeNode construct(int[] inorder,
                               int[] postorder,
                               int inStart,
                               int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        int rootVal = postorder[postIndex--];

        TreeNode root = new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);

        // Build RIGHT first
        root.right = construct(inorder, postorder,
                               rootIndex + 1, inEnd);

        root.left = construct(inorder, postorder,
                              inStart, rootIndex - 1);

        return root;
    }
}
