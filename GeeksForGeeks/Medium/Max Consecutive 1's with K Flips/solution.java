class Solution {
    public int maxOnes(int arr[], int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            // Agar 0 mila, toh count badhao
            if (arr[right] == 0) {
                zeroCount++;
            }

            // Agar zeros ki count k se zyada ho gayi, toh window shrink karo
            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Current window ki length calculate karo
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}