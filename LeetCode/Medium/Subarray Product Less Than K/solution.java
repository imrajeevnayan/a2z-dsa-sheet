class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Edge case: Agar k <= 1 hai, toh koi bhi positive number ka product 1 se chota nahi ho sakta
        if (k <= 1) return 0;
        
        int left = 0;
        int product = 1;
        int count = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Expand window
            product *= nums[right];
            
            // Shrink window if product becomes >= k
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            // Add number of valid subarrays ending at 'right'
            count += (right - left + 1);
        }
        
        return count;
    }
}