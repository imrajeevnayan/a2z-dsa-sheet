class Solution {
    public ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Agar tree empty hai
        if (root == null) {
            return ans;
        }

        // HD -> node ka data store karenge
        // TreeMap automatically HD ko sorted order mein rakhega
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Queue mein node aur uska horizontal distance store karenge
        Queue<Pair> queue = new LinkedList<>();

        // Root ka horizontal distance 0 hota hai
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair curr = queue.poll();

            Node node = curr.node;
            int hd = curr.hd;

            // Agar is HD par pehli baar node mila hai,
            // toh wahi top view mein aayega
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            // Left child ka HD = current HD - 1
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }

            // Right child ka HD = current HD + 1
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        // TreeMap leftmost HD se rightmost HD tak sorted hai
        ans.addAll(map.values());

        return ans;
    }

    // Node ke saath horizontal distance store karne ke liye Pair
    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
