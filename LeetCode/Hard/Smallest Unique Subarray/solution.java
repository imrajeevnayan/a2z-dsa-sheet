import java.util.*;

class Solution {
    private static final long MOD1 = 1_000_000_007L;
    private static final long MOD2 = 1_000_000_009L;
    private static final long BASE = 911382323L;

    private long[] pow1, pow2;
    private long[] pref1, pref2;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        pow1 = new long[n + 1];
        pow2 = new long[n + 1];
        pref1 = new long[n + 1];
        pref2 = new long[n + 1];

        pow1[0] = pow2[0] = 1;

        for (int i = 0; i < n; i++) {
            pow1[i + 1] = (pow1[i] * BASE) % MOD1;
            pow2[i + 1] = (pow2[i] * BASE) % MOD2;

            pref1[i + 1] = (pref1[i] * BASE + nums[i]) % MOD1;
            pref2[i + 1] = (pref2[i] * BASE + nums[i]) % MOD2;
        }

        int left = 1, right = n, ans = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (hasUnique(mid, n)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean hasUnique(int len, int n) {
        HashMap<Long, Integer> freq = new HashMap<>();

        for (int i = 0; i + len <= n; i++) {
            long key = getHash(i, i + len - 1);
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i + len <= n; i++) {
            long key = getHash(i, i + len - 1);
            if (freq.get(key) == 1) {
                return true;
            }
        }

        return false;
    }

    private long getHash(int l, int r) {
        int len = r - l + 1;

        long h1 = (pref1[r + 1]
                - (pref1[l] * pow1[len]) % MOD1
                + MOD1) % MOD1;

        long h2 = (pref2[r + 1]
                - (pref2[l] * pow2[len]) % MOD2
                + MOD2) % MOD2;

        return (h1 << 32) ^ h2;
    }
}