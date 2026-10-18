class Solution {

    public List<Integer> findAllIntegers(int n) {

        List<Integer> ans = new ArrayList<>();

        long low = 0;
        long high = 5L * (n + 1);

        while (low <= high) {

            long mid = low + (high - low) / 2;
            long zeros = countZeros(mid);

            if (zeros < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // low = first number jiske factorial me >= n zeros hain
        if (countZeros(low) != n) {
            return ans; // empty list
        }

        for (int i = 0; i < 5; i++) {
            ans.add((int)(low + i));
        }

        return ans;
    }

    // x! me trailing zeros count karo
    private long countZeros(long x) {

        long cnt = 0;

        while (x > 0) {
            x /= 5;
            cnt += x;
        }

        return cnt;
    }
}