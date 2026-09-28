class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;

        // Convert array to list because size decreases after every merge
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        while (!isSorted(list)) {
            // Find adjacent pair with minimum sum
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge the pair
            list.set(index, minSum);
            list.remove(index + 1);

            operations++;
        }

        return operations;
    }

    private boolean isSorted(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
