class Solution {
    public int longestSubarrayDivK(int[] arr, int k) {
        int n = arr.length;

        // Har remainder ka first occurrence store karenge
        int[] first = new int[k];

        // -1 ka matlab hai ki remainder abhi tak nahi mila
        java.util.Arrays.fill(first, -1);

        // Array start hone se pehle prefix sum = 0
        // Isliye remainder 0 ki position 0 maanenge
        first[0] = 0;

        long prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            // Current element ko prefix sum mein add karo
            prefixSum += arr[i];

            // Prefix sum ka remainder nikalo
            int rem = (int) (prefixSum % k);

            // Java mein negative number ka remainder negative aa sakta hai
            // Isliye usko positive range [0, k-1] mein convert karo
            if (rem < 0) {
                rem += k;
            }

            // Agar same remainder pehle aa chuka hai,
            // to beech ka subarray sum k se divisible hoga
            if (first[rem] != -1) {
                // Current position - first occurrence = subarray length
                maxLen = Math.max(maxLen, (i + 1) - first[rem]);
            } else {
                // Sirf first occurrence store karo,
                // kyunki usse maximum length milegi
                first[rem] = i + 1;
            }
        }

        return maxLen;
    }
}
