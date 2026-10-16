class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Har step par mid ko potential answer maano
            ans = Math.min(ans, nums[mid]);
            
            if (nums[mid] > nums[high]) {
                // Minimum right side mein hai
                low = mid + 1;
            } else {
                // Minimum left side mein hai (mid included)
                high = mid - 1;
            }
        }
        
        return ans;
    }
}