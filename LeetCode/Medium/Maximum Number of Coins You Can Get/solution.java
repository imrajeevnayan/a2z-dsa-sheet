class Solution {
    public int maxCoins(int[] piles) {

        Arrays.sort(piles);

        int n = piles.length;
        int ans = 0;

        // Aap total n/3 baar coin loge
        int rounds = n / 3;

        int idx = n - 2; // Alice ke largest ke just pehle

        while (rounds-- > 0) {
            ans += piles[idx];

            // Agle round ke liye 2 step left
            idx -= 2;
        }

        return ans;
    }
}