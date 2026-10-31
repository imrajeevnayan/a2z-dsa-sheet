class Solution {
    private int preIndex = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return construct(preorder, 0, inorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int inStart, int inEnd) {

        if (inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);

        root.left = construct(preorder, inStart, rootIndex - 1);
        root.right = construct(preorder, rootIndex + 1, inEnd);

        return root;
    }
}