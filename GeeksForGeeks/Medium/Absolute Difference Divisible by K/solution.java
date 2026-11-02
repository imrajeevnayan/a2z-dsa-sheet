class Solution {
    public int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            int rem = num % k;
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }

        long ans = 0;

        for (int f : freq.values()) {
            ans += (long) f * (f - 1) / 2;
        }

        return (int) ans;
    }
}