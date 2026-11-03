class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;

        int xorVal = 0;

        // XOR of first window
        for (int i = 0; i < k; i++) {
            xorVal ^= arr[i];
        }

        int maxXor = xorVal;

        // Slide the window
        for (int i = k; i < n; i++) {
            xorVal ^= arr[i - k];
            xorVal ^= arr[i];

            maxXor = Math.max(maxXor, xorVal);
        }

        return maxXor;
    }
}