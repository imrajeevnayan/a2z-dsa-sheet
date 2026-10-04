class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // Step 1: Compute all A+B sums with frequency
        Map<Integer, Integer> abMap = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                abMap.merge(sum, 1, Integer::sum);
            }
        }
        
        // Step 2: For each C+D, find complement in map
        int count = 0;
        for (int c : C) {
            for (int d : D) {
                int need = -(c + d);
                count += abMap.getOrDefault(need, 0);
            }
        }
        
        return count;
    }
}