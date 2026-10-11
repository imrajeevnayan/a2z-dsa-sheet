class Solution {
    int getLevel(Node node, int data) {
        // Helper function call karo starting from level 1
        return findLevel(node, data, 1);
    }

    private int findLevel(Node node, int data, int currentLevel) {
        // Base case: Agar node null hai, toh ye path valid nahi hai
        if (node == null) {
            return 0;
        }

        // Agar current node hi target hai, toh yehi level return karo
        if (node.data == data) {
            return currentLevel;
        }

        // Pehle left subtree mein search karo
        int leftLevel = findLevel(node.left, data, currentLevel + 1);

        // Agar left mein mil gaya (non-zero), toh wahi return karo
        if (leftLevel != 0) {
            return leftLevel;
        }

        // Left mein nahi mila, toh right subtree mein search karo
        return findLevel(node.right, data, currentLevel + 1);
    }
}