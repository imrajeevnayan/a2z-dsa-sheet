class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];

        int[][] starts = new int[n][2];

        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0]; // start
            starts[i][1] = i;               // original index
        }

        Arrays.sort(starts, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            int target = intervals[i][1];

            int left = 0, right = n - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (starts[mid][0] >= target) {
                    ans = starts[mid][1];
                    right = mid - 1; // search for smaller valid start
                } else {
                    left = mid + 1;
                }
            }

            result[i] = ans;
        }

        return result;
    }
}