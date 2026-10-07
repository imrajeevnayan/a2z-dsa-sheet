import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxPair(int[] arr) {
        // Map: Key = Digit Sum, Value = int[2] (Top 2 largest numbers for that sum)
        Map<Integer, int[]> map = new HashMap<>();
        int maxSum = -1;

        for (int num : arr) {
            int dSum = getDigitSum(num);

            // Agar ye digit sum pehle se map mein hai
            if (map.containsKey(dSum)) {
                int[] topTwo = map.get(dSum);

                // Current number ko top 2 mein fit karne ki logic
                if (num > topTwo[0]) {
                    topTwo[1] = topTwo[0];
                    topTwo[0] = num;
                } else if (num > topTwo[1]) {
                    topTwo[1] = num;
                }

                // Update global max sum using the two largest numbers found so far
                // Note: topTwo[1] might still be 0 if only one element existed before, 
                // but since we are updating after checking, it's safe if we initialize properly.
                // Actually, let's ensure we only sum if we have at least 2 elements.
                if (topTwo[1] != 0) { 
                     maxSum = Math.max(maxSum, topTwo[0] + topTwo[1]);
                }
            } else {
                // Nayi entry: Pehla number sabse bada hai, dusra 0 (placeholder)
                map.put(dSum, new int[]{num, 0});
            }
        }

        // Agar koi valid pair nahi mila toh -1 return karna chahiye ya 0? 
        // Problem statement says Output 0 if no pair.
        return maxSum == -1 ? 0 : maxSum;
    }

    // Helper function to calculate sum of digits
    private int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}