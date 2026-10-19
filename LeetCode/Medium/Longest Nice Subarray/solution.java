class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int maxLen = 0;
        int bitMask = 0; // Stores the OR of all elements in current window
        
        for (int right = 0; right < nums.length; right++) {
            // Check if adding nums[right] causes a conflict (common bits)
            while ((bitMask & nums[right]) != 0) {
                // Remove nums[left] from the bitmask
                bitMask ^= nums[left];
                left++;
            }
            // Add nums[right] to the bitmask
            bitMask |= nums[right];
            
            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}