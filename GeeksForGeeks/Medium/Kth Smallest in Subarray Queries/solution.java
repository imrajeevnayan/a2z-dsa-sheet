class Solution {

    ArrayList<Integer>[] tree;
    int[] arr;
    int n;

    void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = new ArrayList<>();
            tree[node].add(arr[start]);
            return;
        }

        int mid = (start + end) / 2;

        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j))
                res.add(a.get(i++));
            else
                res.add(b.get(j++));
        }

        while (i < a.size())
            res.add(a.get(i++));

        while (j < b.size())
            res.add(b.get(j++));

        return res;
    }

    int countLessEqual(int node, int start, int end,
                       int l, int r, int val) {

        if (r < start || end < l)
            return 0;

        if (l <= start && end <= r) {
            return upperBound(tree[node], val);
        }

        int mid = (start + end) / 2;

        return countLessEqual(2 * node, start, mid, l, r, val)
                + countLessEqual(2 * node + 1, mid + 1, end, l, r, val);
    }

    int upperBound(ArrayList<Integer> list, int x) {
        int lo = 0, hi = list.size();

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (list.get(mid) <= x)
                lo = mid + 1;
            else
                hi = mid;
        }

        return lo;
    }

    public ArrayList<Integer> findQuery(int[] arr, int[][] queries) {

        this.arr = arr;
        n = arr.length;

        tree = new ArrayList[4 * n];

        build(1, 0, n - 1);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {

            int l = q[0] - 1;
            int r = q[1] - 1;
            int k = q[2];

            int low = 1;
            int high = n;

            int res = 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                int cnt = countLessEqual(
                        1, 0, n - 1,
                        l, r, mid
                );

                if (cnt >= k) {
                    res = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            ans.add(res);
        }

        return ans;
    }
}