class Solution {
    public int minimumSum(int num) {

        int[] digits = new int[4];

        // Number ke digits nikal lo
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        // Digits sort karo
        Arrays.sort(digits);

        // Alternate digits se 2 numbers banao
        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];

        return new1 + new2;
    }
}