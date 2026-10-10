class Solution {
    public static int maxConsecutiveOnes(int n) {
        int count = 0;

        // Each iteration removes one '1' from every consecutive group
        while (n != 0) {
            n = n & (n << 1);
            count++;
        }

        return count;
    }
}