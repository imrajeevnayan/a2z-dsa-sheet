class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE; // Sabse bada value se start karo
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Right side se add karo
            
            // Jab tak sum target se bada hai, left side se hatao
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); // Chota length store karo
                sum -= nums[left]; // Left element nikalo
                left++; // Window shrink karo
            }
        }
        
        // Agar minLen same hai, toh koi answer nahi mila
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}