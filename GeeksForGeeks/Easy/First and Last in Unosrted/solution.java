class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        ArrayList<Integer> ans = new ArrayList<>();

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        ans.add(first);
        ans.add(last);

        return ans;
    }
}