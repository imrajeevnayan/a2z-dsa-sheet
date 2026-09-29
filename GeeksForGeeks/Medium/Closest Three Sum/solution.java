import java.util.Arrays;

class Solution {
    public int closest3Sum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);

        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(currentSum - target);

                // KEY CHANGE: 
                // 1. Agar naya diff chota hai -> Update
                // 2. Agar diff barabar hai BUT currentSum bada hai -> Update (Max sum on tie)
                if (diff < minDiff || (diff == minDiff && currentSum > closestSum)) {
                    minDiff = diff;
                    closestSum = currentSum;
                }

                // Standard Two Pointer Movement
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // Exact match mil gaya. 
                    // Since we want MAX sum on tie, and exact match has diff=0 (best possible),
                    // we can only return immediately if we are sure no other triplet 
                    // also has diff=0 with a LARGER sum.
                    // But wait! If currentSum == target, diff is 0. 
                    // Can there be another triplet with sum == target but LARGER value? 
                    // No, because sum == target means sum IS target. All exact matches have same sum.
                    // So we can safely return.
                    return target;
                }
            }
        }

        return closestSum;
    }
}