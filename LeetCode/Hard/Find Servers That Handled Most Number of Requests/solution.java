class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        // available servers
        TreeSet<Integer> available = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        // {endTime, serverId}
        PriorityQueue<long[]> busy =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        int[] count = new int[k];

        for (int i = 0; i < arrival.length; i++) {

            // free completed servers
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                available.add((int) busy.poll()[1]);
            }

            // no server available
            if (available.isEmpty()) {
                continue;
            }

            int preferred = i % k;

            Integer server = available.ceiling(preferred);

            if (server == null) {
                server = available.first(); // wrap around
            }

            available.remove(server);

            count[server]++;

            busy.offer(new long[]{
                    (long) arrival[i] + load[i],
                    server
            });
        }

        int maxHandled = 0;

        for (int c : count) {
            maxHandled = Math.max(maxHandled, c);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count[i] == maxHandled) {
                ans.add(i);
            }
        }

        return ans;
    }
}