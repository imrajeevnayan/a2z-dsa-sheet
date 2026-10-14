class Solution {
    // Map to store serialization string and its count
    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return result;
    }

    private String serialize(TreeNode node) {
        if (node == null) return "#";

        // Post-order: Left -> Right -> Root
        String left = serialize(node.left);
        String right = serialize(node.right);
        
        // Unique key create karo
        String key = left + "," + right + "," + node.val;

        // Frequency update karo
        map.put(key, map.getOrDefault(key, 0) + 1);

        // Agar frequency exactly 2 hai, toh ye duplicate hai
        // (3rd baar aane par hum add nahi karenge taaki duplicate entry na ho)
        if (map.get(key) == 2) {
            result.add(node);
        }

        return key;
    }
}