class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;

        long totalPairs = (long) n * (n - 1) / 2;
        long goodPairs = 0;

        HashMap<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;

            goodPairs += map.getOrDefault(key, 0L);

            map.put(key, map.getOrDefault(key, 0L) + 1);
        }

        return totalPairs - goodPairs;
    }
}