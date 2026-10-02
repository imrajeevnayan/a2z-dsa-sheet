class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxSum = 0;

        // Start from the largest element
        int i = n - 1;
        while (i > 0) {
            // Check if current and previous element can form a valid pair
            if (arr[i] - arr[i - 1] < k) {
                // Valid pair found! Add sum and skip both elements
                maxSum += arr[i] + arr[i - 1];
                i -= 2;
            } else {
                // Current element cannot pair with anyone to its left
                // (difference already too big with closest neighbor)
                i -= 1;
            }
        }

        return maxSum;
    }
}