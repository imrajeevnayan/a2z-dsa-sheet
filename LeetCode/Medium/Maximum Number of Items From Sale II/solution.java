class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        
        int cheapest = Integer.MAX_VALUE;
        int maxFactor = Integer.MIN_VALUE;
        
        for (int[] item : items) {
            cheapest = Math.min(cheapest, item[1]);
            maxFactor = Math.max(maxFactor, item[0]);
        }
        
        int[] freq = new int[maxFactor + 1];
        
        for (int[] item : items) {
            freq[item[0]]++;
        }
        
        for (int i = 1; i <= maxFactor; i++) {
            if (freq[i] > 0) {
                for (int multiple = 2 * i; multiple <= maxFactor; multiple += i) {
                    freq[i] += freq[multiple];
                }
            }
        }
        
        TreeMap<Long, Long> costCount = new TreeMap<>();
        
        for (int[] item : items) {
            int cost = item[1];
            int count = freq[item[0]] - 1;
            
            if (count > 0 && cost <= 2L * cheapest) {
                costCount.put(
                    (long) cost,
                    costCount.getOrDefault((long) cost, 0L) + count
                );
            }
        }
        
        int total = 0;
        
        for (Map.Entry<Long, Long> entry : costCount.entrySet()) {
            long cost = entry.getKey();
            long count = entry.getValue();
            
            long include = Math.min(count, budget / cost);
            
            total += (int) (2 * include);
            budget -= (int) (include * cost);
        }
        
        total += budget / cheapest;
        
        return total;
    }
}