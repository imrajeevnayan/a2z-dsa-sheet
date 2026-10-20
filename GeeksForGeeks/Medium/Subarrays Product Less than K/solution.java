class Solution {
    public int countSubarray(int[] arr, int k) {
         if (k <= 1) return 0;

                int left = 0;
                int product = 1;
                int count = 0;

                for (int right = 0; right < arr.length; right++) {
                    // Expand window
                    product *= arr[right];

                    // Shrink window if product becomes >= k
                    while (product >= k) {
                        product /= arr[left];
                        left++;
                    }
                    // Add number of valid subarrays ending at 'right'
                    count += (right - left + 1);
                }

                return count;
    }
}