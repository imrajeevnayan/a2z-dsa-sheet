class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int m = queries.length;
        int[][] qs = new int[m][2];

        for (int i = 0; i < m; i++) {
            qs[i][0] = queries[i];
            qs[i][1] = i;
        }

        Arrays.sort(qs, (a, b) -> Integer.compare(a[0], b[0]));

        int[] ans = new int[m];
        int[] freq = new int[n + 1];

        int left = 0, right = 0;
        int activeServers = 0;

        for (int[] q : qs) {
            int time = q[0];

            // Add logs with timestamp <= time
            while (right < logs.length && logs[right][1] <= time) {
                int server = logs[right][0];

                if (freq[server] == 0) {
                    activeServers++;
                }

                freq[server]++;
                right++;
            }

            // Remove logs with timestamp < (time - x)
            while (left < right && logs[left][1] < time - x) {
                int server = logs[left][0];

                freq[server]--;

                if (freq[server] == 0) {
                    activeServers--;
                }

                left++;
            }

            ans[q[1]] = n - activeServers;
        }

        return ans;
    }
}