class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        long count = 0;
        long currentPairs = 0;
        int left = 0;
        int n = nums.length;
        
        for (int right = 0; right < n; right++) {
            // Add nums[right] to window
            int freq = freqMap.getOrDefault(nums[right], 0);
            
            // New pairs formed by adding this element = existing frequency
            currentPairs += freq;
            
            // Update frequency
            freqMap.put(nums[right], freq + 1);
            
            // Shrink window from left until pairs < k
            while (currentPairs >= k) {
                // All subarrays starting from left and ending at right, right+1, ... n-1 are good
                count += (n - right);
                
                // Remove nums[left] from window
                int leftFreq = freqMap.get(nums[left]);
                // Pairs removed = (leftFreq - 1) because one occurrence is leaving
                currentPairs -= (leftFreq - 1);
                
                freqMap.put(nums[left], leftFreq - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }
        }
        
        return count;
    }
}