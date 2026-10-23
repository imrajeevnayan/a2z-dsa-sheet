import java.math.BigInteger;

class Solution {
    public String findNth(String n) {

        BigInteger num = new BigInteger(n);
        BigInteger nine = BigInteger.valueOf(9);

        StringBuilder ans = new StringBuilder();

        while (num.compareTo(BigInteger.ZERO) > 0) {

            BigInteger[] divRem = num.divideAndRemainder(nine);

            ans.append(divRem[1]);
            num = divRem[0];
        }

        return ans.reverse().toString();
    }
}