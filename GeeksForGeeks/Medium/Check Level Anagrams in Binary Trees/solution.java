class Solution {
    public boolean areAnagrams(Node root1, Node root2) {

        // Agar dono trees empty hain, toh anagrams hain
        if (root1 == null || root2 == null) {
            return root1 == root2;
        }

        // Dono trees ke liye BFS queues
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.offer(root1);
        q2.offer(root2);

        // Jab tak dono queues mein nodes hain
        while (!q1.isEmpty() && !q2.isEmpty()) {

            // Current level par kitne nodes hain
            int size1 = q1.size();
            int size2 = q2.size();

            // Agar level par nodes ki count different hai
            // toh trees anagrams nahi ho sakte
            if (size1 != size2) {
                return false;
            }

            // Current level ke values store karenge
            List<Integer> level1 = new ArrayList<>();
            List<Integer> level2 = new ArrayList<>();

            // Current level ke saare nodes process karo
            for (int i = 0; i < size1; i++) {

                Node n1 = q1.poll();
                Node n2 = q2.poll();

                // Dono levels ki values store karo
                level1.add(n1.data);
                level2.add(n2.data);

                // Tree 1 ke children queue mein daalo
                if (n1.left != null)
                    q1.offer(n1.left);

                if (n1.right != null)
                    q1.offer(n1.right);

                // Tree 2 ke children queue mein daalo
                if (n2.left != null)
                    q2.offer(n2.left);

                if (n2.right != null)
                    q2.offer(n2.right);
            }

            // Order matter nahi karta, isliye sort kar rahe hain
            Collections.sort(level1);
            Collections.sort(level2);

            // Sorted levels same nahi hain toh anagram nahi hai
            if (!level1.equals(level2)) {
                return false;
            }
        }

        // Dono queues empty honi chahiye
        return q1.isEmpty() && q2.isEmpty();
    }
}
