class Solution {
    public int countSubarrays(int[] arr, int k) {
        // Exactly K = AtMost(K) - AtMost(K-1)
        return atMostK(arr, k) - atMostK(arr, k - 1);
    }

    private int atMostK(int[] arr, int k) {
        if (k < 0) return 0;

        int left = 0;
        int count = 0;
        int oddCount = 0;

        for (int right = 0; right < arr.length; right++) {
            // Agar current element odd hai, toh count badhao
            if (arr[right] % 2 != 0) {
                oddCount++;
            }

            // Jab tak oddCount k se zyada hai, left pointer ko aage badhao
            while (oddCount > k) {
                if (arr[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }

            // Current window [left...right] mein saare subarrays valid hain
            // Jo right pe end hote hain. Unki count = right - left + 1
            count += (right - left + 1);
        }

        return count;
    }
}