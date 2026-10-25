class Solution {
    public int maxOccured(List<Integer> L, List<Integer> R) {

        int maxRange = 0;

        // Maximum R find karo
        for (int x : R) {
            maxRange = Math.max(maxRange, x);
        }

        int[] freq = new int[maxRange + 2];

        // Difference array fill karo
        for (int i = 0; i < L.size(); i++) {

            freq[L.get(i)]++;

            freq[R.get(i) + 1]--;
        }

        int maxFreq = freq[0];
        int ans = 0;

        // Prefix sum aur maximum frequency find karo
        for (int i = 1; i < freq.length; i++) {

            freq[i] += freq[i - 1];

            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}