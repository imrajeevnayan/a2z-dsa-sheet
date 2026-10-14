class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = k - 1; i >= 0; i--) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}