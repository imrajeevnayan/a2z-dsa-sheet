class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        
        // Min Heap: [value, row, col]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Step 1: First row ke saare elements add karo
        for (int col = 0; col < n; col++) {
            pq.offer(new int[]{matrix[0][col], 0, col});
        }
        
        // Step 2: k-1 times pop karo (kth element chahiye)
        for (int i = 0; i < k - 1; i++) {
            int[] curr = pq.poll();
            int row = curr[1];
            int col = curr[2];
            
            // Neeche wala element push karo (if exists)
            if (row + 1 < n) {
                pq.offer(new int[]{matrix[row + 1][col], row + 1, col});
            }
        }
        // Step 3: kth pop = answer
        return pq.poll()[0];
    }
}