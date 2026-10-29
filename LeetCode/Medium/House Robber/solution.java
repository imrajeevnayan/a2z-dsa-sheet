class Solution {
    public int amount(int[] nums, int i, int[] dp) {
        if (i >= nums.length) return 0;
        
        // Memoization Step: Agar pehle se calculate hai, toh direct return karo
        if (dp[i] != -1) return dp[i];
        
        // Choice 1: Current house loot lo, aur agle adjacent ko skip karke i+2 pe jao
        int take = nums[i] + amount(nums, i + 2, dp);
        
        // Choice 2: Current house skip karo, aur seedha next house i+1 pe jao
        int skip = amount(nums, i + 1, dp); // '0 +' likhne ki zaroorat nahi hai
        
        // Max value ko dp mein store karo aur return karo
        return dp[i] = Math.max(take, skip);
    }

    public int rob(int[] nums) {
        // Edge case handle karna acchi practice hai
        if (nums == null || nums.length == 0) return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        
        // Start from index 0
        return amount(nums, 0, dp);
    }
}