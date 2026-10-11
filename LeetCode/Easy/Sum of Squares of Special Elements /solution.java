class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        // 1-based index ke liye loop 1 se start karo
        for (int i = 1; i <= n; i++) {
            // Check karo ki kya current index 'n' ko divide karta hai
            if (n % i == 0) {
                // Array 0-indexed hai, isliye (i-1) use karo access karne ke liye
                int val = nums[i - 1];
                sum += val * val;
            }
        }
        
        return sum;
    }
}