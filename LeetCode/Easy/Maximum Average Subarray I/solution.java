class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        // Step 1: Pehli window (0 to k-1) ka sum nikalo
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        
        // Step 2: Window ko slide karo (Right side se add, Left side se remove)
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];       // Naya element add karo
            sum -= nums[i - k];   // Purana element (window ke bahar wala) hata do
            
            // Max sum update karo
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        // Step 3: Average return karo
        return maxSum / k;
    }
}