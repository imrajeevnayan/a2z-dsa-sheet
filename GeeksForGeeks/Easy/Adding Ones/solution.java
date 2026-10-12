
class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {
        int[] freq = new int[n + 1];

        // Frequency count karo
        for (int j : updates) {
            freq[j]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int currentSum = 0;

        // Prefix Sum calculate karo (Left to Right)
        for (int i = 1; i <= n; i++) {
            currentSum += freq[i];
            ans.add(currentSum);
        }

        return ans;
    }
}