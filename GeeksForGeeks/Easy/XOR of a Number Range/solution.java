class Solution {
    public static int findXOR(int l, int r) {
        return xorFromZero(r) ^ xorFromZero(l - 1);
    }

    private static int xorFromZero(int n) {
        if (n < 0) return 0; // Edge case when l=0

        switch (n % 4) {
            case 0: return n;
            case 1: return 1;
            case 2: return n + 1;
            default: return 0; // case 3
        }
    }
}