class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : arr) pq.add(n);
    
        while (k > 1) {
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}
