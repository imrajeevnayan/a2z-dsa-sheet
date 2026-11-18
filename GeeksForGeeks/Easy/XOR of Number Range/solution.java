class Solution {

    private int xorTillN(int n) {
        switch (n % 4) {
            case 0: return n;
            case 1: return 1;
            case 2: return n + 1;
            default: return 0;
        }
    }

    public int findXOR(int l, int r) {
        return xorTillN(r) ^ xorTillN(l - 1);
    }
}