import java.util.ArrayList;

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> result = new ArrayList<>();
        Node pre = null;
        Node suc = null;

        Node curr = root;

        while (curr != null) {
            if (key > curr.data) {
                // Key is greater than current node.
                // Current node could be the predecessor.
                pre = curr;
                curr = curr.right;
            } else if (key < curr.data) {
                // Key is smaller than current node.
                // Current node could be the successor.
                suc = curr;
                curr = curr.left;
            } else {
                // Key found! 
                // Predecessor will be the maximum in left subtree.
                // Successor will be the minimum in right subtree.

                if (curr.left != null) {
                    Node temp = curr.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    pre = temp;
                }

                if (curr.right != null) {
                    Node temp = curr.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    suc = temp;
                }
                break;
            }
        }

        result.add(pre);
        result.add(suc);
        return result;
    }
}