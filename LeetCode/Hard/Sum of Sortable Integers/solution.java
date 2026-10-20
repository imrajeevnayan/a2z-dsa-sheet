class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        // Find all divisors of n
        for (int k = 1; k * k <= n; k++) {
            if (n % k == 0) {
                // Check divisor k
                if (isSortable(nums, k)) {
                    sum += k;
                }
                // Check divisor n/k (avoid double-counting perfect squares)
                int other = n / k;
                if (other != k && isSortable(nums, other)) {
                    sum += other;
                }
            }
        }
        
        return sum;
    }
    
    private boolean isSortable(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        
        // For each subarray of length k
        for (int start = 0; start < n; start += k) {
            // Get the sorted rotation of this subarray
            int[] sorted = getSortedRotation(nums, start, k);
            if (sorted == null) return false;  // This subarray can't be sorted via rotation
            
            // Copy to result array
            for (int i = 0; i < k; i++) {
                result[start + i] = sorted[i];
            }
        }
        
        // Check if entire result array is sorted
        for (int i = 0; i < n - 1; i++) {
            if (result[i] > result[i + 1]) return false;
        }
        return true;
    }
    
    private int[] getSortedRotation(int[] nums, int start, int k) {
        // Extract subarray
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = nums[start + i];
        }
        
        if (k <= 1) return arr;
        
        // Count break points (where arr[i] > arr[i+1] cyclically)
        int breaks = 0;
        int breakPos = -1;
        
        for (int i = 0; i < k; i++) {
            if (arr[i] > arr[(i + 1) % k]) {
                breaks++;
                breakPos = i;
                if (breaks > 1) return null;  // Can't be rotation of sorted
            }
        }
        
        // 0 breaks = already sorted
        if (breaks == 0) return arr;
        
        // 1 break: rotate from breakPos+1
        int startIdx = (breakPos + 1) % k;
        int[] rotated = new int[k];
        for (int i = 0; i < k; i++) {
            rotated[i] = arr[(startIdx + i) % k];
        }
        
        // Verify it's actually sorted
        for (int i = 0; i < k - 1; i++) {
            if (rotated[i] > rotated[i + 1]) return null;
        }
        
        return rotated;
    }
}