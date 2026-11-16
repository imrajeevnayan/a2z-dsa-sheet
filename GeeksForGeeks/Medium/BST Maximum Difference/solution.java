class Solution {

    public static int maxDifferenceBST(Node root, int target) {

        Node curr = root;
        int s1 = 0;

        // Find target and calculate S1
        while (curr != null && curr.data != target) {
            s1 += curr.data;

            if (target < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        if (curr == null) return -1;

        int s2 = minPath(curr) - curr.data;

        return s1 - s2;
    }

    static int minPath(Node node) {

        if (node == null)
            return Integer.MAX_VALUE;

        if (node.left == null && node.right == null)
            return node.data;

        return node.data +
                Math.min(minPath(node.left),
                         minPath(node.right));
    }
}