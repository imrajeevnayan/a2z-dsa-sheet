class Solution {
    public int countIncreasing(int[] arr) {
        int n = arr.length;
        if (n < 2) return 0;

        long count = 0;
        int left = 0;

        for (int right = 1; right < n; right++) {
            // Check if current element continues the increasing sequence
            if (arr[right] <= arr[right - 1]) {
                // Sequence broken, start new window from current element
                left = right;
            }

            // Current window is [left...right]
            // Length of window = right - left + 1
            // Number of subarrays ending at 'right' with length >= 2 is:
            // (right - left + 1) - 1 = right - left

            count += (right - left);
        }

        return (int) count;
    }
}