class Solution {
    public int minLeafSum(Node root) {

        // Agar tree empty hai
        if (root == null) {
            return 0;
        

        // BFS ke liye queue use karenge
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Level by level tree traverse karenge
        while (!queue.isEmpty()) {

            int size = queue.size();
            int sum = 0;
            boolean foundLeaf = false;

            // Current level ke saare nodes process karo
            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                // Agar current node leaf hai
                if (curr.left == null && curr.right == null) {
                    sum += curr.data;
                    foundLeaf = true;
                }

                // Left child ko next level ke liye queue mein daalo
                if (curr.left != null) {
                    queue.add(curr.left);
                }

                // Right child ko next level ke liye queue mein daalo
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            // Jaise hi kisi level par leaf mila,
            // wahi minimum level hai, answer return karo
            if (foundLeaf) {
                return sum;
            }
        }

        return 0;
    }
}
