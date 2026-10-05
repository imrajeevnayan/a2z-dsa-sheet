class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true; // Direction flag

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            // Is level ke saare nodes process karo
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.data);

                // Children add karo (always left then right)
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // Agar right-to-left level hai → reverse karo
            if (!leftToRight) {
                Collections.reverse(level);
            }

            // Result mein add karo
            result.addAll(level);

            // Direction flip karo next level ke liye
            leftToRight = !leftToRight;
        }

        return result;
    }
}