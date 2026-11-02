class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() &&
                   freq.get(st.peek()) <= freq.get(arr[i])) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int x : ans) {
            res.add(x);
        }

        return res;
    }
}