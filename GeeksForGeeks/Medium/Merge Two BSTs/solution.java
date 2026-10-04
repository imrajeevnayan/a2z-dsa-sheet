class Solution {
    public ArrayList<Integer> merge(Node r1, Node r2) {
        ArrayList<Integer> result = new ArrayList<>();

        // Dono BSTs ke liye alag stacks (inorder simulation)
        Deque<Node> stack1 = new ArrayDeque<>();
        Deque<Node> stack2 = new ArrayDeque<>();

        // Step 0: Dono stacks initialize karo (leftmost path push karo)
        pushLeft(stack1, r1);
        pushLeft(stack2, r2);

        // Step 1: Jab tak dono stacks non-empty hain → smaller element pick karo
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            // Dono tops compare karo, jo chhota hai usse lo
            if (stack1.peek().data <= stack2.peek().data) {
                Node node = stack1.pop();
                result.add(node.data);
                // Is node ke right subtree ka leftmost path push karo
                pushLeft(stack1, node.right);
            } else {
                Node node = stack2.pop();
                result.add(node.data);
                pushLeft(stack2, node.right);
            }
        }

        // Step 2: Jo stack bacha hai uske remaining elements add karo
        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            result.add(node.data);
            pushLeft(stack1, node.right);
        }
        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            result.add(node.data);
            pushLeft(stack2, node.right);
        }

        return result;
    }

    // Leftmost path push karo stack mein (inorder setup)
    private void pushLeft(Deque<Node> stack, Node node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}