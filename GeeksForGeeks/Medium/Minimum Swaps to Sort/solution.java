class Solution {
    public int minSwaps(int arr[]) {

        int n = arr.length;

        // Store {value, original index}
        int[][] nums = new int[n][2];

        for (int i = 0; i < n; i++) {
            nums[i][0] = arr[i];
            nums[i][1] = i;
        }

        // Sort according to value
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        // visited[i] = true means this index is already processed
        boolean[] visited = new boolean[n];

        int swaps = 0;

        for (int i = 0; i < n; i++) {

            // Already visited or already in correct position
            if (visited[i] || nums[i][1] == i) {
                continue;
            }

            // Find cycle
            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {

                visited[j] = true;

                // Move to the original index of current element
                j = nums[j][1];

                cycleLength++;
            }

            // A cycle of length L needs L - 1 swaps
            swaps += cycleLength - 1;
        }

        return swaps;
    }
}
