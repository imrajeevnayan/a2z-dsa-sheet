class Solution {
    public List<Integer> maximizeArray(int[] a, int[] b) {

        int n = a.length;

        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int x : a) set.add(x);
        for (int x : b) set.add(x);

        HashSet<Integer> keep = new HashSet<Integer>();

        Iterator<Integer> it = set.descendingIterator();

        int cnt = 0;
        while (it.hasNext() && cnt < n) {
            keep.add(it.next());
            cnt++;
        }

        List<Integer> ans = new ArrayList<Integer>();

        for (int x : b) {
            if (keep.contains(x)) {
                ans.add(x);
                keep.remove(x);
            }
        }

        for (int x : a) {
            if (keep.contains(x)) {
                ans.add(x);
                keep.remove(x);
            }
        }

        return ans;
    }
}