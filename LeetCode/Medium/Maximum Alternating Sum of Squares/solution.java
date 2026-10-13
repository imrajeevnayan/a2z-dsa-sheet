class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        // Step 1: Absolute values le lo kyunki square negative ko positive bana deta hai
        int[] absNums = new int[n];
        for (int i = 0; i < n; i++) {
            absNums[i] = Math.abs(nums[i]);
        }
        
        // Step 2: Sort karo taaki smallest aur largest easily mil sakein
        Arrays.sort(absNums);
        
        long sum = 0;
        int left = 0;
        int right = n - 1;
        boolean isPositive = true;
        
        // Step 3: Alternate between largest and smallest
        while (left <= right) {
            if (isPositive) {
                // Largest available square add karo
                sum += (long) absNums[right] * absNums[right];
                right--;
            } else {
                // Smallest available square subtract karo
                sum -= (long) absNums[left] * absNums[left];
                left++;
            }
            isPositive = !isPositive;
        }
        
        return sum;
    }
}