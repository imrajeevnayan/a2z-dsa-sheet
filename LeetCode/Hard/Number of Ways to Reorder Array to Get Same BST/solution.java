class Solution {
    private static final int MOD = 1_000_000_007;
    private long[][] pascal;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        
        // Precompute Pascal's Triangle for combinations
        pascal = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = (pascal[i - 1][j - 1] + pascal[i - 1][j]) % MOD;
            }
        }
        
        // Convert array to List for easier splitting
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        
        // Calculate total ways and subtract 1 (for the original order)
        return (int) ((solve(list) - 1) % MOD);
    }
    
    private long solve(List<Integer> nums) {
        if (nums.size() <= 2) {
            return 1;
        }
        
        int root = nums.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        // Split into left and right subtrees
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < root) {
                left.add(nums.get(i));
            } else {
                right.add(nums.get(i));
            }
        }
        
        int lSize = left.size();
        int rSize = right.size();
        
        // Ways to interleave left and right while maintaining relative order
        long comb = pascal[lSize + rSize][lSize];
        
        // Recursively calculate for left and right
        long leftWays = solve(left);
        long rightWays = solve(right);
        
        return (comb * ((leftWays * rightWays) % MOD)) % MOD;
    }
}