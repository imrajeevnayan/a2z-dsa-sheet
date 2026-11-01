class Solution {
    int minSwap(int[] arr, int k) {
        int n = arr.length;

        // Count good elements
        int good = 0;
        for (int num : arr) {
            if (num <= k) {
                good++;
            }
        }

        // Count bad elements in first window
        int bad = 0;
        for (int i = 0; i < good; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int ans = bad;

        // Sliding window
        int i = 0, j = good;
        while (j < n) {

            // Remove outgoing element
            if (arr[i] > k) {
                bad--;
            }

            // Add incoming element
            if (arr[j] > k) {
                bad++;
            }

            ans = Math.min(ans, bad);

            i++;
            j++;
        }

        return ans;
    }
}