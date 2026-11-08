class Solution {
    public int minTime(int n, int s1, int s2) {
        long low = 0;
        long high = 1L * Math.min(s1, s2) * n;

        while (low < high) {
            long mid = low + (high - low) / 2;

            long docs = mid / s1 + mid / s2;

            if (docs >= n) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }
}