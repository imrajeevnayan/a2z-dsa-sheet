class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;

        long even = 1; // empty prefix sum = 0 (even)
        long odd = 0;
        long prefix = 0;
        long result = 0;

        for (int num : arr) {
            prefix += num;

            if (prefix % 2 == 0) {
                result += odd;
                even++;
            } else {
                result += even;
                odd++;
            }

            result %= MOD;
        }

        return (int) result;
    }
}