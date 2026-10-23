class Solution {
    public List<Integer> findPairs(int[] arr) {

        int n = arr.length;

        HashMap<Integer, int[]> map = new HashMap<>();

        List<Integer> ans = null;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int sum = arr[i] + arr[j];

                if (!map.containsKey(sum)) {

                    map.put(sum, new int[]{i, j});

                } else {

                    int[] p = map.get(sum);

                    int a = p[0];
                    int b = p[1];
                    int c = i;
                    int d = j;

                    // all indices must be distinct
                    if (a != c && a != d &&
                        b != c && b != d) {

                        List<Integer> curr =
                            Arrays.asList(a, b, c, d);

                        if (ans == null ||
                            isSmaller(curr, ans)) {
                            ans = curr;
                        }
                    }
                }
            }
        }

        if (ans == null) {
            return Arrays.asList(-1, -1, -1, -1);
        }

        return ans;
    }

    private boolean isSmaller(List<Integer> a,
                              List<Integer> b) {

        for (int i = 0; i < 4; i++) {

            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) < b.get(i);
            }
        }

        return false;
    }
}