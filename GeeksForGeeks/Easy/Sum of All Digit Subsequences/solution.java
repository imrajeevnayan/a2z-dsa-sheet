class Solution {
    static final long MOD = 1000000007L;

    public int subsequenceSum(String s) {
        int n = s.length();

        long digitSum = 0;
        for (int i = 0; i < n; i++) {
            digitSum = (digitSum + (s.charAt(i) - '0')) % MOD;
        }

        long power = modPow(2, n - 1);

        return (int)((digitSum * power) % MOD);
    }

    private long modPow(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}