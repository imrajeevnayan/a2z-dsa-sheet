class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (head == null) return ans;

        // Find the last node
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }

        Node left = head;

        while (left != null && right != null &&
               left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);

                left = left.next;
                right = right.prev;
            }
            else if (sum < target) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }

        return ans;
    }
}