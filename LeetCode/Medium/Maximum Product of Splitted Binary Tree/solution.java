class Solution {
    long maxProd = 0;
    int mod = 1_000_000_007;
    
    public int maxProduct(TreeNode root) {
        // Step 1: Total Sum calculate karo
        long totalSum = getSum(root);
        
        // Step 2: Har subtree ke liye max product check karo
        findMaxProduct(root, totalSum);
        
        return (int)(maxProd % mod);
    }
    
    private long getSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getSum(node.left) + getSum(node.right);
    }
    
    private long findMaxProduct(TreeNode node, long totalSum) {
        if (node == null) return 0;
        
        // Current subtree ka sum nikalo
        long subSum = node.val + findMaxProduct(node.left, totalSum) + findMaxProduct(node.right, totalSum);
        
        // Product calculate karo: subSum * (totalSum - subSum)
        long product = subSum * (totalSum - subSum);
        
        // Max update karo
        maxProd = Math.max(maxProd, product);
        
        return subSum;
    }
}