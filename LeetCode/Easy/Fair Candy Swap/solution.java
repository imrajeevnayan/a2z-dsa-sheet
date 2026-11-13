class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        for (int a : aliceSizes) {
            sumA += a;
        }

        for (int b : bobSizes) {
            sumB += b;
        }

        int diff = (sumB - sumA) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) {
            bobSet.add(b);
        }

        for (int a : aliceSizes) {
            int target = a + diff;

            if (bobSet.contains(target)) {
                return new int[]{a, target};
            }
        }

        return new int[0];
    }
}
