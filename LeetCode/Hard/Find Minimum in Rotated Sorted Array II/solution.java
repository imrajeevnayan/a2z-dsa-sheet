class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE; // Shuru mein sabse bada value
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Duplicate case handle karo pehle
            if (nums[mid] == nums[high]) {
                ans = Math.min(ans, nums[mid]); // Potential answer store karo
                high--; // Range choti karo
            } 
            else if (nums[mid] > nums[high]) {
                // Minimum right side mein hai
                ans = Math.min(ans, nums[mid]); // Mid bhi check karo
                low = mid + 1;
            } 
            else {
                // Minimum left side mein hai (mid included)
                ans = Math.min(ans, nums[mid]); // Mid potential min hai
                high = mid - 1;
            }
        }
        
        return ans;
    }
}