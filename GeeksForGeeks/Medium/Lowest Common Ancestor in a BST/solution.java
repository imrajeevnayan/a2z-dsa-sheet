class Solution {
    public Node findLCA(Node root, Node n1, Node n2) {
        if (root == null) return null;

        if (n1.data < root.data && n2.data < root.data)
            return findLCA(root.left, n1, n2);

        if (n1.data > root.data && n2.data > root.data)
            return findLCA(root.right, n1, n2);

        return root;
    }
}