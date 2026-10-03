class Solution {
    public boolean isSumTree(Node node) {

        // Empty tree Sum Tree hota hai
        if (node == null) {
            return true;
        }

        return checkSumTree(node) != -1;
    }

    // Har subtree ka sum return karega
    // Agar subtree Sum Tree nahi hai toh -1 return karega
    private int checkSumTree(Node node) {

        // Null node ka sum 0
        if (node == null) {
            return 0;
        }

        // Leaf node ke liye koi condition check nahi karni
        // Bas uska data return karo
        if (node.left == null && node.right == null) {
            return node.data;
        }

        // Left subtree ka sum nikalo
        int leftSum = checkSumTree(node.left);

        // Agar left subtree Sum Tree nahi hai
        if (leftSum == -1) {
            return -1;
        }

        // Right subtree ka sum nikalo
        int rightSum = checkSumTree(node.right);

        // Agar right subtree Sum Tree nahi hai
        if (rightSum == -1) {
            return -1;
        }

        // Current node ka data = dono subtree ke sum ke equal hona chahiye
        if (node.data != leftSum + rightSum) {
            return -1;
        }

        // Current subtree ka total sum return karo
        return node.data + leftSum + rightSum;
    }
}
