class Solution {
    public Node linkedListToBinaryTree(NodeLL head) {
        if (head == null) return null;

        Node root = new Node(head.data);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        head = head.next;

        while (head != null) {
            Node parent = q.poll();

            // Left child
            Node leftChild = new Node(head.data);
            parent.left = leftChild;
            q.offer(leftChild);

            head = head.next;

            // Right child
            if (head != null) {
                Node rightChild = new Node(head.data);
                parent.right = rightChild;
                q.offer(rightChild);

                head = head.next;
            }
        }

        return root;
    }
}