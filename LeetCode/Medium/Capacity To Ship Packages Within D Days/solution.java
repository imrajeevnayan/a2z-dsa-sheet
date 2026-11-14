class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight); // minimum possible capacity
            high += weight;              // maximum possible capacity
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(weights, days, mid)) {
                high = mid - 1; // try smaller capacity
            } else {
                low = mid + 1;  // need larger capacity
            }
        }

        return low; // first valid capacity
    }

    private boolean isPossible(int[] weights, int days, int capacity) {
        int requiredDays = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return requiredDays <= days;
    }
}