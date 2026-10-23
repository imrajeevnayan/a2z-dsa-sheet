import java.math.BigInteger;

class Solution {
    public int findMaxProduct(int[] arr) {

        int MOD = 1000000007;

        int n = arr.length;

        if (n == 1)
            return arr[0];

        int countNeg = 0;
        int countZero = 0;
        int maxNeg = Integer.MIN_VALUE;

        BigInteger product = BigInteger.ONE;

        for (int x : arr) {

            if (x == 0) {
                countZero++;
                continue;
            }

            if (x < 0) {
                countNeg++;
                maxNeg = Math.max(maxNeg, x);
            }

            product = product.multiply(BigInteger.valueOf(x));
        }

        if (countZero == n)
            return 0;

        if (countNeg == 1 && countZero + countNeg == n)
            return 0;

        if ((countNeg & 1) == 1) {
            product = product.divide(BigInteger.valueOf(maxNeg));
        }

        BigInteger mod = BigInteger.valueOf(MOD);

        return product.mod(mod).intValue();
    }
}
